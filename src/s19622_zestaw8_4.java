/*
        Utwórz konstruktor dla klasy Osoba który zainicjuje wszystkie jej pola.
        Ponadto utwórz metodę show wypisującą na ekran stan wszystkich pól.
        Działanie obu składowych klasy przedstaw w programie.
*/

    class Person4 {
        String name;
        String surname;
        int year;

        public Person4(String myName, String mySurname, int myYear){
            name = myName;
            surname = mySurname;
            year = myYear;
        }

        public void show() {
            System.out.println(
                "Name: " + name +
                " Surname: " + surname +
                " Year: " + year
            );
        }
    }

    public class s19622_zestaw8_4 {

        public static  void main(String[] args) {

            Person4 myPerson = new Person4("Michael", "Jackson", 1950);
            myPerson.show();
        }
    }

