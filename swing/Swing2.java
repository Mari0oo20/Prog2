import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 {
	 
	JFrame frame = new JFrame("Foto Animales");
    JPanel imagenPanel = new JPanel();
    JLabel imagenLabel = new JLabel();
    
    Swing2() {

        // Crear el cuadro desplegable
        String[] opciones = {"Selecciona uno", "Gato", "Perro", "Caballo"};
        JComboBox<String> combo = new JComboBox<>(opciones);
        
        imagenPanel.add(imagenLabel);

        // Configurar el ActionListener para el cuadro desplegable
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la opciÃ³n seleccionada
                String seleccion = (String) combo.getSelectedItem();

                // Mostrar la imagen correspondiente
                if (seleccion.equals("Gato")) {
                	 mostrarImagen("C:\\Users\\daw Mario\\Desktop\\swing\\g.jpg", imagenLabel);
                } else if (seleccion.equals("Perro")) {
                    mostrarImagen("C:\\Users\\daw Mario\\Desktop\\swing\\p.jpg", imagenLabel);
                } else if (seleccion.equals("Caballo")) {
                    mostrarImagen("C:\\Users\\daw Mario\\Desktop\\swing\\c.jpg", imagenLabel);
                } else {
                    // Borrar la imagen
                    imagenLabel.setIcon(null);
                }
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(combo, BorderLayout.NORTH);
        frame.add(imagenPanel, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static void mostrarImagen(String rutaImagen, JLabel label) {
        ImageIcon imagen = new ImageIcon(rutaImagen);
        label.setIcon(imagen);
    }
    
    public static void main(String[] args) {
    	new Swing2();
    }

}
