package planta;
import javax.swing.*;
public class Planta {
    String c_inicio, c_tasa, c_dias;
    int inicio, dias;
    double tasa, plantas;
    public void crecimiento ()
    {
        c_inicio = JOptionPane.showInputDialog("Ingrese la cantidad actual de plantas: ");
        inicio = Integer.parseInt (c_inicio);
        c_tasa = JOptionPane.showInputDialog("Ingrese la tasa actual de crecimiento (por ejemplo, 0.20 para 20%): ");
        tasa = Double.parseDouble (c_tasa);
        c_dias = JOptionPane.showInputDialog("Ingrese la cantidad actual de plantas: ");
        dias = Integer.parseInt (c_dias);
        plantas = inicio * Math.pow (1 + tasa, dias);
        JOptionPane.showMessageDialog(null,"La cantidad de plantas después de" + dias + "días es: "+ plantas);
    }
    public static void main(String[] args) {
        Planta tplanta = new Planta ();
        tplanta.crecimiento ();
    }
    
}
