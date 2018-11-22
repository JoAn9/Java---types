
public class s19622_zestaw07 {

    public static void main(String[] args) {
        cw_01();
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

    static void countSigns(char[] arr) {
        for(char i = 'a'; i<='z'; i++) {


        }
    }

    static void cw_02() {
        char[] array = {'a', 'l', 'a', 'm', 'a', 'k', 'o', 't', 'a'};


    }


}