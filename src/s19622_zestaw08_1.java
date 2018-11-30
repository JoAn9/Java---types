    /*
Zadeklaruj klasę MethodCurrier implementującą dwie nic niezwracające metody
setValue. Pierwsza przyjmie jako parametr zmienną typu prostego int, natomiast
druga przyjmie jako parametr zmienną typu float. Obie metody wyświetlą na
ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr.
Następnie należy utwórzyć obiekt klasy MethodCurrier i wywołać obie metody
dostarczając jako parametry literały typu:
• int
• float
• char
• byte
Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać?
     */


class MethodCurrier {

    void setValue(int x) {
        System.out.println(x + ": int");
    }

    void setValue(float y) {
        System.out.println(y + ": float");
    }
}

public class s19622_zestaw08_1 {

    public static  void main(String[] args) {

        MethodCurrier something = new MethodCurrier();
        float myFloat = 2.58f;
        something.setValue(myFloat);
        something.setValue(5);
        byte myByte = 2;
        something.setValue(myByte);
        something.setValue('a');
    }
}