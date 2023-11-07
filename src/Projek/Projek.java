/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projek;
import java.util.Scanner;
import LuasBangunDatar.*;
import VdanLPBangunRuang.*;
public class Projek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("Pilih jenis perhitungan:");
            System.out.println("1. Volume dan Luas Permukaan Bangun Ruang");
            System.out.println("2. Luas Bangun Datar");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolumeBangunRuang();
                    break;
                case 2:
                    hitungLuasBangunDatar();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);
    }

    public static void hitungVolumeBangunRuang() {
        Scanner input = new Scanner(System.in);
        int jenisBangunRuang;
        
        System.out.println("Pilih jenis bangun ruang:");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("3. Bola");
        System.out.println("4. Kerucut");
        System.out.println("5. Kubus");
        System.out.print("Masukkan pilihan: ");
        jenisBangunRuang = input.nextInt();
        
        switch (jenisBangunRuang) {
            case 1:
                Balok.balok();
                break;
            case 2:
                Tabung.tabung();
                break;
            case 3:
                Bola.bola();
                break;
            case 4:
                Kerucut.kerucut();
                break;
            case 5:
                Kubus.kubus();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void hitungLuasBangunDatar() {
        Scanner input = new Scanner(System.in);
        int jenisBangunDatar;
        
        System.out.println("Pilih jenis bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan pilihan: ");
        jenisBangunDatar = input.nextInt();
        
        switch (jenisBangunDatar) {
            case 1:
                Persegi.persegi();
                break;
            case 2:
                PersegiPanjang.persegipanjang();
                break;
            case 3:
                Segitiga.segitiga();
                break;
            case 4:
                Lingkaran.lingkaran();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
