package Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti nr de elemente in array A-> ");
        int j = sc.nextInt();
        if (j <= 0) {
            System.out.println("Numarul de elemente trebuie sa fie mai mare decat 0.");
            return;
        }
        int[] intArray = new int[j];
        System.out.print("Introduceti valorile in array A-> \n");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("A["+i+"] = ");
            intArray[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Array A are urmatoarele valori :");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
        sc.close();
    }
}
