package ArraysandVectors;

import java.util.Vector;

public class TwoDVector {

    public static void main(String[] args) {

        // Create a 2D Vector using Vector of Vectors
        Vector <Vector<Integer> > arr = new Vector<>();

        // Create a new Vector and add elements to it
        Vector<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(3);

        // Create another new Vector and add elements to it
        Vector<Integer> v2 = new Vector<>();
        v2.add(4);


        // Add the created Vectors (v1 and v2) to the main 2D Vector (arr)
        arr.add(v1);
        arr.add(v2);


        // Iterate through the 2D Vector and print its elements
        for(int i=0;i< arr.size(); i++){

            for(int number : arr.get(i)){
                System.out.print(number + ", ");
            }
            System.out.println();
        }

    }
}