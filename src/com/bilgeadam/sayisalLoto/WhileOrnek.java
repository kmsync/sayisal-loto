package com.bilgeadam.sayisalLoto;

public class WhileOrnek {

    // for döngüsünden farkı, sayıdan çok duruma bağlı olmasıdır.

    // While döngüsü ile 1'den 10'a kadar merhaba yazıralım.
    public static void main(String[] args) {

        int sayac = 1;
        while (sayac <= 10) {
            System.out.println(sayac + " " + "Merhaba");

            // While döngüsünde sayaç eklenmez ise sonsuz döngüye girer.
            // Bazen eklenmesi bu unutulur. Eklenmediği zaman program sonsuz döngüye girer.
            sayac = sayac + 1;
        }
    }
}