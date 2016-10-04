/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millas,metros,cte;
        cte=1609.344 ;
        millas = Double.parseDouble(JOptionPane.showInputDialog("Millas:"));
        metros= millas*cte;
        System.out.println("Millas-Metros= "+metros);
    }
    
}
