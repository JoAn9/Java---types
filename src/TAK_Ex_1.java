/*
Dane są trzy liczby całkowite dodatnie a, b, c.
Wyznacz c-tą cyfrę znaczącą ilorazu a/b (tzn. c-tą cyfrę, licząc od pierwszej cyfry niezerowej).

Przykładowo:
Dla a = 2, b = 3 oraz dowolnego c > 0 program powinien zwrócić 6.
Dla a = 10000, b = 8, c = 1 program powinien zwrócić 1.
Dla a = 10000, b = 8, c = 2 program powinien zwrócić 2.
Dla a = 10000, b = 8, c = 3 program powinien zwrócić 5.
Dla a = 10000, b = 8 oraz dowolnego c > 3 program powinien zwrócić 0.
Dla a = 1, b = 2000, c = 1 program powinien zwrócić 5.
Dla a = 1, b = 2000 oraz dowolnego c > 1 program powinien zwrócić 0.
WEJŚCIE

Wejście programu składa się z jednej linii, zawierającej kolejno liczby a, b, c, oddzielone spacjami.

WYJŚCIE

Na wyjściu należy wypisać szukaną cyfrę.

ZAŁOŻENIA

Zakładamy, że a, b, c są całkowite dodatnie i mniejsze niż 108.

Wersja uproszczona (za 50% punktów): zakładamy, że c < 6.

WYMAGANIA
Program powinien zwracać poprawny matematycznie wynik - co oznacza, że w wersji nieuproszczonej nie zadziała zwykłe dzielenie wbudowanych typów zmiennoprzecinkowych (float, double itp.).
Wykorzystanie typów o nieograniczonej precyzji lub bibliotek wykonujących tego typu obliczenia jest zabronione. (Tzn. chodzi o to, żeby zapewnili Państwo precyzję wyniku samodzielnie).
Jeżeli język oferuje wyłącznie takie typy (np. int w Pythonie 3), proszę ich użyć tak, jak w C albo Javie. Proszę w żadnym momencie nie przechowywać w pamięci liczb ponad 20-cyfrowych.
W razie pytań proszę o maila.
Nie ograniczam języka programowania.
Program powinien działać w rozsądnym czasie (maksymalnie rzędu minuty). Jeżeli u kogoś ten warunek będzie prawie spełniony (np. kilkanaście minut dla największych danych), może to być usprawiedliwione przez wybór języka lub sprawy sprzętowe; proszę o maila, być może też zaakceptuję.
Zastrzegam sobie prawo do przyznania dodatkowych punktów za szczególnie wydajne programy (da się zejść do ułamków sekund zakładając a, b < 105 przy c < 108), oraz karcenia za szczególnie chaotyczny kod.
PRZYKŁAD

Dla wejścia

100 8 3

program powinien wypisać

5

WSKAZÓWKA

Warto przypomnieć sobie dzielenie pisemne. Jeśli wynik byłby wypisywany na bieżąco, w czasie jego wykonywania nigdy nie trzeba pamiętać zbyt dużych liczb, a dokładność wyniku można uzyskać dowoloną.
 */

public class TAK_Ex_1 {

    public static void main( String[] args ) {

        double quot = count(1, 2000, 5);

        System.out.println(quot);


    }

    static double count(double a, double b, int c) {
        double result = a/b;
//        System.out.println(result);
        return result;
    }

}
