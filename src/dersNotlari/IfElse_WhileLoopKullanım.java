package dersNotlari;

import java.util.Random;
import java.util.Scanner;

public class IfElse_WhileLoopKullanım {
    /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int kullanicisecimi=0;
        int bilgisayarinsecimi=0;

        int kullanici=0;
        int bilgisayar=0;

        do {
            System.out.println("Hosgeldiniz! Lütfen seciminizi sayi olarak giriniz. Tas icin 1, Kagit icin 2, Makas icin 3 yaziniz");
            kullanicisecimi= scan.nextInt();
            bilgisayarinsecimi= random.nextInt(3)+1;

            if (kullanicisecimi==1 && bilgisayarinsecimi==2){
                System.out.println("Kâğıt taşı sarar, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==1 && bilgisayarinsecimi==3) {
                System.out.println("Taş makası kırar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==2 && bilgisayarinsecimi==1) {
                System.out.println("Kâğıt taşı sarar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==2 && bilgisayarinsecimi==3) {
                System.out.println("Makas kağıdı keser, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==3 && bilgisayarinsecimi==1) {
                System.out.println("Taş makası kırar, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==3 && bilgisayarinsecimi==2) {
                System.out.println("Makas kağıdı keser, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            }else {
                System.out.println("Bebabere kaldinizzzzz!");
                System.out.println("Kullanici skoru: "+ kullanici + " " +" Bilgisayarin skoru: "+ bilgisayar);
            }
        }while (kullanici!=5 && bilgisayar!=5);


        if (kullanici>bilgisayar){
            System.out.println("Siz kazandiniz! Bugün sansli günündesin");
        }else {
            System.out.println("Bilgisayar seni yendiiii!!!");
        }





    }
}
