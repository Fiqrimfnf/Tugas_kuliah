/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_7.Latihan.Overriding;

/**
 *
 * @author Maulana
 */
public class B extends A{
    public void tampilkanKeLayar(){
        
        super.tampilkanKeLayar(); //Memanggil method milik dari superclass.
        
        System.out.println("Method milik class B dipanggil");
    }
}
