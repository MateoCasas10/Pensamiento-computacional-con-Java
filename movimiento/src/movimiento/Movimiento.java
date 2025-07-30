package movimiento;
import javax.swing.*;
public class Movimiento {
    String c_objeto, c_velocidad, c_tiempo;
    double velocidad, tiempo, distancia; 
    public void calculo ()
    {
        c_objeto = JOptionPane.showInputDialog("Ingrese el objeto que se mueve ");
        c_velocidad = JOptionPane.showInputDialog("Ingrese la velocidad del objeto en m/s: ");
        velocidad = Double.parseDouble (c_velocidad);
        c_tiempo = JOptionPane.showInputDialog("Ingrese el tiempo en segundos en el cual quiere saber la distancia recorrida: ");
        tiempo = Integer.parseInt (c_tiempo);
        distancia = velocidad * tiempo;
        JOptionPane.showMessageDialog(null,"La distancia recorrida por " + c_objeto + " en "+ tiempo + "s es: " + distancia);
    }
    public static void main(String[] args) {
        Movimiento tdistancia = new Movimiento ();
        tdistancia.calculo();
    } 
}

