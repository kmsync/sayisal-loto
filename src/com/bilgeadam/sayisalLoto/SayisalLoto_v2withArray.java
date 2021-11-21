package com.bilgeadam.sayisalLoto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_v2withArray {

    // statik değişkene, obje oluşturmadan
    // class_adı.değişken diye erişebiliyoruz.

    private static final int MAX_SAYI = 90;
    private static final int KAC_SAYI = 6;

    Random rnd = new Random();

    public int sayiGetir() {
        // nextInt(90) metodu 0-89 arası üretir.
        // 1'den başlasın diye 1 ekliyoruz.
        return rnd.nextInt(MAX_SAYI) + 1;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi) {
        // binarySearch ile arayacağız.
        // binarySearch kullanmanın şartı, arrayin sıralı olmasıdır.

        // Array'i sıralayalım.
        Arrays.sort(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, sayi);

        // If ile tek satırlık bir karşılaştırma yapılacak ise süslü parantez {} kullanmaya gerek yoktur.
        // Birden fazla satır ise mutlaka koyulmalıdır.

        if (sonuc >= 0)
            return true;
        else
            return false;
    }

//    public void testArraydeVarmi() {
//        int sayilar[] = {13, 45, 67, -4, 41, 70};
//
//        int sayi = 67;
//
//        boolean sonuc = arraydeVarmi(sayilar, sayi);
//
//        if (sonuc == true)
//            System.out.println("Array'de var!");
//        else
//            System.out.println("Array'de yok!");
//    }

    public static void main(String[] args) {

        // Yeni Çılgın Sayısal Loto'ya uygun şekilde kuralları yazalım.
        // 90 sayıdan 6 tane seçeceğiz.
        // https://www.millipiyangoonline.com/sayisal-loto/nasil-oynanir

        SayisalLoto_v2withArray loto = new SayisalLoto_v2withArray();

//        loto.testArraydeVarmi();

        // Sayıları tutacağımız bir Array tanımlayalım.
        int sayilar[] = new int[KAC_SAYI];

        // Döngüyle Array'a rastgele sayıları atayalım.
        for (int i = 0; i < sayilar.length; i++) {

            int rastgeleSayi = loto.sayiGetir();

            // Rastgele sayı Array'de varsa döngüyle tekrar sayı üretilecek.
            // Array'de olmayan sayı bulunana kadar döngü devam edilecek.
            boolean sonuc = loto.arraydeVarmi(sayilar, rastgeleSayi);
            while (sonuc == true) {
                rastgeleSayi = loto.sayiGetir();
                sonuc = loto.arraydeVarmi(sayilar, rastgeleSayi);
            }

            // Hep Array'in ilk elemanına yazalım rastgele üretilen sayıyı.
            // Çünkü sıralanan sayılar sonlara eklenir.
            sayilar[0] = rastgeleSayi;

            // 6. Sayıyı sıfır indekse yazınca, tekrar sıranması için bunu ekledik.
            Arrays.sort(sayilar);
        }

        // Array'i yazdıralım.
        for (int i = 0; i < sayilar.length; i++) {

            if (i == sayilar.length - 1)
                System.out.print(sayilar[i]);
            else
                System.out.print(sayilar[i] + "-");
        }
    }
}