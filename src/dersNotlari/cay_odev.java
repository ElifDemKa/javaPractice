package dersNotlari;

import java.util.Scanner;

public class cay_odev {
    public static void main(String[] args) {
       /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Günde kac bardak cay iciyorsunuz?");
        double bardak = scan.nextDouble();
/*
        if (bardak<0){
            System.out.println("Gecerli deger girmediniz, sonuc hesaplanamiyor, yeniden baslayiniz");
        } else if (bardak==0) {
            System.out.println("Bardak sayisi 0 ise hesaplama yapilamaz.");
        }else {
            System.out.println("Her bardak icin kac küp seker kullaniyorsunuz?");
            double seker= scan.nextDouble();

            double yilliksekertuketimi=(bardak*seker*2.77)*365/1000;
            double kirkyilliksekertuketimi=yilliksekertuketimi*40;

            if (seker==0){
                System.out.println("Aferin, boyle devam et :)");
            } else if (seker<0) {
                System.out.println("Negatif deger girdiniz, sonuc hesaplanamiyor. Lütfen yeniden baslayiniz");
            }else {
                System.out.println("Yillik seker tüketimi: " + yilliksekertuketimi + "\nKirkyillik seker tüketimi:" + kirkyilliksekertuketimi);
            }

        }

 */
        while (bardak <= 0) {
            System.out.println("Yanlis deger girdiniz, pozitif deger girmelisiniz. \n Günde kac bardak cay iciyorsunuz? ");
            bardak = scan.nextDouble();
        }
        System.out.println("Her bardak icin kac adet kup seker kullaniyorsunuz?");
        double seker = scan.nextDouble();

        while (seker < 0) {
            System.out.println("Yanlis deger girdiniz, pozitif deger girmelisiniz. \n Her bardak icin kac adet kup seker kullaniyorsunuz?");
            seker = scan.nextDouble();
        }
        if (seker == 0) {
            System.out.println("Aferin, boyle devam et :)");
        } else {
            double yillikSekerTuketimi = (bardak * seker * 2.77) * 365 / 1000;
            double kirkYillikSekerTuketimi = yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketiminiz : " + yillikSekerTuketimi);
            System.out.println("Kirk yillik seker tuketiminiz : " + kirkYillikSekerTuketimi);

        }
    }
}
