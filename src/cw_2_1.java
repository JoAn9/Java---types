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
        int result48 = 2 * ((5 + 3) * 4 - 8);
        System.out.println(result48);

// Zad. VI

        System.out.println("'z' nalezy do przedzialu [0, infinity]: " + (z >= 0));
        System.out.println("'z' nalezy do przedzialu [-infinity, 1]: " + (z <= 1));
        System.out.println("'z' nalezy do przedzialu [0, 1]: " + (z >= 0 && z <= 1));

// Zad. VII

        /*
        Dane są następujące zbiory:
        • A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
        • B = (−∞, −13] ∪ (−8, −3]
        • C = [−4, ∞)
        Napisz program weryfikujący, czy zmienna int wrt należy do części wspólnej tych
        zbiorów.
         */

        int wtr = -3;
        boolean result = false;
        if (
            ((wtr > -15 && wtr <= -10) || (wtr > -5 && wtr < 0) || (wtr > 5 && wtr < 10)) &&
            ((wtr <= -13) || (wtr > -8 && wtr <= -3)) &&
            (wtr >= -4)
        ) {
            result = true;
        }
        System.out.println("'wtr' należy do cześci wspónej zbiorów: " + result);

    }
}
