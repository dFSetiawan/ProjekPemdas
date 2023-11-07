/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasBangunDatar;

import java.util.Scanner;
public class Lingkaran {
    public static void lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
