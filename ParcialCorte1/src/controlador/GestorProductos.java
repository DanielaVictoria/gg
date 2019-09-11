package controlador;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Producto;

public class GestorProductos {
	ArrayList<Producto> productos;
	public GestorProductos() {
		productos = new ArrayList<Producto>();
	}
	public boolean verificarProducto(String pid) {
		boolean encontrado = false;
		for(int i=0;i<productos.size();i++) {
			if(pid == productos.get(i).getId()) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	public Producto buscarProducto(String pid) throws Exception{
		Producto prod = null;
		if(verificarProducto(pid) == true) {
		for(int i=0;i<productos.size();i++) {
			if(pid == productos.get(i).getId()) {
				prod = productos.get(i);
			}
		  }
		}
		else {
			throw new Exception("El producto con ID "+pid+" no fue encontrado");
		}
		return prod;
	}
	public void agregarProducto(String pnombre, String pid, String ptipo) throws Exception{
		Producto prod = new Producto(pnombre, pid, ptipo);
		if(verificarProducto(pid) == false) {
		productos.add(prod);
		}
		else {
			throw new Exception("El producto con ID "+pid+" ya fue agregado");
		}
	}
	public void eliminarProducto(String pid) throws Exception{
		if(verificarProducto(pid)==true) {
		Producto prod = buscarProducto(pid);
		for(int i=0;i<productos.size();i++) {
			if(prod == productos.get(i)) {
				productos.remove(i);
				System.out.println("Eliminado");
			}
		  }
		}
		else {
			throw new Exception("El producto con ID "+pid+" no existe");
		}
	}
	public String mostrarProducto(String pid) throws Exception{
		String nombre = buscarProducto(pid).getNombre();
		String id = buscarProducto(pid).getId();
		String tipo = buscarProducto(pid).getTipo();
		String mostrar =
				"Nombre: "+nombre+"\n"+
				"Num. ID: "+id+"\n"+
				"Tipo: "+tipo+"\n";
		return mostrar;
	}
	public void escribirArchivo(File parchivo, String escritura) throws Exception{
		FileWriter w = new FileWriter(parchivo);
		PrintWriter pw = new PrintWriter(w);
		pw.println(escritura);
		w.close();
		pw.close();
	}
}
