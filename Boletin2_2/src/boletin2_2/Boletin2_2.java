/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado=0;
        System.out.println("introducir valor");
            //pedir datos
            lado = Integer.parseInt(JOptionPane.showInputDialog("valor"));
            System.out.println("El area del cuadrado es: "+ (lado*lado));
    }
    
}
