public
    class s19622_zestaw03 {

    public static void main( String[] args ) {

        // Zad. I
        // Napisz program wyświetlający wartości od 1 do 10.
        // Wykorzystaj w tym celu pętle.

        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        // Zad. II
        /* Dana jest następująca pętla:
        int s = 0 ;
        for ( int i = 1 ; i <= 1 0 ; i++)
        s = s + i ;
        Zmodyfikuj powyższy kod aby wykorzystywał pętlę while
        */
        {
            int s = 0;
            int i = 1;
            while(i <= 10) {
                s = s + i;
                i++;
                System.out.println(s);
            }
        }

//        int s = 0;
//        for ( int i = 1 ; i <= 10 ; i++) {
//            s = s + i;
//            System.out.println(s);
//        }

        // Zad. III
        /*
        Przedstaw program ilustrujący podstawową różnicę
        pomiędzy pętlami while i do–while.
         */
        {
            int a = 5;

            do {
                System.out.println("Hello");
            } while(a == 10);

            while(a == 10) {
                System.out.println("Hello2");
            }
        }

        // Zad. IV
        {
            double x;
            for (int i = 0; i < 10; i++) {
                x = 1 / (Math.pow(2, i));
                System.out.println(x);
            }
        }

        // Zad. V
        {
            double y;
            double z;
            int wtr = 2;
            for (int i = 0; i < 10; i++) {
                y = 1 / (Math.pow(2, i));
                z = y * wtr;
                System.out.println(z);
            }
        }

//        Zad. VI
          /*
          Napisz program wyświetlający wszystkie liczby podzielne
          bez reszty przez 3 i 2 z przedziału od −1500 do 1500.
          */
        {
            int a = -1500;
            int b = 1500;
            for(int i = a; i <= b; i++) {
                if(i%3 == 0 && i%2 == 0) {
                   // System.out.println(i);
                }
            }

        }

        // Zad. VII
        {
            for (int i = 0; i < 5; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
