package es.florida;

import jdk.management.resource.internal.inst.ThreadRMHooks;
import sun.applet.Main;

import javax.swing.plaf.TableHeaderUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Monitor extends main implements Runnable {

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
        Integer provisionalSize = 0;
        for (int i = 0; i < 2; i++) {
            try {
                Integer sizeFile = readline("mails.txt").size();

                if (provisionalSize < sizeFile) {
                    executorService.execute(new Sender());

                    provisionalSize = sizeFile;


                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
