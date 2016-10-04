/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2,sum,res,mul,div;
        n1= Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        sum=n1+n2;
        res=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        System.out.println("La suma es= "+sum+ ", la resta es = "+res+", la multiplicacion es = "+mul+" y la division es = "+div);
    }
    
}
