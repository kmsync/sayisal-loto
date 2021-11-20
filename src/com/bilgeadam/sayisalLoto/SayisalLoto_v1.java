package com.bilgeadam.sayisalLoto;

import java.util.Random;

public class SayisalLoto_v1 {

    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        int sayi3 = 0;
        int sayi4 = 0;
        int sayi5 = 0;
        int sayi6 = 0;

        // Java 8 ile birlikte altta yazılı olan çoklu değişken initialize etme özelliği geldi.
       //int sayi7, sayi8, sayi9 = 0;

        Random rnd = new Random();

        // nextInt 0 ile gönderilen sayı-1 aralığında üretir.
        // 1 - gönderilen sayı aralığında üretilmesini içim +1 ekliyoru<.
        sayi1 = rnd.nextInt(49)+1;
        sayi2 = rnd.nextInt(49)+1;

        // Burada sayı2 sayı1'e eşit olduğu dürece, sayı2'yi yeniden üret diyoruz.
        // sayı2 sayı1'e eşit olmadığı zaman döngüden çıkabilir.
        while (sayi2==sayi1)
        {
            sayi2 = rnd.nextInt(49)+1;
        }

        sayi3 = rnd.nextInt(49)+1;
        while (sayi3==sayi1 || sayi3==sayi2) {
            sayi3 = rnd.nextInt(49)+1;
        }

        sayi4 = rnd.nextInt(49)+1;
        while (sayi4==sayi1 || sayi4==sayi2 || sayi4==sayi3) {
            sayi4 = rnd.nextInt(49) + 1;
        }

        sayi5 = rnd.nextInt(49)+1;
        while (sayi5==sayi1 || sayi5==sayi2 || sayi5==sayi3 || sayi5==sayi4) {
            sayi5 = rnd.nextInt(49)+1;
        }

        sayi6 = rnd.nextInt(49)+1;
        while (sayi6==sayi1 || sayi6==sayi2|| sayi6==sayi3|| sayi6==sayi4|| sayi6==sayi5) {
            sayi6 = rnd.nextInt(49)+1;
        }

        System.out.println(sayi1+"-"+sayi2+"-"+sayi3+"-"+sayi4+"-"+sayi5+"-"+sayi6);
    }

}