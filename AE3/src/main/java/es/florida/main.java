package es.florida;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {


        while (!executorService.isTerminated()) {
            executorService.execute(new Creator());
            executorService.execute(new Monitor());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        /*Runnable mailcreator = new Monitor();


        Thread firstThread = new Thread(mailcreator);
        firstThread.start();*/


    }


}
