import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

class MemberCreator implements Runnable {

    public void run() {
        File file= new File("mails.txt");


        try {


            for (int i = 1; i < 4; i++) {
            Thread.sleep(10000);

                double  number=Math.round(Math.random()*20);
                String line=String.valueOf(number)+"\n";
                Files.write(Paths.get("mails.txt"), line.getBytes(), StandardOpenOption.APPEND);




            System.out.println("gmail añadido ");}
        } catch (InterruptedException | IOException e) {
            System.out.println("se a liao ");

        }

    }

}
