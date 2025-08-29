package views;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

// Importa tus paneles
import paneles.panelBuscador;
import paneles.panelProductos;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Tienda en Java");
        setSize(1500, 800); // medidas grandes como en el Main
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar ventana
        setLayout(new BorderLayout());

        // Panel contenedor principal
        JPanel miVentana = new JPanel(new BorderLayout());
        miVentana.setBorder(new LineBorder(Color.BLACK, 2));

        // Panel Buscador (lado izquierdo)
        panelBuscador buscador = new panelBuscador();
        miVentana.add(buscador.getBanner(), BorderLayout.WEST);

        // Panel Productos (centro)
        panelProductos productos = new panelProductos();
        miVentana.add(productos, BorderLayout.CENTER);

        // Agregar contenedor a la ventana
        this.add(miVentana);

        // Mostrar ventana
        this.setVisible(true);
    }

}

