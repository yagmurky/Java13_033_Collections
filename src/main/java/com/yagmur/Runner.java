package com.yagmur;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> ifadeDizisi = new ArrayList<>();
        ifadeDizisi.add("muhammet");
        ifadeDizisi.add("Bugün hava güneşli");

        ifadeDizisi.add("demet");
        ifadeDizisi.add(1,"hakan");

        for (String ifade: ifadeDizisi){
            System.out.println(ifade);
        }
        System.out.println("-----");
        System.out.println(ifadeDizisi);

    }
}
