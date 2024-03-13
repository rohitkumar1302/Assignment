import java.util.ArrayList;

public class AddEven {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
              
        array.add(22);
        array.add(12);
        array.add(80);
        array.add(60);
        array.add(50);

        System.out.println(array);
        int sum = 0;
        for(int i= 0; i< array.size(); i++){

            if (array.get(i) % 2 == 0 ) {
                
                sum += array.get(i);
                
            }
           
        }
        System.out.println(sum);
    }

}
