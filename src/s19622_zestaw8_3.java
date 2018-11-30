
/*
Utwórz klasę Osoba zawierającą publiczne pola:
• String imie
• String nazwisko
• int rokUrodzenia
Utwórz obiekt klasy Osoba i przechowaj go w zmiennej osoba.
Wykorzystaj możliwość dostępu do publicznych pól tej klasy
i przypisz im literały lub wartości opisujące tworzoną osobę.
 */

    class Person {
        public String name;
        public String surname;
        public int year;
    }

    public class s19622_zestaw8_3 {

        public static void main(String[] args) {
            Person osoba = new Person();
            osoba.name = "John";
            osoba.surname = "Smith";
            osoba.year = 1410;
            System.out.println(
                    "Name: " + osoba.name +
                    " Surname: " + osoba.surname +
                    " Year: " + osoba.year
            );
        }
    }