// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Switch Case ile basit hesap makinesi.
        // Kullanıcıdan 2 sayı değeri alıcaz. Scanner kütüphanesini kullanalım.
        Scanner input = new Scanner(System.in);

        System.out.println("!! Hesap Makinesine Hoşgeldin !!");
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        int b = input.nextInt();

        System.out.println("---- Lütfen İşlem Seçiniz ----");
        System.out.print("1.) Toplama\n2.) Çıkarma\n3.) Çarpma\n4.) Bölme");
        int islem = input.nextInt();

        // Hesap ve switch kullanımı.

        switch (islem) {
            case 1 :
                System.out.println("Toplama işlemi sonucu : " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (a>b ? (a-b) : (b-a)));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (a * b));
                break;
            case 4:
                System.out.println("Bölme işlemi sonucu : " + (a>0 && b>0 ? (a/b) : "Bir sayı 0'a BÖLÜNEMEZ." ));
                break;
        }

    }
}