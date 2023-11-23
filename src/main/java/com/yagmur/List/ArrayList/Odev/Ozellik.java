package com.yagmur.List.ArrayList.Odev;

import java.util.UUID;

public class Ozellik {
    int id;
    String ad;
    String aciklama;

    public Ozellik() {
    }

    public Ozellik(int id, String ad) {
        this.ad = ad;
    }

    public Ozellik(int id, String ad, String aciklama) {
        this();
        this.ad = ad;
        this.aciklama = aciklama;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Ozellik{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
