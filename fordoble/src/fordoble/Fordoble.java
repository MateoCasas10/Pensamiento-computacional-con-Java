package fordoble;
import javax.swing.*;
public class Fordoble {
//Atributos
    String c_semana,c_t_diaria;
    int semana;
    double t_diaria, totaltemp, promedio;
//Métodos
    public void temperatura (){
        c_semana = JOptionPane.showInputDialog("Ingrese la cantidad de semanas");
        semana = Integer.parseInt(c_semana);
        for(int i=0;i<semana;i++){
            for(int j=0; j<7; j++){
                c_t_diaria = JOptionPane.showInputDialog("Ingrese la temperatura por días");
                t_diaria = Double.parseDouble(c_t_diaria);
                totaltemp += t_diaria;
                
            }
        }
        promedio = totaltemp / (semana*7);
        JOptionPane.showMessageDialog(null,"El promedio de la temperatura es: "+ promedio);
    }
    public static void main(String[] args) {
        
     Fordoble promtemp  = new Fordoble ();
     promtemp.temperatura();
     
    }
    
}
