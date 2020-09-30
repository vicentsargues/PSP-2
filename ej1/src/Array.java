import java.util.*;


public class Array {
    public static void main(String[] args) {
        String[] names = new String[]{ "Amoret","Vicent","Jordi","Manuel","Adrian","Andresage" };

        for(int i = 0;i< names.length;i++){
            System.out.println(names[i]);
        }


        List<String> names2 = new ArrayList<String>();
        names2.add("Juan");
        names2.add("Pedro");
        names2.add("José");
        names2.add("María");
        names2.add("Sofía");

        for(int i = 0;i< names2.size();i++){
            System.out.println(names2.get(i));
        }


    }
}
