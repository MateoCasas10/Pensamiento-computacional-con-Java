package pkgwhile;
import javax.swing.*;
import java.util.ArrayList;
public class While {
    //Atributos
    String codigo, c_ventas, continuar = "s";
    int ventas;
    ArrayList<String> codigos = new ArrayList<>();
    ArrayList<Integer> ventaslista = new ArrayList<>();
    ArrayList<Boolean> incentivos = new ArrayList<>();
    //Método
    public void empleados (){
        while (continuar.equals("s")){
            codigo = JOptionPane.showInputDialog(null,"Ingrese el código del empleado: ");
            c_ventas = JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos vendidos: ");
            ventas = Integer.parseInt(c_ventas);
            codigos.add(codigo);
            ventaslista.add(ventas);
            incentivos.add(ventas>30);
            continuar = JOptionPane.showInputDialog(null,"¿Hay más empleados? (s/n)");
        }
        String resultado = String.format("%-15s%-15s%-15s\n", "Código", "Ventas", "Incentivo");
        for (int i = 0; i < codigos.size(); i++) {
        resultado += String.format("%-15s%-19d%-15s\n",
        codigos.get(i),
        ventaslista.get(i),
        incentivos.get(i) ? "sí" : "no"
    );
}
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static void main(String[] args) {
        While consolidado = new While ();
        consolidado.empleados();
    }
    
}
