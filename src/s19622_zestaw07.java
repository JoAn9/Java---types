
public class s19622_zestaw07 {

    public static void main(String[] args) {
        cw_02();
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
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == letter) {
                counter++;
            }
        }
        return counter;
    }

    static void cw_02() {
        char[] array = {'a', 'l', 'a', 'm', 'a', 'k', 'o', 't', 'a'};
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i] + " wystepuje " + countSigns(array[i], array));
        }
    }


}