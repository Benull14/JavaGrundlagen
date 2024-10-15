import java.util.ArrayList;
import java.util.HashMap;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Array Durchlauf");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index: " + i + ", Nummer: " + nums[i]);
        }

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrix Durchlauf");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Index vom Äußeren Array: " + i + ", index vom Inneren Array: " + j + ", Zahl ist: " + matrix[i][j]);
            }

        }

        //ArrayList
        System.out.println("ArrayList Beispie");
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Kyrill");
        namen.add("Daniela");
        System.out.println("Namen in der Liste: " + namen);
        System.out.println(namen.get(1));


        //HashMap
        System.out.println("HashMap-Beispiel");
        HashMap<String, Integer> alterMap = new HashMap<>();
        alterMap.put("Kyrill", 22);
        alterMap.put("Daniela", 24);
        System.out.println("AlterMap: " + alterMap);
        System.out.println("\n Danielas Alter ist: " + alterMap.get("Daniela"));






    }

}
