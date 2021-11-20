package com.bilgeadam.sayisalLoto;

import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int maxSayi) {
        Random rnd = new Random();
        return rnd.nextInt(maxSayi) + 1;
    }

    public static void main(String[] args) {

        SayisalLoto loto = new SayisalLoto();
        // 6'lı bir Array oluşturduk.
        int sayilar[] = new int[6];

        // Döngüyle Array'i oluşturalım.
        for (int i = 0; i < 6; i++) {
            sayilar[i] = loto.sayiGetir(49);
        }

        // Array'i yazdıralım.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }
    }
}