/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float cambio,devolver;
        int euros;
        cambio = Float.parseFloat(JOptionPane.showInputDialog("Valor del cambio"));
        euros = Integer.parseInt(JOptionPane.showInputDialog("Euros"));
        devolver = cambio*euros;
        System.out.println("Resultado= "+devolver+"$");
    }
    
}
