/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maksmin;

import java.util.Scanner;


/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Menampilkan Nilai Maks dan Min
 *
 * @author LENOVO
 */
public class MaksMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("=== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ===");
        System.out.print("Masukkan Nama Petugas : ");
        String nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int mhs = input.nextInt();
        int[] nilai = new int[mhs];
        System.out.println("");
        
        System.out.print("Masukkan Nilai Mahasiswa ke- 1 = " );
        nilai[0]= input.nextInt();
        int maks=nilai[0];
        int min =nilai[0];
        for (int i = 1; i < mhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke- "+(i+1)+" = ");
            nilai[i]=input.nextInt();
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
            if(nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.println("");
        System.out.println("Nilai Terbesar = "+maks);
        System.out.println("Nilai Terkecil = "+min);
        
    }
        
        
        
        
}
    
