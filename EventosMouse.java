package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Javier Arturo
 */
public class EventosMouse extends JFrame{
    
    public EventosMouse(){
        
        JLabel lblMovedX = new JLabel("Moved x: " );
        lblMovedX.setBounds(25, 10, 100, 30);
        JLabel lblMovedY = new JLabel("y: ");
        lblMovedY.setBounds(230, 10, 100, 30);
        JLabel lblDraggedX = new JLabel("Dragged x: ");
        lblDraggedX.setBounds(25, 40, 100, 30);
        JLabel lblDraggedY = new JLabel("y: ");
        lblDraggedY.setBounds(230, 40, 100, 30);
        
        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25, 165, 500, 30);
        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);
        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if(event.isAltDown()){
                    System.out.println("alt");
                }
                else if(event.isControlDown()){
                    System.out.println("control");
                }
                else if(event.isShiftDown()){
                    System.out.println("shift");
                }
                else if(event.isMetaDown()){
                    System.out.println("Clic derecho");
                }
                else {
                    System.out.println("clic izquierdo");
                }
                
                if(event.getClickCount() == 2){
                    System.out.println("double clic");
                }
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        };
        
        MouseWheelListener wheel = new MouseWheelListener() {
            
            @Override
            public void mouseWheelMoved(MouseWheelEvent event) {
                if(event.getPreciseWheelRotation() == -1){
                    
                    System.out.println("rueda hacia arriba");
                }
                if(event.getPreciseWheelRotation() == 1){
                    System.out.println("rueda hacia abajo");
                }
            }
        };
        
        MouseMotionListener motionListener = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent event) {
                lblDraggedX.setText("Dragged x: "+event.getX());
                lblDraggedY.setText("y: " + event.getY());
            }

            @Override
            public void mouseMoved(MouseEvent event) {
                lblMovedX.setText("Moved x: "+event.getX());
                lblMovedY.setText("y: " + event.getY());
            }
        };
        
        boton.addMouseListener(listener);
        campoSaludo.addMouseListener(listener);
        campoSaludo.addMouseWheelListener(wheel);
        this.addMouseMotionListener(motionListener);
        
        add(lblMovedX);
        add(lblMovedY);
        add(lblDraggedX);
        add(lblDraggedY);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new EventosMouse();
    }
    
}
