package ifdoble;
import javax.swing.*;
public class Ifdoble {
    //Atributos
    String formula = "";
    //Método
    public void autorizacion ()
    {
        formula = JOptionPane.showInputDialog("Responda sí (con tilde) o no"
                + "¿Su fórmula ha sido validada por el doctor o doctora?");
        if (formula.equals("sí") || formula.equals("SÍ"))
        {
            JOptionPane.showInternalMessageDialog(null, "Sí se le entrega medicación al paciente");
        }
        else
        {
            JOptionPane.showInternalMessageDialog(null, "No se le entrega medicación al paciente");
        }
    }
    public static void main(String[] args) 
    {
       Ifdoble aceptado = new Ifdoble ();
       aceptado.autorizacion();
    }
    
}
