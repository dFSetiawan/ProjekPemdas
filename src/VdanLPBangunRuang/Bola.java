/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VdanLPBangunRuang;

import java.util.Scanner;
public class Bola {
    public static void bola() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola adalah: " + volume);
        double luaspermukaan = jariJari * jariJari*22/7*4;
        System.out.println("Luas Permukaan Bola adalah : "+luaspermukaan);
    }
}
