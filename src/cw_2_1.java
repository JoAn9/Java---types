public class cw_2_1 {

    public static void main( String[] args ) {

// Zad. I
        byte minByte = -128;
        byte maxByte = 127;
        byte b = 0b100;
        System.out.println(b);

        short minShort = -32768;
        short maxShort = 32767;
        long minLong = -9223372036854775808L;
        long maxLong = 922337299;
        float minFloat = -3.4028234663852886f;
        // dlaczego 4 granice (2 zakresy)?
        float maxFloat = 3.4028234663852886E38f;
        double minDouble = 1.7976931348623157E308;
        double maxDouble = 1.7976931348623157E308;
        int minInt = -2147483648;
        int maxInt = 2147483647;

// Zad. II

        boolean x = true;
        boolean y = false;
        int a = 20;
        int c = 50;
        double d = 2.58;
        double e = 100.9875989;
        char f = '@';
        char g = '*';

        System.out.println("wynik x == y to: " + (x == y));
        System.out.println("wynik a == c to: " + (a == c));
        System.out.println("wynik d == e to: " + (d == e));
        System.out.println("wynik f == g to: " + (f == g));

// Zad. III

        int m = 500;
        double n = 20.5;
        m = (int) n; // jawnie wykonana konwersja zwezajaca
        n = m;
        System.out.println(m);
        System.out.println(n);

// Zad. IV

        char a1 = '*';
        int a2 = 20;
        float a3 = 2.58f;
        double a4 = 100.9875989;
        byte a5 = 0b101;

        System.out.println("char + int to: " + (a1 + a2));
        System.out.println("int + char to: " + (a2 + a1));
        System.out.println("float + double to: " + (a3 + a4));
        System.out.println("byte + int to: " + (a5 + a2));

// Zad. V

        int z = 2 * 5 + 3 * 4 - 8;
        System.out.println(z);



    }
}


/*
Zadeklaruj zmienne wszystkich typów prostych, a następnie nadaj im kolejno naj-
mniejszą i największą możliwą wartość. Wykorzystaj literały logiczne lub w systemie
dziesiętnym, a tam gdzie to możliwe również w szesnastkowym, ósemkowym i binar-
nym.
 */
