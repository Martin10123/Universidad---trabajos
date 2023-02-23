package ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana(){
        setSize(500, 500); // Establecer tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Deja de correr el programa automaticamente
        setTitle("Login"); // Establecemos el titulo en la ventana
   
        // setBounds(100, 200, 500, 500);
        // setLocation(100,200 ); // Establecemos posición inicial de la ventana
        setLocationRelativeTo(null);
        
    } 
}
