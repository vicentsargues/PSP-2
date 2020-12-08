package es.florida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.mail.*;

public class Sender implements Runnable {
    public List<String> readline(String file) throws IOException {

        List<String> result = new ArrayList<>();
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);
        String line;

        while ((line = bReader.readLine()) != null) {
            result.add(line);

        }

        return result;

    }

    @Override
    public void run() {
        try {
            Integer sizeFile = readline("mails.txt").size();
            List<String> mailsFile = new ArrayList<String>();
            mailsFile = readline("mails.txt");
            for (int i = 0; i < sizeFile - 1; i++) {
                System.out.println(mailsFile.get(i) + " Se ha unido " + mailsFile.get(sizeFile - 1));

                Email email = new SimpleEmail();
                email.setHostName("127.0.0.1:1080");
                email.setSmtpPort(1025);


                email.setSSLOnConnect(true);
                try {
                    email.setFrom("test@maildev.com");
                    email.setMsg(mailsFile.get(i) + " Se ha unido " + mailsFile.get(sizeFile - 1));
                    email.setSubject("TestMail");
                    email.addTo("foo@bar.com");
                    email.send();
                } catch (EmailException e) {
                    e.printStackTrace();
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
