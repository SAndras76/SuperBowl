package hu.progmatic;

public class SuperBowl_data {

    private  String RomaiSorszam;
    private  String datum;
    private  String nyertes;
    private  String eredmeny;
    private  String vesztes;
    private  String helyszin;
    private  String varosAllam;
    private int nezoszam;

    public SuperBowl_data(String romaiSorszam, String datum, String nyertes, String eredmeny, String vesztes, String helyszin, String varosAllam, int nezoszam) {
        this.RomaiSorszam = romaiSorszam;
        this.datum = datum;
        this.nyertes = nyertes;
        this.eredmeny = eredmeny;
        this.vesztes = vesztes;
        this.helyszin = helyszin;
        this.varosAllam = varosAllam;
        this.nezoszam = nezoszam;
    }


    public void setRomaiSorszam(String romaiSorszam) {
        RomaiSorszam = romaiSorszam;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setNyertes(String nyertes) {
        this.nyertes = nyertes;
    }

    public void setEredmeny(String eredmeny) {
        this.eredmeny = eredmeny;
    }

    public void setVesztes(String vesztes) {
        this.vesztes = vesztes;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }

    public void setVarosAllam(String varosAllam) {
        this.varosAllam = varosAllam;
    }

    public void setNezoszam(int nezoszam) {
        this.nezoszam = nezoszam;
    }

    public String getRomaiSorszam() {
        return RomaiSorszam;
    }

    public String getDatum() {
        return datum;
    }

    public String getNyertes() {
        return nyertes;
    }

    public String getEredmeny() {
        return eredmeny;
    }

    public String getVesztes() {
        return vesztes;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public String getVarosAllam() {
        return varosAllam;
    }

    public int getNezoszam() {
        return nezoszam;
    }

    @Override
    public String toString() {
        return "SuperBowl_data{" +
                "RomaiSorszam='" + RomaiSorszam + '\'' +
                ", datum='" + datum + '\'' +
                ", nyertes='" + nyertes + '\'' +
                ", eredmeny='" + eredmeny + '\'' +
                ", vesztes='" + vesztes + '\'' +
                ", helyszin='" + helyszin + '\'' +
                ", varosAllam='" + varosAllam + '\'' +
                ", nezoszam=" + nezoszam +
                '}';
    }
}
