/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VdanLPBangunRuang;

import java.util.Scanner;
public class Kubus {
    public static void kubus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = input.nextDouble();
        double luasPermukaan = 6 * sisi * sisi;
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus adalah: "+volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }
}
