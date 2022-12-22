
package com.Nabilahusen.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        // Class object
        Mobil mb = new Mobil();
//        Bis bs = new Bis();
        Kendaraan kn = new Kendaraan();
        
        // Memasukkan nilai attribute
        mb.nama = "Honda";
        mb.jmlRoda = 4;
        mb.maxGear = 8;
        
        kn.nama = "Kendaraan Mobilio";
        kn.jmlRoda = 4;
        

        // Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();
        
        System.out.println();
        kn.showInfo();
        kn.nyalakanMesin();
        
    }
}
