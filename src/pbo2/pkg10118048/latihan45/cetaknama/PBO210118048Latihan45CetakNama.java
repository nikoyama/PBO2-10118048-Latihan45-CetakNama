/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : Mencetak nama sebanyak yang diinginkan
 */
public class PBO210118048Latihan45CetakNama {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }

}
