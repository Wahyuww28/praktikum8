package com.Praktikum8;

public class Data {
    private String[] kodeBarang = {"001", "002", "003", "004", "005"};
    private String[] namaBarang = {"Buku", "Pensil", "Pulpen", "Penggaris", "Penghapus"};
    private int[] hargaBarang = {3000, 4000, 5000, 2000, 1000};

    public int cariBarang(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equals(kode)) {
                return i; 
            }
        }
        return -1; 
    }

    public String getNamaBarang(int index) {
        return namaBarang[index];
    }

    public int getHargaBarang(int index) {
        return hargaBarang[index];
    }
    
}
