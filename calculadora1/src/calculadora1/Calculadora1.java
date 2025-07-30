package calculadora1;
import javax.swing.*;
public class Calculadora1 {
    //Atributos
    String c_num1, c_num2, c_opcion;
    double num1, num2, resultado;
    int opcion;
    //Metodos
    public void suma ()
    {
        c_num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        num1 = Double.parseDouble (c_num1);
        c_num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        num2 = Double.parseDouble (c_num2);
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void resta ()
    {
        c_num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        num1 = Double.parseDouble (c_num1);
        c_num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        num2 = Double.parseDouble (c_num2);
        resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void multiplicacion ()
    {
        c_num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        num1 = Double.parseDouble (c_num1);
        c_num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        num2 = Double.parseDouble (c_num2);
        resultado = num1 * num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void division ()
    {
        c_num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        num1 = Double.parseDouble (c_num1);
        c_num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        num2 = Double.parseDouble (c_num2);
        resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void menu ()
    {
        while (true)
        {
            c_opcion = JOptionPane.showInputDialog( "Bienvenido al men\u00fa de la calculadora\n"+
            "Seleccione la opci\u00f3n que desea ejecutar:\n"+
            "1. Suma\n"+
            "2. Resta\n"+
            "3. Multiplicaci\u00f3n\n"+
            "4. Divisi\u00f3n\n"+
            "5. Salir \n");
            opcion = Integer.parseInt (c_opcion);
            switch (opcion)
            {
                case 1:
                    suma ();
                    break;
                case 2:
                    resta ();
                    break;
                case 3:
                    multiplicacion ();
                    break;
                case 4:
                    division ();
                    break;
                case 5:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
        
    }
    public static void main (String [] agrs)
    {
        Calculadora1 calculadora = new Calculadora1 ();
        calculadora.menu ();
    }
}
