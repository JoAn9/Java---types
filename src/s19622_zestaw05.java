import java.util.Random;

public
    class s19622_zestaw05 {

    public static void main( String[] args ) {
        cw_01();
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
}
