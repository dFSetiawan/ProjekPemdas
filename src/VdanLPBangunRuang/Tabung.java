/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VdanLPBangunRuang;

import java.util.Scanner;

public class Tabung {
    public static void tabung() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung adalah: " + volume);
        double luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan tabung adalah: " + luasPermukaan);
    }
}
