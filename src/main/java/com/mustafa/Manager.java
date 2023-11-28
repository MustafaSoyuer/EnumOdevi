package com.mustafa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Manager {
    Random random = new Random();
    int index = random.nextInt();
    List<Menu> menuListesi = new ArrayList<>();



    
    public void randomMenu(){
        for (int i = 0; i < 7; i++) {
            index = random.nextInt(0,7);
            ECorbalar corba = ECorbalar.values()[index];
            index = random.nextInt(0,7); // her biri için ayrı ayrı random yapıyoruz
            EIcecekler icecek = EIcecekler.values()[index];
            index = random.nextInt(0,7);
            EYemekler yemek = EYemekler.values()[index];
            index = random.nextInt(0,7);
            ETatlilar tatli = ETatlilar.values()[index];
            EGunler gun = EGunler.values()[i];
            menuListesi.add(i,new Menu(gun,corba,yemek,icecek,tatli)) ;
        }menuListesi.forEach(System.out::println);
    }

//    /**
//     * içecekler her güne sadece bir tane gelecek şekilde olan metot
//     */

            /*
             hocam extra verilen ödev için;  bir içecek listesi yapıp, bu listeden verdiğim rastgele sayı ile
             remove yapmayı denedim. içecekler listesinin boyutu azaldığı için diye düşünüyorum
             IndexOutOfBoundsException hatası alıyorum.ama çözemedim malesef

             */



//    LinkedList<EIcecekler> iceceklerListesi = new LinkedList<>();
//
//
//    public void randomMenu2(){
//        iceceklerListesi.add(EIcecekler.KOLA);
//        iceceklerListesi.add(EIcecekler.FANTA);
//        iceceklerListesi.add(EIcecekler.SPRITE);
//        iceceklerListesi.add(EIcecekler.ICE_TEA);
//        iceceklerListesi.add(EIcecekler.AYRAN);
//        iceceklerListesi.add(EIcecekler.SALGAM);
//        iceceklerListesi.add(EIcecekler.MEYVE_SUYU);
//        index = random.nextInt(0,7);
//        for (int i = 0; i < 7; i++) {
//            EIcecekler icecek=iceceklerListesi.remove(index);
//            ECorbalar corba = ECorbalar.values()[index];
//            EYemekler yemek = EYemekler.values()[index];
//            ETatlilar tatli = ETatlilar.values()[index];
//            EGunler gun = EGunler.values()[i];
//            menuListesi.add(i,new Menu(gun,corba,yemek,icecek,tatli)) ;
//            iceceklerListesi.forEach(System.out::println);
//        }menuListesi.forEach(System.out::println);
//    }
    

}
