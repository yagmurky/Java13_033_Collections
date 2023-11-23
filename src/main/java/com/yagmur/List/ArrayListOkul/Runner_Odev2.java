package com.yagmur.List.ArrayListOkul;

import java.util.ArrayList;
import java.util.List;

public class Runner_Odev2 {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen("Muhammet Ali", "Kaya",Branslar.EDEBIYAT);
        Ogretmen ogretmen2=new Ogretmen("Muhammet", "Kaba",Branslar.BIYOLOJI);
        Ogretmen ogretmen3=new Ogretmen("Ali", "Kara",Branslar.INGILIZCE);
        Ogretmen ogretmen4=new Ogretmen("Mehmet Ali", "Kaza",Branslar.TURKCE);
        Ogretmen ogretmen5=new Ogretmen("Mustafa", "Öztürk",Branslar.MATEMATIK);


        List<Ogretmen> ogretmenList=new ArrayList<>();
        ogretmenList.add(ogretmen1);
        ogretmenList.add(ogretmen2);
        ogretmenList.add(ogretmen3);
        ogretmenList.add(ogretmen4);
        ogretmenList.add(ogretmen5);

        Ders beden=new Ders(Dersler.BEDEN,ogretmenList.get(0));
        Ders biyoloji=new Ders(Dersler.BIYOLOJI,ogretmenList.get(1));
        Ders ingilizce=new Ders(Dersler.INGILIZCE, ogretmenList.get(2));
        Ders turcke=new Ders(Dersler.TURKCE, ogretmenList.get(3));
        Ders matematik=new Ders(Dersler.MATEMATİK,ogretmenList.get(4));
        Ders edebiyat=new Ders(Dersler.EDEBIYAT,ogretmenList.get(0));

        List<Ders> ogrenci1_ders=new ArrayList<>();
        ogrenci1_ders.add(beden);
        ogrenci1_ders.add(matematik);
        ogrenci1_ders.add(turcke);

        List<Ders> ogrenci2_ders=new ArrayList<>();
        ogrenci2_ders.add(beden);
        ogrenci2_ders.add(edebiyat);
        ogrenci2_ders.add(ingilizce);

        List<Ders> ogrenci3_ders=new ArrayList<>();
        ogrenci3_ders.add(biyoloji);
        ogrenci3_ders.add(edebiyat);
        ogrenci3_ders.add(turcke);

        List<Ders> ogrenci4_ders=new ArrayList<>();
        ogrenci4_ders.add(edebiyat);
        ogrenci4_ders.add(ingilizce);
        ogrenci4_ders.add(turcke);

        List<Ogrenci> ogrenciList=new ArrayList<>();


        Ogrenci ogrenci1=new Ogrenci("Yagmur","Bolu",ogrenci1_ders);
        Ogrenci ogrenci2=new Ogrenci("Meryem","Kocaeli",ogrenci2_ders);
        Ogrenci ogrenci3=new Ogrenci("Esra","Kastamonu",ogrenci3_ders);
        Ogrenci ogrenci4=new Ogrenci("Yasemin","Karabük",ogrenci4_ders);

        ogrenciList.add(ogrenci1);
        ogrenciList.add(ogrenci2);
        ogrenciList.add(ogrenci3);
        ogrenciList.add(ogrenci4);


        System.out.println(ogrenci1);
        System.out.println(ogrenciList);
        System.out.println(ogrenci1.getDerslers());
        ogretmenBul("Yagmur",ogrenciList);


    }

    public static void ogretmenBul(String ad, List<Ogrenci> ogrenciList){
        for (Ogrenci ogrenci: ogrenciList)
        {
            if (ogrenci.getAd().equalsIgnoreCase(ad)){
                for (int i = 0; i < ogrenci.getDerslers().size(); i++) {
                    System.out.println(ogrenci.getDerslers().get(i).getOgretmen().getAd());
                }
            }
        }
    }


    public static double ogrenciOrtalamasi(String ad, String dersAdi, List<Ogrenci> ogrenciList)
    {
        for (Ogrenci ogrenci:ogrenciList){
            if (ogrenci.getAd().equalsIgnoreCase(ad)){
                for (Ders ders:ogrenci.getDerslers())
                {
                    if (ders.getDersadi().equals(dersAdi))
                    {
                        Ders ders1=new Ders();
                        ders1.ortalamaBul(double not1, double not2);
                    }
                }
            }
        }
    }

}
