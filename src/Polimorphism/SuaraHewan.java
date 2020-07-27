/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphism;

/**
 *
 * @author DIRs Family
 */
public class SuaraHewan {
    public static void main(String[] args) {
        Hewan HEWAN = new Hewan ();
        kuda KUDA = new kuda ();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
        
    }
    
}
