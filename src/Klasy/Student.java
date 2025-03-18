public class Student {
    private String imie, nazwisko, nazwaSpecjalnosci;
    private int nr_indeksu, rokStudiow;

    public Student(String imie, String nazwisko, String nazwaSpecjalnosci, int nr_indeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nr_indeksu = nr_indeksu;
        this.rokStudiow = rokStudiow;
    }


    public Student(String imie, String nazwisko, String nazwaSpecjalnosci, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String nazwaSpecjalnosci, String nazwisko, String imie) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane(){
        System.out.println(imie + " " + nazwisko + ", " + nr_indeksu + ", " + nazwaSpecjalnosci +  ", rok: " +  rokStudiow);
    }
}