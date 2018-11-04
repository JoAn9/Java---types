import java.util.Random;

public
    class s19622_zestaw04 {

    public static int [] b = new int[10];

    public static void main( String[] args ) {
        cw_04();
    }

    static public void cw_01() {
        int[] a = new int[10];
        System.out.println(a[5]);
    }

    static public void cw_02() {
        for(int i=0; i<b.length; i++) {
            b[i] = (int) Math.floor(Math.random() * 2);
            System.out.println(b[i]);
        }
    }

    static public void cw_03() {
        int zeroNum = 0;
        int oneNum = 0;
        for(int i = 0; i < b.length; i++) {
            if(b[i] == 0) {
                zeroNum++;
            } else {
                oneNum++;
            }
        }
        System.out.println("Zer jest " + zeroNum + ", jedynek jest: " + oneNum);
    }

    static public void cw_04() {
        double [] myTable = new double[10];
        int [] myIntTable = new int[10];
        Random r = new Random();
        for(int i = 0; i < myTable.length; i ++) {
            double randomValue = r.nextDouble() * 1000;
            myTable[i] = randomValue;
            System.out.println(myTable[i]);
        }
        for(int i = 0; i < myTable.length; i++) {
            if(i % 2 == 0) {
                System.out.println(i + ": " + myTable[i]);
            }
        }
        for(int i = 0; i < myIntTable.length; i++) {
            myIntTable[i] = (int) myTable[i];
            if(myIntTable[i] % 2 != 0) {
                System.out.println(myIntTable[i]);
            }
        }

    }
}
