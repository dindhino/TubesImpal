/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhino
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TEST APLIKASI (FUNGSIONALITAS PASIEN)");
        System.out.println("");
        
        System.out.println("ADD 1 PASIEN");
        Pasien p = new Pasien("DINDIN DHINO ALAMSYAH", "PAS-1", "dhino", 1);
        System.out.println("Nama Pasien : " + p.getNamaPasien());
        
        System.out.println("");
        
        System.out.println("ADD 3 DOKTER");
        Dokter d1 = new Dokter("NUR INDAH PUSPA IDHAM", "DOK-1", "indah", "jonggol");
        Dokter d2 = new Dokter("FAZA GHASSANI", "DOK-2", "ganis", "jonggol");
        Dokter d3 = new Dokter("ANGGIE NASTITI", "DOK-3", "anggie", "jonggol");
        System.out.println("Nama Dokter 1 : " + d1.getNamaDokter());
        System.out.println("Nama Dokter 2 : " + d2.getNamaDokter());
        System.out.println("Nama Dokter 3 : " + d3.getNamaDokter());
        
        System.out.println("");
        
        
        System.out.println("ADD 1 JADWAL");
        Jadwal j1 = new Jadwal("PAGI", "KAMIS", "10NOV2016");
        System.out.println("Jadwal : " + j1.getShift() + "-" + j1.getHari() + "-" + j1.getTanggal());
        
        System.out.println(""); 
        System.out.println("ADD DOKTER 3 KE JADWAL");
        j1.setDokter(d3);
        d3.setPasien(p);
        System.out.println("");
        
        System.out.println("PASIEN MEMILIH JADWAL");
        p.memilihShiftPenjadwalan(j1);
        
        p.viewJadwalPeriksa(p.getJadwal().get(0));
        System.out.println("");
    }
    
}
