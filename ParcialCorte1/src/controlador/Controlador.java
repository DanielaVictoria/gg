package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import modelo.Producto;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener{
	VentanaPrincipal vp;
	GestorProductos gp;
	File datos;
	public Controlador() {
		datos = new File("data/productos.dat");
		gp = new GestorProductos();
		vp = new VentanaPrincipal();
		vp.getBagregar().addActionListener(this);
		vp.getBeliminar().addActionListener(this);
		vp.getBbuscar().addActionListener(this);
		vp.getBver().addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String op = e.getActionCommand();
		
		if(e.getActionCommand()=="Agregar") {
			System.out.println("Agregar");
			try {
				gp.agregarProducto(vp.getTnombre().getText(), vp.getTid().getText(), vp.getTtipo().getText());
				System.out.println("Producto con identificación "+vp.getTid().getText()+" agregado");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null,e1.toString());
			}
		}
		if(e.getActionCommand()=="Eliminar") {
			System.out.println("Eliminar");
			String producto = JOptionPane.showInputDialog("Ingrese el ID del producto a borrar:");
			try {
				gp.eliminarProducto(producto);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null,e1.toString());
			}
		}
		if(e.getActionCommand()=="Buscar") {
			System.out.println("Bscar");
			String producto = JOptionPane.showInputDialog("Ingrese el ID del producto a buscar:");
			try {
				Producto buscado = gp.buscarProducto(producto);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null,e1.toString());
			}
		}
		if(e.getActionCommand()=="Ver") {
			System.out.println("Ver");
		}
		
	}
}
