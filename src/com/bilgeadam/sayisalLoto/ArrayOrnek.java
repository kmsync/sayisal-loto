package com.bilgeadam.sayisalLoto;

public class ArrayOrnek {

    public static void main(String[] args) {

        // Arraylerin tipi belirtilmek zorundadır.
        int sayilar[] = new int[6];

        // Şu an 6'lı bir array oluşturduk, array indeksleri 0'dan 5'e kadardır.
        sayilar[0] = 23;
        sayilar[1] = 11;
        sayilar[2] = -35;
        sayilar[3] = 46;
        sayilar[4] = 0;
        sayilar[5] = -29;
        // Alttaki indeks hata verir 6. indeks tanımladığımız düzeydeki tanıma uymamaktadır.
        // (int sayilar[] = new int[6];)
        // sayilar[6]=500;

        // Array yazdıralım.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }
    }
}
