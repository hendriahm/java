/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab_iii;

/**
 *
 * @author Cipta Ramadhani
 */
public class bangun_ruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sisi,panjang, lebar, tinggi;
        double luas;
        sisi=5;
        panjang=4;
        lebar=2;
        tinggi=9;
        
        // luas balok
        luas=2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("luas balok adalah "+luas);
        
        // volume balok
        luas=6*sisi*sisi;
        System.out.println("luas kubus adalah:"+luas);
        
    }
}
