package com.yagmur.List;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        /**
         * Çok biçimlilik
         */

        List<String> musteriIsımleri = new ArrayList<>();
        /**
         * add(value) ---> Listeye kayıt eklemek
         * add(index, value) ---> İstenilen konuma kayıt eklemek için kullanılır.
         *
         * DİKKAT!!! Eğer girilen index sınnıfların doşında yani dizinin böyle bir indexi uoksa uygulama istisna fırlatır.
         */
        musteriIsımleri.add("Murat");
        musteriIsımleri.add("Tekin");
        musteriIsımleri.add("Elif");
        musteriIsımleri.add("Bahar");
        musteriIsımleri.add(1,"Gül");
        //musteriIsımleri.add(100,"Betül"); Exception -> IndexOutOfBoundsException: Index: 100, Size:5

        /**
         * Okuma işlemi
         * get(index) -> var olan kaydı getirir.
         */
        System.out.println("2 numaralı indexteki müşteri...: "+musteriIsımleri.get(2));

        /**
         * Bir liste içinde dolaşarak bilgileri okuma işlemi
         * 1-> foreach
         * 2-> for
         * 3-> lambda expression
         */
        System.out.println("-------------------");
        System.out.println("----- foreach -----");
        System.out.println("-------------------");
        for (String musteri: musteriIsımleri){
            System.out.println(musteri);
        }

        System.out.println("-------------------");
        System.out.println("------- for -------");
        System.out.println("-------------------");
        for (int i = 0; i < musteriIsımleri.size(); i++) {
            System.out.println(musteriIsımleri.get(i));
        }

        System.out.println("-------------------");
        System.out.println("----  stream   ----");
        System.out.println("-------------------");
        musteriIsımleri.forEach(m-> System.out.println(m));

        System.out.println("-------------------");
        System.out.println("----  stream2  ----");
        System.out.println("-------------------");
        musteriIsımleri.forEach(System.out::println);




    }
}
