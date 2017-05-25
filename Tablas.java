import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Javier Arturo
 */
public class Tablas extends JFrame{
    
    public Tablas(){
        
        super("tablas");
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Edad");
        modelo.addColumn("Teléfono");
        
        String [] persona1 = {"Juan Ramírez", "Cerrada 33  #4", "26", "222-333-444-555"};
        String [] persona2 = {"Cesar Osorio", "Bruselas #48", "13", "229-984-64-81"};
        String [] persona3 = {"Mariana Ávila", "Eje 2 poniente #1452", "78", "878-55-22-99-88"};
        String [] persona4 = {"Simón Amanar", "Avenida del olmo  #556", "21", "222-333-444-555"};
        String [] persona5 = {"Francisco García", "Independencia #1546", "18", "222-333-444-555"};
        String [] persona6 = {"Leonel Montalvo", "Montes Escandinavos #97", "37", "222-333-444-555"};
        String [] persona7 = {"Ignacio Ramírez", "Uxmal #42", "42", "555-589-28-00"};
        String [] persona8 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona9 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona10 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona11 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona12 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona13 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona14 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona15 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona16 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona17 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona18 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona19 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona20 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona21 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona22 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona23 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        String [] persona24 = {"Martha Serrano", "Xcaret #34", "34", "229-227-09-09"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
        modelo.addRow(persona14);
        modelo.addRow(persona15);
        modelo.addRow(persona16);
        modelo.addRow(persona17);
        modelo.addRow(persona18);
        modelo.addRow(persona19);
        modelo.addRow(persona20);
        modelo.addRow(persona21);
        modelo.addRow(persona22);
        modelo.addRow(persona23);
        modelo.addRow(persona24);
        
        modelo.insertRow(1, persona24);
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(10, 20, 500, 500);
        
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 20, 500, 200);
        
        add(scroll);
        
        
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Tablas objTable = new Tablas();
    }
    
}
