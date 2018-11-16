import java.util.Arrays;
import java.util.Random;

public
    class s19622_zestaw06 {

    public static void main(String[] args) {
        cw_02();
    }

    /*
    I. Dana jest dwuwymiarowa tablica zmiennych typu double opisująca
    położenie punktu w przestrzeni, oraz taka sama dwuwymiarowa
    tablica obrot.

    Wykonaj operację wyliczenia wartości tablicy rezultat przyjmując że
    wynikiem elementu 0, 0 jest suma mnożeń elementów z zerowego wiersza
    tablicy obrót z elementami z zerowej kolumny.
     */

    static public void cw_01() {

        double[][] punkt = {
            {1},
            {0},
            {0}
        };
        double[][] obrot = {
            {0, -1, 0},
            {1, 0, 0},
            {0, 0, 1}
        };
        double[][] rezultat = new double[3][1];

        for(int i = 0; i<obrot.length; i++) {
            int sum = 0;
            for (int j = 0; j<punkt.length; j++) {
                sum += obrot[i][j] * punkt[j][0];
            }
            rezultat[i][0] = sum;
            System.out.println("rezultat " + i + ": " + rezultat[i][0]);
        }
    }

    /*
    Utwórz dwuwymiarową tablicę zmiennych typu int o rozmiarach 10 na 10
    i wypełnij ją losowymi liczbami. Następnie znajdź taki element tej
    tablicy, którego suma elementów sąsiadujących jest największa.
     */

    static public void cw_02() {

        int[][] array = new int[10][10];

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<array.length; i++) {
            System.out.print("Array " + i + ": ");
            for(int j=0; j<array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

        int sum;
        int bigSum = 0;
        int myIndexI = 0;
        int myIndexJ = 0;

        for(int i=0; i<array.length; i++) {
            System.out.print("suma wynosi: ");
            for(int j=0; j<array.length; j++) {
                if (j == 0) {
                    sum = array[i][j+1];
                }
                else if (j == array.length - 1) {
                    sum = array[i][j-1];
                }
                else {
                    sum = array[i][j-1] + array[i][j+1];
                }
                System.out.print(sum + ", ");
                if (sum > bigSum) {
                    bigSum = sum;
                    myIndexI = i;
                    myIndexJ = j;
                }
            }
            System.out.println();
            System.out.println("myIndex: " + myIndexI + ", " + myIndexJ);
        }

        System.out.println("The biggest sum is in element with index: " + myIndexI + ", " + myIndexJ);
    }
}