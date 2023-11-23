package com.yagmur.List.ArrayList.Odev;

import java.util.ArrayList;
import java.util.List;

public class Runner_Odev {
    public static void main(String[] args) {
        List<Urun> urunList=new ArrayList<>();

        Ozellik ozellikpc= new Ozellik(1,"CPU","2.El");
        Ozellik ozellikpc2= new Ozellik(2,"Ram","Çok hızlı.");

        List<Ozellik> ozellikList_pc=new ArrayList<>();
        ozellikList_pc.add(ozellikpc);
        ozellikList_pc.add(ozellikpc2);

        Urun urunpc= new Urun(1,"PC", "56.000",ozellikList_pc);

        urunList.add(urunpc);

        System.out.println(urunList);



    }


}
