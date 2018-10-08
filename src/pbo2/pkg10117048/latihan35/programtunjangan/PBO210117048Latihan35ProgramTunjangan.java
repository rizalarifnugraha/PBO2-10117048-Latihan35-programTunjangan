/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini tentang menghitung tunjangan berdasarkan 
 *                     status dengan  menggunakan OO.
 */
public class PBO210117048Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaPok;
        String status;

        Scanner in = new Scanner(System.in);
        Tunjangan tun = new Tunjangan();
        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: " + "Rp.");
        gaPok = in.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = in.next();
        System.out.println("");

        tun.Tunjangan(gaPok, status);
        System.out.println("(Developed by : Rizal Arif Nugraha)");

    }

}
