import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hilos {

    public static void main(String[] args) throws IOException {


        Runnable r = new MemberCreator();
        Runnable r2 = new MemberMonito();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
            t.start();
            t2.start();


    }
}
