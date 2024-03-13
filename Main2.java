import java.util.ArrayList;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        
    ArrayList<String> pi = new ArrayList<>();
    pi.add("Rohit");
    pi.add("Sharma");
    pi.add("way");
    pi.add("has");
    pi.add("can");

    // System.out.println(pi);
    System.out.println("=========ORIGINAL VALUE============================");
    for(String ArrayList:pi){
        System.out.println(ArrayList);
    }
System.out.println("-------------ReVERSE-----------------------------");

    for(int i=pi.size()-1;i>=0;i--){
        String list2=pi.get(i);
        System.out.println(list2);
    }
}
    }
    

