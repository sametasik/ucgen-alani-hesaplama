package Giris;
import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a, b, c;
       System.out.print("İlk Kenarı Giriniz:    ");
       a = input.nextInt();
       System.out.print("İkinci Kenarı Giriniz:     ");
       b = input.nextInt();
       System.out.print("Üçüncü Kenarı Giriniz:     ");
       c = input.nextInt();
       double alan, cevre, u;
       cevre = a + b + c;
       u = cevre/2;
       alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));
       System.out.print("Üçgenin Alanı:" + alan);






    }
}
