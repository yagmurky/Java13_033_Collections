package com.yagmur.List.ArrayListOkul;

import java.util.List;

public class Ogretmen {
    String ad;
    String soyad;
    Branslar branş;
    private int id;

    public Ogretmen(String ad, String soyad, Branslar branş) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Branslar getBranş() {
        return branş;
    }

    public void setBranş(Branslar branş) {
        this.branş = branş;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş=" + branş +
                '}';
    }
}
