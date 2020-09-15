/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualTemplates;

import Arbol.Arbol;
import Arbol.Comment;
import Arbol.Nodo;
import Arbol.Post;
import Arbol.User;
import Prinicipal.Ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class Panel extends JPanel {

    private final int radio = 15;
    private final int espacioVertical = 130;
    private Arbol arbol;

    public Panel(Arbol arbol) {
        this.arbol = arbol;

    }
    
    public void setDimension(Dimension d) {
            setSize(d);
            setPreferredSize(d);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (arbol != null && arbol.getRaiz() != null) {
            if (getWidth() <900) {
                dibujar(g, arbol.getRaiz(), 100, 30, getWidth() / 10);
            } else {
                dibujar(g, arbol.getRaiz(), 3350, 15, 3000);
            }
        }
    }

    private void dibujar(Graphics g, Nodo Raiz, int x, int y, int espacioH) {
        if (Raiz == arbol.getRaiz()) {
            g.setColor(Ventana.menu);
        } else if (Raiz instanceof User) {
            g.setColor(Ventana.morado);
        } else if (Raiz instanceof Post) {
            g.setColor(Ventana.post3);
        } else if (Raiz instanceof Comment) {
            g.setColor(Ventana.colorMainPost);
        }
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g.setColor(Color.BLACK);
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);

        LinkedList<Nodo> hijos = Raiz.getHijos();
        Point coordsPadre = new Point(x, y);
        if (hijos != null) {
            for (Nodo hijo : hijos) {
                dibujarLinea(g, x - espacioH, y + espacioVertical, coordsPadre.x, coordsPadre.y);
                dibujar(g, hijo, x - espacioH, y + espacioVertical, espacioH / hijos.size());
                x += espacioH;
            }
        }
    }

    private void dibujarLinea(Graphics g, int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(espacioVertical * espacioVertical + (x2 - x1) * (x2 - x1));
        int xx1 = (int) (x1 - radio * (x1 - x2) / d);
        int yy1 = (int) (y1 - radio * (y1 - y2) / d);
        int xx2 = (int) (x2 + radio * (x1 - x2) / d);
        int yy2 = (int) (y2 + radio * (y1 - y2) / d);

        g.drawLine(xx1, yy1, xx2, yy2);

    }

}
