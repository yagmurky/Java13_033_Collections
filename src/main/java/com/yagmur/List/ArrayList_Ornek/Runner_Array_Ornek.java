package com.yagmur.List.ArrayList_Ornek;

import java.util.ArrayList;
import java.util.List;

public class Runner_Array_Ornek {
    public static void main(String[] args) {

        /**
         * Galericinin araçlarının listesini görmek istiyoruz.
         * önce ekleyueceğiz sonra listeleme işlemi yapacağız.
         */

        Arac arac1=new Arac("06 AA", "BMW", "İ7",5_000_000_000d);
        Arac arac2=new Arac("06 AAB", "BMW", "İ8",6_000_000_000d);
        Arac arac3=new Arac("06 AAC", "BMW", "İ9",7_000_000_000d);
        Arac arac4=new Arac("06 AAD", "BMW", "İ10",8_000_000_000d);

        List<Arac> araclar=new ArrayList<>();
        araclar.add(arac1);
        araclar.add(arac2);
        araclar.add(arac3);
        araclar.add(arac4);
        System.out.println(araclar);

        System.out.println("---------");

        for (Arac arac: araclar){
            System.out.println(arac);
        }
        System.out.println("----------");

        araclar.forEach(System.out::println);
        System.out.println("------------");
        araclar.forEach(m-> System.out.println(m));

        System.out.println("-----------");
        for (int i = 0; i < araclar.size(); i++) {
            System.out.println(araclar.get(i));
        }

        araclar.forEach(arac -> {
            System.out.println(arac.fiyat);
            System.out.println(arac.durum);
            System.out.println(arac.id);
            System.out.println(arac.marka);
            System.out.println(arac.model);
        });


    }
}
