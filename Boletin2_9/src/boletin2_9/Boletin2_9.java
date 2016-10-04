/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bill100,bill20,bill5,mon,result;
        bill100= Integer.parseInt(JOptionPane.showInputDialog("Billetes de 100"));
        bill20= Integer.parseInt(JOptionPane.showInputDialog("Billetes de 20"));
        bill5= Integer.parseInt(JOptionPane.showInputDialog("Billetes de 5"));
        mon= Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1"));
        result = (bill100*100)+(bill20*20)+(bill5*5)+mon;
        System.out.println("Total: "+ result);
    }
    
}
