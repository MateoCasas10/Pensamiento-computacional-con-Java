package notas;
import javax.swing.*;
public class Notas {
    String c_cantidad, c_nota;
    double nota, suma, promedio;
    int cantidad;
    public void notas ()
    {
        c_cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de notas: ");
        cantidad = Integer.parseInt (c_cantidad);
        for (int i = 0; i < cantidad; i++)
        {
            c_nota = JOptionPane.showInputDialog("Ingrese la nota: ");
            nota = Double.parseDouble (c_nota);
            suma += nota;
            promedio = suma / cantidad;
        }
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
    public static void main(String[] args) 
    {
        Notas pnotas = new Notas ();
        pnotas.notas ();
    }
    
}
