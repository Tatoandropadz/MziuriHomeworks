package gakvetili31davaleba;

public class Basketballer {
    String name;
    String surname;
    int chagdeba;
    int moxsna;
    int dafareba;
    int gadacema;
    int dakargva;

    public Basketballer(String name, String surname, int chagdeba,
                        int moxsna, int dafareba, int gadacema, int dakargva) {
        this.name = name;
        this.surname = surname;
        this.chagdeba = chagdeba;
        this.moxsna = moxsna;
        this.dafareba = dafareba;
        this.gadacema = gadacema;
        this.dakargva = dakargva;
        double rating = chagdeba + moxsna + 2 * dafareba + (double) 1.5 * gadacema - 2 * dakargva;
    }

    double qula () {

        return chagdeba + moxsna + 2 * dafareba + (double) 1.5 * gadacema - 2 * dakargva;
    }
}
