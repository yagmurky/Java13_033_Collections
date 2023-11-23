package com.yagmur.List;

import com.yagmur.List.ArrayList.Ders;
import com.yagmur.List.ArrayList.Ogrenci;
import com.yagmur.List.ArrayList_Ornek.Arac;

import java.util.ArrayList;
import java.util.List;

public class Runner_ArrayList {
    public static void main(String[] args) {
        List<Ogrenci> ogrenciList= new ArrayList<>();


        Ders mat_tekin = new Ders("Matematik", "Ali");
        Ders turk_tekin= new Ders("Türkçe","Bahar");
        Ders ing_tekin= new Ders("İngilizce", "Ayşe");
        Ders mat_bahar = new Ders("Matematik", "Ali");
        Ders mat_demet = new Ders("Matematik", "Ali");

        List<Ders> dersList_tekin= new ArrayList<>();
        dersList_tekin.add(mat_tekin);
        dersList_tekin.add(turk_tekin);
        dersList_tekin.add(ing_tekin);

        List<Ders> dersList_bahar= new ArrayList<>();
        dersList_bahar.add(mat_bahar);

        List<Ders> dersList_demet= new ArrayList<>();
        dersList_demet.add(mat_demet);

        Ogrenci ogrenci1= new Ogrenci("Tekin","Istanbul",dersList_tekin);
        Ogrenci ogrenci2= new Ogrenci("Bahar","İzmir",dersList_bahar);
        Ogrenci ogrenci3= new Ogrenci("Demet","Erzurum",dersList_demet);


        ogrenciList.add(ogrenci1);
        ogrenciList.add(ogrenci2);
        ogrenciList.add(ogrenci3);

        System.out.println(ogrenciList);
        System.out.println("------------");




    }
}
