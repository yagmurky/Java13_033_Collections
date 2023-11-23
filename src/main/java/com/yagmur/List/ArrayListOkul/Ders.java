package com.yagmur.List.ArrayListOkul;

public class Ders {
    Dersler dersadi;
    double not1;
    double not2;
    double ortalama;
    Ogretmen ogretmen;


    //dersin öğretmeni budur(öğretmen nesnesi alacak öğretmen sınıfından,not1,not2, dersin içinde ortalama hesaplama metodu.)


    public Ders() {
    }

    public Ders(Dersler dersadi, Ogretmen ogretmen) {
        this.ogretmen=ogretmen;
        this.dersadi = dersadi;
    }

    /**
     * ogretmenin branşı olacak, branşlardan alacak.
     *
     * sonra öğrenci ders listesi ekleyeceğiz.
     * hangi dersi kim alıyo öğretmeni kimdir gibi soruların cevabını ders listesinden alacağız.
     *
     *
     * 3 tane öğrenci ekleyeceğiz,
     * derslerden en az 3 tane olacak.
     * en az 5 öğretmen olacak.
     *
     *
     * orenci adı yazıldığında (metota öğrenci adı vereceğiz) o öğrencinin derslerine giren öğretmenlerin adını verecek.
     */



    public double ortalamaBul (double not1, double not2){
        this.not1=not1;
        this.not2=not2;
        this.ortalama=(not1+not2)/2;
        return ortalama;
    }



    public Dersler getDersadi() {
        return dersadi;
    }

    public void setDersadi(Dersler dersadi) {
        this.dersadi = dersadi;
    }

    public double getNot1() {
        return not1;
    }

    public void setNot1(double not1) {
        this.not1 = not1;
    }

    public double getNot2() {
        return not2;
    }

    public void setNot2(double not2) {
        this.not2 = not2;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "dersadi=" + dersadi +
                ", not1=" + not1 +
                ", not2=" + not2 +
                ", ortalama=" + ortalama +
                ", ogretmen=" + ogretmen +
                '}';
    }
}
