    /*
Zdefiniuj klasę Number z polem typu int, oraz metodami setValue
(przypisującą polu wartość dostarczoną jako parametr metody) i
showValue (wyświetlającą wartość pola).
Następnie rozszerz definicję klasy MethodCurrier z poprzedniego zadania
o metodę setValue akceptującą jako parametr klasę Number.
Przedefiniuj wszystkie metody setValue tak aby wykonywały następujące
 czynności:
• wyświetlały stan zmiennej dostarczonej jako parametr,
• modyfikowały wartość dostarczonej zmiennej,
• wyświetlały stan zmodyfikowanej zmiennej.
Na koniec przedstaw wywołanie wszystkich metod setValue i odpowiedz
co zmieniły wywołane metody?
     */


public class s19622_zestaw8_2 {

    public static  void main(String[] args) {
        MethodCurrier2 myObj = new MethodCurrier2();

        Number myNumber = new Number();
        myNumber.setValue(20);

        myObj.setValue(myNumber);

        float myFloat = 2.58f;
        myObj.setValue(myFloat);

        myObj.setValue(5);

        byte myByte = 2;
        myObj.setValue(myByte);
        myObj.setValue('a');
    }
}

class MethodCurrier2 {
    void setValue(int x) {
        System.out.println(x + ": int dostarczony");
        x = x+5;
        System.out.println(x + ": int zmodyfikowany");
    }
    void setValue(float y) {
        System.out.println(y + ": float");
        y = y+10;
        System.out.println(y + ": float zmodyfikowany");
    }
    void setValue(Number z) {
        System.out.println(z.myNumber + ": class dostarczony");
        z.myNumber = z.myNumber + 6;
        System.out.println(z.myNumber + ": class zmodyfikowany");
    }
}

class Number {
    int myNumber;
    void setValue(int a) {
        myNumber = a;
    }
    void showValue() {
        System.out.println("Value: " + myNumber);
    }
}