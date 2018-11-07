import java.util.Random;

public
    class s19622_zestaw05 {

    public static void main( String[] args ) {
        cw_02();
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
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[length-1] + " oraz sąsiada z prawej: " + tab[i+1];
            } else if (i == length-1) {
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[i-1] + " oraz sąsiada z prawej: " + tab[0];
            } else {
                toDisplay = "Wartość: " + tab[i] + " ma sąsiada z lewej: " + tab[i-1] + " oraz sąsiada z prawej: " + tab[i+1];
            }

            System.out.println(toDisplay);
        }
    }
}