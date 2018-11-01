public
    class s19622_zestaw04 {

    public static void main( String[] args ) {
        cw_02();
    }

    static public void cw_01() {
        int[] a = new int[10];
        System.out.println(a[5]);
    }

    static public void cw_02() {
        int [] b = new int[10];
        for(int i=0; i<b.length; i++) {
            b[i] = (int) Math.floor(Math.random() * 2);
            System.out.println(b[i]);
        }

    }


}
