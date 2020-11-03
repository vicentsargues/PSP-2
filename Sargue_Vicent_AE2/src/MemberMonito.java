import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberMonito implements Runnable{


int cant=readline("mails.txt").size();
int cant2;
String gmail;

    public MemberMonito() throws IOException {
    }


    public List<String> readline(String filename) throws IOException {
        List<String> result = new ArrayList<>();
        FileReader reader = new FileReader(filename);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while((line=bReader.readLine()) != null){
            result.add(line);

        }
    return result;
}


public void MailSender(String mail ) throws IOException {
    int posi = readline("mails.txt").size();
    for (int i = 0; i < (posi-1); i++) {

        System.out.println(" Le informamos del nuevo usuario : " + mail);
    }
}

    public void run() {

        try {


            for (int i = 0; i < 10; i++) {
                Thread.sleep(3000);

                System.out.println(readline("mails.txt").size());
                //comprobar que tenemos un nuevo gmail
                cant2 = readline("mails.txt").size();
                if (cant < cant2) {
                    while (cant < cant2) {
                        gmail = readline("mails.txt").get(cant);
                        MailSender(gmail);

                        cant++;
                    }
                    cant = cant2;
                }
            }

        }
        catch (InterruptedException | IOException e){


        }
    }



    }





