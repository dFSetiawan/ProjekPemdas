/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VdanLPBangunRuang;

import java.util.Scanner;

public class Kerucut {
    public static void kerucut() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari dasar kerucut: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();
        double volume = (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume kerucut adalah: " + volume);
        double luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(jariJari + tinggi, 2) + Math.pow(tinggi, 2)));
        System.out.println("Luas permukaan kerucut: " + luasPermukaan);
    }
}
