/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasBangunDatar;

import java.util.Scanner;
public class PersegiPanjang {
    public static void persegipanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
