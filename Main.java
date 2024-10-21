package com.Praktikum8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
            
            
            Data daftar = new Data();
            System.out.println("Masukkan Item Barang: ");
            int jumlahItem = input.nextInt();
            
          
            String[] kodeInput = new String[jumlahItem];
            int[] jumlahBeli = new int[jumlahItem];
            int totalBayar = 0;
            

           
            for (int i = 0; i < jumlahItem; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan Kode: ");
                kodeInput[i] = input.next();
                System.out.print("Masukkan Jumlah Beli: ");
                jumlahBeli[i] = input.nextInt();
            }
            
            
          
            System.out.println("============================================================");
            System.out.printf("%-3s %-10s %-12s %-8s %-10s %-12s\n", "No", "Kode", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
            System.out.println("============================================================");
            
            for (int i = 0; i < jumlahItem; i++) {
               
                int indexBarang = daftar.cariBarang(kodeInput[i]);
                
                if (indexBarang != -1) {
                    String namaBarang = daftar.getNamaBarang(indexBarang);
                    int hargaBarang = daftar.getHargaBarang(indexBarang);
                    int jumlahBayar = hargaBarang * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    System.out.printf("%-3d %-10s %-12s %-8d %-10d %-12d\n", (i + 1), kodeInput[i], namaBarang, hargaBarang, jumlahBeli[i], jumlahBayar);
                } else {
                    System.out.println("Kode barang tidak ditemukan: " + kodeInput[i]);
                }
            }
            
            // Total bayar
            System.out.println("============================================================");
            System.out.println("Total Bayar \t\t\t\t\t\t" + totalBayar);
        }
    }

