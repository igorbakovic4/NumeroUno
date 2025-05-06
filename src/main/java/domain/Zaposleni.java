package domain;

public class Zaposleni {

    private long id;
    private String ime;
    private String prezime;
    private double satnica;

    public Zaposleni(long id, String ime, String prezime, double satnica) {
        this.id = id;
        this.ime = ime;
        this.satnica = satnica;
        this.prezime = prezime;
    }

    public Zaposleni() {
    }

    public long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
