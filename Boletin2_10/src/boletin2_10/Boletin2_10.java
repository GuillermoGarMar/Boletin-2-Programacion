/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bill100 =0;
        int bill20 =0;
        int bill5 =0;
        int mon =0;
        int euros;
        euros= Integer.parseInt(JOptionPane.showInputDialog("Euros:"));
        if(euros>=100){
            bill100=euros/100;
            euros= euros%100;
        }
        if(euros>=20){
            bill20=euros/20;
            euros= euros%20;
        }
        if(euros>=5){
            bill5=euros/5;
            euros= euros%5;
        }
        if(euros>=1){
            mon=euros/1;
         
        }
        System.out.println("Billetes de 100= "+bill100+ ", Billetes de 20 = "+bill20+", billetes de 5 = "+bill5+" y monedas de 1 = "+mon);
    }
    
}
