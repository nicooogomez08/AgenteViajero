/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class Vista extends JFrame {

    JLabel titulo;
    JLabel subTitulo;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiquetaImagen;  
    public Vista() {
        this.setLayout(null);
        titulo = new JLabel("ALGORITMO AGENTE VIAJERO");
        titulo.setBounds(5, 4, 1200, 100);
        this.add(titulo);
        subTitulo = new JLabel("RUTA:");
        subTitulo.setBounds(5, 20, 1200, 100);
        this.add(subTitulo);

        AgenteViajero agente = new AgenteViajero();
        agente.algorithm();
        ArrayList<Integer> arcosAME = new ArrayList<>();
        arcosAME = agente.algorithm();
        int a = 8;
        int b = 40;
        int c = 100;
        int d = 100;

        for (int i = 0; i < arcosAME.size() ; i++) {
            if (i < arcosAME.size() - 1) {
                String x = String.valueOf(arcosAME.get(i));
                etiqueta1 = new JLabel("->" + x);
                etiqueta1.setBounds(a, b, c, d);
                this.add(etiqueta1);

                b = b + 30;
            } else {
                String y = String.valueOf(arcosAME.get(i));
                etiqueta2 = new JLabel("Costo: " + y);
                etiqueta2.setBounds(5, 150, 1200, 100);
                this.add(etiqueta2);
            }

        }

        ImageIcon imagen = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Imágenes\\floyd2.png");
        etiquetaImagen = new JLabel(imagen);
        etiquetaImagen.setBounds(20, 220, 800, 600);
        this.add(etiquetaImagen);
        this.pack();

    }

    public static void main(String[] args) {

        Vista obj = new Vista();
        obj.setResizable(false);
        obj.setDefaultCloseOperation(3);
        obj.setSize(800, 800);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);

    }
}

  
