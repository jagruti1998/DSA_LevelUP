package ArraysandVectors;
import java.util.Vector;

public class OneDVector {

    public static void main(String[] args) {

        // Create a new Vector named 'arr' to store integers
        Vector<Integer> arr = new Vector<>();

        // Add elements (2 and 3) to the Vector
        arr.add(2);
        arr.add(3);


        // Iterate through the elements in the Vector using enhanced for loop
        for(int number : arr){
            System.out.println(number);
        }
    }
}