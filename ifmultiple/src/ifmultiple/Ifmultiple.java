package ifmultiple;
import javax.swing.*;
public class Ifmultiple {
//Atributos
    String c_opcion, c_compra;
    int opcion, compra;
    //Métodos
    public void descuento()
    {
        c_compra = JOptionPane.showInputDialog("Ingrese el valor de la compra. \n"
                + "Sin coma ni puntos:  ");
        compra = Integer.parseInt(c_compra);
        
        do{
            c_opcion = JOptionPane.showInputDialog("Menú:\n"
         + "1. Para consultar los productos en descuento.\n "
         + "2. Para saber el tipo de descuento.\n "
         + "3. Para salir del menú.");
         opcion = Integer.parseInt(c_opcion);
           switch (opcion){
              case 1: {
                     JOptionPane.showMessageDialog(null,
                        "Categoria de Productos con descuento:\n"
                                + "1. Electrodomésticos\n"
                                + "2. Aseo\n"
                                + "3. Cocina");
                     break;
                    }
               case 2: 
               {
                 if (compra>=1000000){
                    JOptionPane.showMessageDialog(null, 
                     "Tiene el 70% de descuento en productos seleccionados");
                 }
                 if (compra>=500000 & compra<1000000){
                    JOptionPane.showMessageDialog(null, 
                     "Tiene el 50% de descuento en productos seleccionados");
                 }
                 if(compra>=250000 & compra<500000){
                    JOptionPane.showMessageDialog(null, 
                     "Tiene el 25% de descuento en productos seleccionados");
                 }
                 if(compra>=100000 & compra<250000){
                    JOptionPane.showMessageDialog(null, 
                     "Tiene el 10% de descuento en productos seleccionados");
                 }
                 if(compra<100000){
                    JOptionPane.showMessageDialog(null, 
                     "No tiene descuento");
                 }
                 break;
                }
                case 3:{
                 JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                 break;
                   }
            default:{
                break;
            }
         }
        } while(opcion!=3);
    }
    public static void main(String[] args) {
        Ifmultiple cliente = new Ifmultiple();
        cliente.descuento();
    }
    
}
