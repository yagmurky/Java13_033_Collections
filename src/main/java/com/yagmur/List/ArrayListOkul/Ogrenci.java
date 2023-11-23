package com.yagmur.List.ArrayListOkul;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ogrenci {
    Long id;
    String ad;
    String adres;
    List<Ders> derslers;


    public Ogrenci(String ad, String adres) {
        this.id= new Random().nextLong();
        this.ad = ad;
        this.adres = adres;
    }

    public Ogrenci(String ad, String adres, List<Ders> derslers) {
        this.id= new Random().nextLong();
        this.ad = ad;
        this.adres = adres;
        this.derslers=derslers;
    }



    public Long getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Ders> getDerslers() {

        return derslers;
    }

    public void setDerslers(List<Ders> derslers) {
        this.derslers = derslers;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", derslers=" + derslers +
                '}';
    }
}
