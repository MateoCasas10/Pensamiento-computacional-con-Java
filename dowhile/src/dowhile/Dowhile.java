package dowhile;
import javax.swing.*;
public class Dowhile {
    //Atributos
    String lote, continuar; 
    public void producto ()
    {
        do {
            lote = JOptionPane.showInputDialog(null,"Ingrese el lote del producto: ");
            if (lote.equals("fab0725-a14")||lote.equals("FAB0725-A14"))
            {
                JOptionPane.showInternalMessageDialog(null,"El producto debe ir a bodega.");
            }
            else if (lote.equals("fab0725-a15")||lote.equals("FAB0725-A15"))
            {
                JOptionPane.showInternalMessageDialog(null, "El producto debe ir al almacén.");
            }
            else if (lote.equals("fab0725-a16")||lote.equals("FAB0725-A16"))
            {
                JOptionPane.showInternalMessageDialog(null, "El producto debe ir al outlet");
            }
            else
            {
                JOptionPane.showInternalMessageDialog(null, "Error, lote incorrecto");
            }
            continuar = JOptionPane.showInputDialog(null,"¿Quiere consular otro ejemplar? (s/n)");
        }   while (continuar.equals("s"));
        JOptionPane.showInternalMessageDialog(null, "Fin del programa");
    }
    public static void main(String[] args) {
        Dowhile envio = new Dowhile();
        envio.producto();
    }
    
}
