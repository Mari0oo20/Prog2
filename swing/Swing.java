import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {

    JTextField campoUsuario;
    JPasswordField campoContraseña;

    public Swing() {
        // Configurar la ventana
        setTitle("Login");
        setSize(300, 150);  // Ajusta el tamaño según tus necesidades
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Crear componentes
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        campoUsuario = new JTextField(10);
        campoContraseña = new JPasswordField(10);
        JButton botonLogin = new JButton("Login");

        // Configurar el diseño
        setLayout(new GridLayout(3, 2));

        // Agregar componentes a la ventana
        add(etiquetaUsuario);
        add(campoUsuario);
        add(etiquetaContraseña);
        add(campoContraseña);
        add(botonLogin);

        // Configurar el ActionListener para el botón
        botonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarCredenciales();
            }
        });
    }

    void validarCredenciales() {
        // Obtener el usuario y la contraseña ingresados
        String usuario = campoUsuario.getText();
        String contraseña = new String(campoContraseña.getPassword());

        // Validar el usuario y la contraseña
        if (usuario.equals("admin") && contraseña.equals("admin1234")) {
            JOptionPane.showMessageDialog(this, "La contraseña es correcta");
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña no es correcta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Swing();
    }
}