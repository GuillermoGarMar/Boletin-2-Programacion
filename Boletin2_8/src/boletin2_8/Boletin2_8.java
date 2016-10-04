/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double c,k,f;
        c= Double.parseDouble(JOptionPane.showInputDialog("Grados ºC:"));
        k=c+273;
        f=c*1.8+32;
        System.out.println("ºK: "+ k);
        System.out.println("ºF: "+ f);
    }
    
}
