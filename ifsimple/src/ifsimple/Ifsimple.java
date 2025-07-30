package ifsimple;
import javax.swing.*;
public class Ifsimple {
    //Atributos
    String c_num1, c_num2, c_num3;
    double num1, num2, num3;
    //Métodos
    public void numeromayor ()
    {
        c_num1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        num1 = Double.parseDouble(c_num1);
        c_num2 = JOptionPane.showInputDialog("Ingrese el segundo número ");
        num2 = Double.parseDouble(c_num2);
        c_num3 = JOptionPane.showInputDialog("Ingrese el tercer número");
        num3 = Double.parseDouble(c_num3);
        
        if (num1 > num2 && num1 > num3)
        {
            JOptionPane.showInternalMessageDialog(null, "El número mayor es: " + num1);
        }
        if (num2 > num1 && num2 > num3)
        {
            JOptionPane.showInternalMessageDialog(null, "El  número mayor es: " + num2);
        }
        if (num3 > num1 && num3 > num2)
        {
            JOptionPane.showInternalMessageDialog(null, "El número mayor es: " + num3);
        }
    }
    public static void main(String[] args) 
    {
       Ifsimple mayor = new Ifsimple ();
       mayor.numeromayor();
    }
    
}
