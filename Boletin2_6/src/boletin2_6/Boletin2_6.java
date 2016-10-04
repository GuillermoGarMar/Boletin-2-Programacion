/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tarif,prez,desc;
        tarif= Double.parseDouble(JOptionPane.showInputDialog("Tarifa:"));
        prez= Double.parseDouble(JOptionPane.showInputDialog("Precio:"));
        desc=(tarif*100)/prez;
        System.out.println("El descuento es del "+desc+"%");
    }
    
}
