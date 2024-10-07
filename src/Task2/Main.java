package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ///UNIDIMENSIONAL
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti nr de elemente in array A-> ");
        int j = sc.nextInt();

        if (j <= 0) {
            System.out.println("Numarul de elemente trebuie sa fie mai mare decat 0.");
            return;
        }

        int[] intArray = new int[j];
        int suma = 0;
        int pare = 0;
        int impare = 0;

        System.out.print("Introduceti valorile in array A-> \n");
        for (int i = 0; i < j; i++) {
            System.out.print("A[" + i + "] = ");
            intArray[i] = sc.nextInt();
            suma += intArray[i];
            if (intArray[i] % 2 == 0 ) {
                pare++;
            } else {
                impare++;
            }
        }

        System.out.println("In array introdus sunt " + pare + " numere pare");
        System.out.println("In array introdus sunt " + impare + " numere impare");
        System.out.println("Suma tuturor valorilor din array este : " + suma);
        System.out.println("Media tuturor valorilor din array este : " + (suma / (double) j));




        ////BIDIMENSIONAL

                System.out.print("Introduceti nr de linii in array A-> ");
                int rows = sc.nextInt();
                System.out.print("Introduceti nr de coloane in array A-> ");
                int cols = sc.nextInt();

                if (rows <= 0 || cols <= 0) {
                    System.out.println("Numarul de linii si coloane trebuie sa fie mai mare decat 0.");
                    return;
                }

                int[][] intArrayB= new int[rows][cols];
                suma = 0;
                pare = 0;
                impare = 0;

                System.out.print("Introduceti valorile in array A-> \n");
                for (int a = 0; a < rows; a++) {
                    for (int b = 0; b < cols; b++) {
                        System.out.print("A[" + a + "][" + b + "] = ");
                        intArrayB[a][b] = sc.nextInt();
                        suma += intArrayB[a][b];
                        if (intArrayB[a][b] % 2 == 0) {
                            pare++;
                        } else {
                            impare++;
                        }
                    }
                }

                System.out.println("\nIn array introdus sunt " + pare + " numere pare");
                System.out.println("In array introdus sunt " + impare + " numere impare");
                System.out.println("Suma tuturor valorilor din array este : " + suma);
                System.out.println("Media tuturor valorilor din array este : "+ (suma / (double) (rows * cols)));

                sc.close();
            }
        }


