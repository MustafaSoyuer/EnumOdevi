package com.mustafa;

public class Menu {
    private EGunler gun;
    private ECorbalar corba;
    private EYemekler yemek;
    private EIcecekler icecek;
    private ETatlilar tatli;


    public Menu() {
    }

    public Menu(EGunler gun, ECorbalar corba, EYemekler yemek, EIcecekler icecek, ETatlilar tatli) {
        this.gun = gun;
        this.corba = corba;
        this.yemek = yemek;
        this.icecek = icecek;
        this.tatli = tatli;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "gun=" + gun +
                ", corba=" + corba +
                ", yemek=" + yemek +
                ", icecek=" + icecek +
                ", tatli=" + tatli +
                '}';
    }

    public EGunler getGun() {
        return gun;
    }

    public void setGun(EGunler gun) {
        this.gun = gun;
    }

    public ECorbalar getCorba() {
        return corba;
    }

    public void setCorba(ECorbalar corba) {
        this.corba = corba;
    }

    public EYemekler getYemek() {
        return yemek;
    }

    public void setYemek(EYemekler yemek) {
        this.yemek = yemek;
    }

    public EIcecekler getIcecek() {
        return icecek;
    }

    public void setIcecek(EIcecekler icecek) {
        this.icecek = icecek;
    }

    public ETatlilar getTatli() {
        return tatli;
    }

    public void setTatli(ETatlilar tatli) {
        this.tatli = tatli;
    }
}
