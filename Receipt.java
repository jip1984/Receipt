import java.util.Arrays;

public class Receipt {
    public static void main(String[] args) {

        //Task 1: Create two arrays (see Workbook article)

        String[] apples = {"Gala","Granny Smith"," Macintosh"};
        Double[] price = {1.99, 1.49,1.29};

        System.out.println("Here's your receipt:\n");
        for(int i=0; i < 3; i++){
            System.out.println("Apple:" + apples[i] + "Price: $" + price[i]);
        }
        /* Task 2
            Use a for loop to print each apple and the corresponding price.
            
            for {
                println(\t<apple i >: $<price i >)
            }
        */
    }
}