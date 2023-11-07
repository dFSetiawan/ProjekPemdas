/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasBangunDatar;

import java.util.Scanner;
public class Segitiga {
    public static void segitiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
