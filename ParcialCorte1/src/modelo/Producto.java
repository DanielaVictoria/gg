package modelo;

public class Producto {
	String nombre;
	String id;
	String tipo;
	public Producto(String pnombre, String pid, String ptipo) {
		super();
		this.nombre = pnombre;
		this.id = pid;
		this.tipo = ptipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
