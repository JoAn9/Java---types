    /*
Zdefiniuj klasę Number z polem typu int, oraz metodami setValue
(przypisującą polu wartość dostarczoną jako parametr metody)
i showValue (wyświetlającą wartość pola).
Następnie rozszerz definicję klasy MethodCurrier z poprzedniego zadania
o metodę setValue akceptującą jako parametr klasę Number.
Przedefiniuj wszystkie metody setValue tak aby wykonywały następujące
 czynności:
• wyświetlały stan zmiennej dostarczonej jako parametr,
• modyfikowały wartość dostarczonej zmiennej,
• wyświetlały stan zmodyfikowanej zmiennej
     */


class Number {
    private int myNumber;

    public void setValue(int x) {
        myNumber = x;
    }

    public void showValue() {
        System.out.println(myNumber);
    }

}
