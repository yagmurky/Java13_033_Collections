package com.yagmur.List.ArrayList.Odev;

import java.util.List;
import java.util.UUID;

public class Urun {
    int id;
    String ad;
    String fiyat;
    List<Ozellik> ozellikList;

    public Urun() {
    }

    public Urun(int id, String ad) {
        this.id=id;
        this.ad = ad;
    }

    public Urun(int id,String ad, String fiyat, List<Ozellik> ozellikList) {
        this.id=id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.ozellikList = ozellikList;
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

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public List<Ozellik> getOzellikList() {
        return ozellikList;
    }

    public void setOzellikList(List<Ozellik> ozellikList) {
        this.ozellikList = ozellikList;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("ÜrÜn objesi\n");
        result.append("id: ").append(id).append("\n");
        result.append("ÜrÜn adı: ").append(ad).append("\n");
        result.append("Fiyat: ").append(fiyat).append("\n");

        // Ürün bilgilerinden sonra özellikleri ekleyelim
        result.append(" Özellik Listesi:\n");
        for (Ozellik ozellik : ozellikList) {
            result.append(" -").append(ozellik).append("\n");
        }

        return result.toString();
    }
}
