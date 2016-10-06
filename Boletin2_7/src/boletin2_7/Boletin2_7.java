/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n,t,i,renda;
        n= Double.parseDouble(JOptionPane.showInputDialog("Valor n:"));
        t= Double.parseDouble(JOptionPane.showInputDialog("Valor t:"));
        i= Double.parseDouble(JOptionPane.showInputDialog("Valor i:"));
        t=t*12;
        i= i/1200;
        renda= (n* Math.pow((1+i),t)*i)/Math.pow((1+i), t);
        System.out.println("A renda é: "+ renda);
    }
    
}
