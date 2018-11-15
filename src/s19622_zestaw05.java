import java.util.Arrays;
import java.util.Random;

public
    class s19622_zestaw05 {

    public static void main(String[] args) {
        cw_04();
    }
    /*
    Dana jest jednowymiarowa tablica zmiennych typu char wypełniona
    elementami o losowych wartościach z przedziału od ’A’ do ’Z’.
    Napisz program tworzący tablicę o rozmiarze identycznym do danej tablicy
    i wypełnij ją tak, aby stanowiła lustrzane odbicie tablicy pierwotnej.
     */

    static public void cw_01() {

        String abc = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        Random r = new Random();
        int length = abc.length();
        char[] array = new char[10];

        System.out.println("Array random letters:");

        for (int i = 0; i < 10; i++) {
            array[i] = abc.charAt(r.nextInt(length));
            System.out.print(array[i] + ", ");
        }

        char[] arrayMirror = new char[10];

        System.out.println(" ");
        System.out.println("Array mirror:");

        for (int i = 0; i < arrayMirror.length; i++) {
            arrayMirror[i] = array[array.length - 1 - i];
            System.out.print(arrayMirror[i] + ", ");
        }
    }

    /*
    Dana jest tablica char[] tab = {’a’, ’b’, ’c’, ’e’, ’f’};
    Napisz program wyświetlający wszystkie elementy tej tablicy
    wraz z ich lewym i prawym sąsiadem, przyjmując że wychodząc
    poza tablicę (z dowolnej strony) sąsiadującymi elementami
    są wartości z początku lub końca tablicy.
     */

    static public void cw_02() {
        char[] tab = {'a', 'b', 'c', 'e', 'f'};
        String toDisplay;
        int length = tab.length;
        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[length - 1] + " oraz sąsiada z prawej: " + tab[i + 1];
            } else if (i == length - 1) {
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[i - 1] + " oraz sąsiada z prawej: " + tab[0];
            } else {
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[i - 1] + " oraz sąsiada z prawej: " + tab[i + 1];
            }

            System.out.println(toDisplay);
        }
    }

    /*
    Dane są dwie tablice arr1 i arr2 wypełnione losowymi wartościami
    liczb całkowitych. Utwórz program który:
    • utworzy nową tablicę zawierającą wszystkie elementy z obu tablic;
    • utworzy nową tablicę zawierającą elementy występujące w obu tablicach;
    • utworzy nową tablicę która pomieści wszystkie takie
    liczby całkowite z przedziału pomiędzy elementem o najmniejszej
    a największej wartości z obu tablic, które nie znajdują się
    w tych tablicach.
     */


    static public void cw_03() {
        Random r = new Random();
        double randomValue;
        double[] a = new double[5];
        double[] b = new double[5];

        for (int i = 0; i < a.length; i++) {
            randomValue = r.nextDouble() * 100;
            a[i] = randomValue;
            System.out.print(a[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            randomValue = r.nextDouble() * 100;
            b[i] = randomValue;
            System.out.print(b[i] + ", ");
        }

//        double[] newArr = Arrays.copyOf(a, a.length + b.length);
//        System.arraycopy(b, 0, newArr, a.length, b.length);
        System.out.println();

        double[] newArr = new double[10];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArr[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    /*
    Utwórz i wypełnij losowymi wartościami dwie tablice o takim samym
    rozmiarze i typach odpowiednio int i double. Przyjmij że elementy
    na tym samym indeksie (w obu tablicach) są nierozerwalnie z sobą
    połączone, co oznacza że wykonywanie dowolnej operacji na elemencie
    pod indeksem X w jednej tablicy będzie wymagało takiej samej operacji
    w drugiej tablicy. Posortuj te dane rosnąco, przyjmując jako
    kryterium sumę wartości na tym samym indeksie w obu tablicach.
     */

    static public void cw_04() {

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*20);
        }
        System.out.println(Arrays.toString(array1));

        double[] array2 = new double[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Math.random()*20;
        }
        System.out.println(Arrays.toString(array2));

        for (int j=0; j<array1.length; j++) {
            int minIndex = j;
            double minSum = array1[j] + array2[j];

            for(int i=j+1; i<array1.length; i++) {
                if (minSum > array1[i] + array2[i]) {
                    minIndex = i;
                    minSum = array1[i] + array2[i];
                }
            }

            int tempValue1 = array1[j];
            double tempValue2 = array2[j];

            array1[j] = array1[minIndex];
            array1[minIndex] = tempValue1;

            array2[j] = array2[minIndex];
            array2[minIndex] = tempValue2;

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}