public class Main {
    public static void main(String[] args){
/* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Kwadrat kwad = new Kwadrat();
        System.out.println(kwad.getPole(20));
        kwad.nazwaFigury();

        Prostokat pros = new Prostokat();
        System.out.println(pros.getPole1(20, 10));
        kwad.nazwaFigury();

        Prostokat obw = new Prostokat();
        System.out.println(obw.getObw1(20, 10));
        kwad.nazwaFigury();
    }
}
