import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing4 extends JFrame {
    JLabel valor1Label, valor2Label, valor3Label, resultadoLabel;
    JButton generarValoresButton;

    public Swing4() {
        // Configuración de la ventana principal
        setTitle("Sistema de Validación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Componentes de la interfaz
        valor1Label = new JLabel();
        valor2Label = new JLabel();
        valor3Label = new JLabel();
        resultadoLabel = new JLabel();
        generarValoresButton = new JButton("Generar Valores");

        // Posicionamiento de componentes
        valor1Label.setBounds(20, 20, 150, 25);
        valor2Label.setBounds(20, 60, 150, 25);
        valor3Label.setBounds(20, 100, 150, 25);
        resultadoLabel.setBounds(20, 140, 350, 25);
        generarValoresButton.setBounds(20, 180, 150, 25);

        // Añadir componentes a la ventana
        add(valor1Label);
        add(valor2Label);
        add(valor3Label);
        add(resultadoLabel);
        add(generarValoresButton);

        // Configuración de eventos
        generarValoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarValores();
            }
        });
    }

    void generarValores() {
        // Generar tres valores al azar (pueden ser dígitos o imágenes en tu aplicación real)
        int valor1 = (int) (Math.random() * 10);
        int valor2 = (int) (Math.random() * 10);
        int valor3 = (int) (Math.random() * 10);

        // Mostrar los valores en las etiquetas
        valor1Label.setText("Valor 1: " + valor1);
        valor2Label.setText("Valor 2: " + valor2);
        valor3Label.setText("Valor 3: " + valor3);

        // Comparar los valores y mostrar el resultado en la etiqueta de resultado
        if (valor1 == valor2 && valor2 == valor3) {
            resultadoLabel.setText("Los tres valores son iguales");
        } else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
            resultadoLabel.setText("Hay dos valores iguales");
        } else {
            resultadoLabel.setText("Los tres valores son diferentes");
        }
    }

    public static void main(String[] args) {
        new Swing4();
    }
}