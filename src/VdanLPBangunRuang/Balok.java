
package VdanLPBangunRuang;

import java.util.Scanner;

public class Balok {
    public static void balok() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
        double luaspermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Balok adalah : "+luaspermukaan);
    }
}
