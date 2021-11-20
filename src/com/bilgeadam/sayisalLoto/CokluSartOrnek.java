package com.bilgeadam.sayisalLoto;

public class CokluSartOrnek {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 35;
        int sayi3 = 41;

        // veya(or) operatörü ||
        // ve(and) operatörü &&
        if (sayi3 == sayi1 || sayi3 == sayi2) {

            System.out.println("Tekrarlanan sayı var!");

        }

        while (sayi3 != sayi1 && sayi3 != sayi2) {
            System.out.println("Sayı3 diğerlerine eşit değil!");

            sayi3 = sayi1;
        }

    }

}
