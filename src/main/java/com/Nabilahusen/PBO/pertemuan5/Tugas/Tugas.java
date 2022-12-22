
package com.Nabilahusen.PBO.pertemuan5.Tugas;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        
          String[][]tol = new String[4][4];
          Scanner scan = new Scanner(System.in);
          
          // mengisi setiap pintu tol
          System.out.println("    Nama Kendaraan   ");
          for(int bar = 0; bar < tol.length; bar++){
              for(int kol = 0; kol < tol[bar].length; kol++){
                System.out.format("Kendaraan pada Pintu Tol (%d,%d): ", bar, kol);
                tol[bar][kol] = scan.nextLine();
              }
          }
          System.out.println();
          
          // Menampilkan isi Array 
          System.out.println("====Gerbang Tol Bekasi====");
          System.out.println("|Pintu Tol 1|  |Pintu Tol 2|    |Pintu Tol 3|    |Pintu Tol 4|");
          for(int bar = 0; bar < tol.length; bar++){
              for(int kol = 0; kol < tol[bar].length; kol++){
                System.out.format("| %s | \t", tol[bar][kol]);
              }
              System.out.println("");
          }
        
    }
}
