
/*
Utwórz klasę Osoba zawierającą publiczne pola:
• String imie
• String nazwisko
• int rokUrodzenia
Utwórz obiekt klasy Osoba i przechowaj go w zmiennej osoba.
Wykorzystaj możliwość dostępu do publicznych pól tej klasy
i przypisz im literały lub wartości opisujące tworzoną osobę.
 */

    public class Person3 {
        public String name;
        public String surname;
        public int year;

//        public void setValue(String a, String b, int c) {
//            name = a;
//            surname = b;
//            year = c;
//        }
//
//        public void print() {
//            System.out.println("Name: " + name);
//        }

        public static  void main(String[] args) {
            Person3 osoba = new Person3();
            osoba.name = "John";
            osoba.surname = "Smith";
            osoba.year = 1410;
            System.out.println(
                    "Name: " + osoba.name +
                    " Surname: " + osoba.surname +
                    " Year: " + osoba.year
            );

//            person1.setValue("John", "Smith", 1410);
//            person1.print();
        }

    }


