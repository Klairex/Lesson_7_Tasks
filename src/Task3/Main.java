package Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente in array original: ");
        int j = sc.nextInt();
        int[] intArray = new int[j];
        System.out.println("Introduceti valorile in array:");
        for (int i = 0; i < j; i++) {
            System.out.print("A[" + i + "] = ");
            intArray[i] = sc.nextInt();
        }
        System.out.print("Introduceti numarul de elemente in array copiat: ");
        int k = sc.nextInt();
        int[] intArrayCopy = new int[k];
        for (int i = 0; i < k; i++) {
            if (i < j) {
                intArrayCopy[i] = intArray[i];
            } else {
                intArrayCopy[i] = 0;
            }
        }
        System.out.println("\nArray original:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }

        System.out.println("\nArray copiat:");
        for (int i = 0; i < intArrayCopy.length; i++) {
            System.out.print(intArrayCopy[i]+" ");
        }


        sc.close();
    }
}
