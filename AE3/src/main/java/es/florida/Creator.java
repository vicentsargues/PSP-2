package es.florida;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class Creator implements Runnable {


    public void addEmail() throws IOException {
        double number = Math.round(Math.random() * 20);
        String line = String.valueOf(number) + "\n";
        Files.write(Paths.get("mails.txt"), line.getBytes(), StandardOpenOption.APPEND);
        System.out.println(number);


    }

    @Override
    public void run() {
        File mails = null;
        if (mails == null) {
            mails = new File("mails.txt");
        }
        if (mails.exists()) {
            try {
                addEmail();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

