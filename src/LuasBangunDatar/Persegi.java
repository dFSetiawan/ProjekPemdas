/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasBangunDatar;

import java.util.Scanner;
public class Persegi {
    public static void persegi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas);
    }
}
