package paneles;

import javax.swing.*;
import java.awt.*;

public class panelProductos extends JPanel {

    public panelProductos() {
        setLayout(new BorderLayout());

        JLabel lblProducto = new JLabel("Producto");
        lblProducto.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel grid = new JPanel(new GridLayout(2, 4, 10, 10));
        for (int i = 0; i < 8; i++) {
            JPanel producto = new JPanel();
            producto.setPreferredSize(new Dimension(100, 100));
            producto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            grid.add(producto);
        }

        add(lblProducto, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
    }
}