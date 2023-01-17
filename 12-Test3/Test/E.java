public class E {
    String imie;
    String nazwisko;
    int wiek;
    int stazPracy;

    public E(String imie, String nazwisko, int wiek, int stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stazPracy = stazPracy;
    }

    public String toString() {
        String output = "";

        output += this.nazwisko;
        output += this.imie.charAt(0);
        output += this.stazPracy;

        if (this.wiek >= 18) {
            return output.toUpperCase();
        }
        return output.toLowerCase();
    }
}
