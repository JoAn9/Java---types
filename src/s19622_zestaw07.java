import java.util.Arrays;


public class s19622_zestaw07 {

    public static void main(String[] args) {
        cw_04();
    }

    /*
Dana jest zmienna typu int o wartości 5 i nazwie wrt.
Napisz bezrezultatową funkcję modifyValue przyjmującą jako parametr
zmienną typu int. Zadaniem funkcji będzie:
• wyświetlenie wartości dostarczonej zmiennej,
• modyfikacja zmiennej przez zapisanie w niej wyniku mnożenia przez 5,
• wyświetlenie wartości zmodyfikowanej zmiennej
Utwórz program wyświetlający stan zmiennej wrt przed i po wywołaniu
funkcji modifyValue.
Jaki jest powód uzyskanego rezultatu?
     */

    static void modifyValue(int numb) {
        System.out.println(numb);
        numb = numb * 5;
        System.out.println(numb);
    }

    static void cw_01() {
        int wrt = 5;
        modifyValue(wrt);
    }

    /*
    Dana jest tablica zmiennych typu char przechowująca napis
    Ala ma kota. Napisz metodę, która policzy ile razy wystąpiły
    znaki składające się na ciąg dostarczony jako argument.
     */

    static int countSigns(char letter, char[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == letter) {
                counter++;
            }
        }
        return counter;
    }

    static void cw_02() {
        char[] array = {'a', 'l', 'a', 'm', 'a', 'k', 'o', 't', 'a'};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " wystepuje " + countSigns(array[i], array));
        }
    }

    /*
    Utwórz i wypełnij losowymi wartościami dwie tablice zmiennych typu int.
    Następnie utwórz metodę przyjmującą obie tablice i dodatkowo wartość typu int
    jako argumenty. Zadaniem metody będzie:
• dostarczenie tablicy, której wartościami będą sumy elementów na tych samych
indeksach, gdy wartość argumentu typu int będzie mniejsza od 0;
Uwaga - elementy które nie maja pary, powinny zostać pominięte
• dostarczenie tablicy zawierającej tylko te elementy, które nie mają
"pary"indeksowej, gdy wartość argumentu typu int będzie więsza od 0
• dostarczenie elementu pustego gdy tablice są tej samej długości.
     */

    static int[] myFunction(int[] table1, int[] table2, int number) {
        int[] longerArray = table1.length > table2.length ? table1 : table2;
        int[] shorterArray = table1.length < table2.length ? table1 : table2;
        int[] newArray;

        if (number < 0 && table1.length != table2.length) {
            newArray = new int[shorterArray.length];
            for (int i = 0; i < shorterArray.length; i++) {
                newArray[i] = table1[i] + table2[i];
            }
            return newArray;
        }
        if (number > 0 && table1.length != table2.length) {
            newArray = new int[longerArray.length - shorterArray.length];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = longerArray[shorterArray.length + i];
            }
            return newArray;
        } else {
            return newArray = new int[0];
        }
    }

    static void cw_03 () {
        int[] array1 = new int[6];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        System.out.print(Arrays.toString(array1));
        System.out.println("");
        System.out.print(Arrays.toString(array2));
        System.out.println("");
        System.out.println(Arrays.toString(myFunction(array1, array2, -2)));
    }

    /*
    Utwórz i przetestuj metodę rekurencyjną, która stwierdzi
    czy dostarczone w tablicy zmiennych typu char słowo jest palindromem.
     */

    static boolean testPalindrom(char[] array, int firstChar, int lastChar) {
        if (firstChar == lastChar || lastChar-firstChar == 1) {
            return true;
        }
        if (array[firstChar] == array[lastChar] && firstChar < lastChar) {
            firstChar++;
            lastChar--;
            return testPalindrom(array, firstChar, lastChar);
        }
        return false;
    }

    static void cw_04() {
        char []myArray = {'a', 'l', 'b', 's', 'b', 'l', 'a', 'k'};
        System.out.println(testPalindrom(myArray, 0, myArray.length-1));
    }
}