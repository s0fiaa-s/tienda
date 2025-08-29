package paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelBuscador {

    private JPanel buscadorPanel;

    public panelBuscador() {
        buscadorPanel = new JPanel(new BorderLayout());
        buscadorPanel.setPreferredSize(new Dimension(250, 800)); 
        buscadorPanel.setBackground(Color.PINK);

        // Panel interno que apila verticalmente usando Box

        JPanel contenido = new JPanel();
        contenido.setLayout(new BoxLayout(contenido, BoxLayout.PAGE_AXIS));
        contenido.setBackground(Color.PINK);

        // Título

        JLabel titulo = new JLabel("Buscar");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(Color.BLACK);
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Panel horizontal para campo de texto y botón

        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new BoxLayout(panelBusqueda, BoxLayout.LINE_AXIS));
        panelBusqueda.setBackground(Color.PINK);
        panelBusqueda.setAlignmentX(Component.LEFT_ALIGNMENT);

        // campo texto

        JTextField campoBusqueda = new JTextField();
        campoBusqueda.setMaximumSize(new Dimension(150, 25)); 
        campoBusqueda.setPreferredSize(new Dimension(150, 25));

        // Botón de buscar

        JButton botonBuscar = new JButton("Buscador");
        botonBuscar.setPreferredSize(new Dimension(80, 20));
        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buscando: " + campoBusqueda.getText());
            }
        });

        // Agregamos campo y botón al panel horizontal

        panelBusqueda.add(campoBusqueda);
        panelBusqueda.add(Box.createHorizontalStrut(5)); // Espacio entre campo y botón
        panelBusqueda.add(botonBuscar);
        contenido.add(titulo);
        contenido.add(Box.createVerticalStrut(10));
        contenido.add(panelBusqueda);
        buscadorPanel.add(contenido, BorderLayout.NORTH);
    }

    public JPanel getBanner() {
        return buscadorPanel;
    }
}
