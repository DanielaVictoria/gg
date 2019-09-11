package vista;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaPrincipal extends JFrame{
	JPanel pregistro= new JPanel();
	JPanel pbotones= new JPanel();
	JLabel jnombre;
	JLabel jid;
	JLabel jtipo;
	JTextField tnombre;
	JTextField tid;
	JTextField ttipo;
	JButton bagregar;
	JButton beliminar;
	JButton bbuscar;
	JButton bver;
	public VentanaPrincipal() {
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gestor De Productos");
		setSize(500,300); 
		setLocation(0,0);
		setLocationRelativeTo(null);	
		setLocationRelativeTo(null);
		inicio();
	}
	public void inicio(){
		
		TitledBorder titulo = new TitledBorder("T E C N O  S H O P");
		TitledBorder registro = new TitledBorder("Registro de Productos");
		TitledBorder botones = new TitledBorder("Panel de Opciones");
		titulo.setTitleJustification(titulo.CENTER);
		titulo.setTitleFont(new Font("ArialBlack", 1, 30));
		registro.setTitleJustification(registro.CENTER);
		registro.setTitleFont(new Font("ArialBlack", 1, 20));
		botones.setTitleJustification(botones.CENTER);
		botones.setTitleFont(new Font("ArialBlack", 1, 20));
		bagregar= new JButton("Agregar Producto");
		beliminar= new JButton("Eliminar Producto");
		bbuscar= new JButton("Buscar Producto");
		bver= new JButton("Ver Producto");
		bagregar.setActionCommand("Agregar");
		beliminar.setActionCommand("Eliminar");
		bbuscar.setActionCommand("Buscar");
		bver.setActionCommand("Ver");
		pregistro.setBorder(registro);
		pbotones.setBorder(botones);
		jnombre = new JLabel("Nombre:");
		jid = new JLabel("Num. ID:");
		jtipo = new JLabel("Tipo:");
		tnombre = new JTextField("");
		tid = new JTextField("");
		ttipo = new JTextField("");
		pregistro.setLayout(new GridLayout(3,2));
		pregistro.setSize(300, 200);
		pregistro.add(jnombre);
		pregistro.add(tnombre);
		pregistro.add(jid);
		pregistro.add(tid);
		pregistro.add(jtipo);
		pregistro.add(ttipo);
		pbotones.add(bagregar);
		pbotones.add(beliminar);
		pbotones.add(bbuscar);
		pbotones.add(bver);
		add(pregistro);
		add(pbotones);
		setVisible(true);
	}
	public JPanel getPregistro() {
		return pregistro;
	}
	public void setPregistro(JPanel pregistro) {
		this.pregistro = pregistro;
	}
	public JPanel getPbotones() {
		return pbotones;
	}
	public void setPbotones(JPanel pbotones) {
		this.pbotones = pbotones;
	}
	public JLabel getJnombre() {
		return jnombre;
	}
	public void setJnombre(JLabel jnombre) {
		this.jnombre = jnombre;
	}
	public JLabel getJid() {
		return jid;
	}
	public void setJid(JLabel jid) {
		this.jid = jid;
	}
	public JLabel getJtipo() {
		return jtipo;
	}
	public void setJtipo(JLabel jtipo) {
		this.jtipo = jtipo;
	}
	public JTextField getTnombre() {
		return tnombre;
	}
	public void setTnombre(JTextField tnombre) {
		this.tnombre = tnombre;
	}
	public JTextField getTid() {
		return tid;
	}
	public void setTid(JTextField tid) {
		this.tid = tid;
	}
	public JTextField getTtipo() {
		return ttipo;
	}
	public void setTtipo(JTextField ttipo) {
		this.ttipo = ttipo;
	}
	public JButton getBagregar() {
		return bagregar;
	}
	public void setBagregar(JButton bagregar) {
		this.bagregar = bagregar;
	}
	public JButton getBeliminar() {
		return beliminar;
	}
	public void setBeliminar(JButton beliminar) {
		this.beliminar = beliminar;
	}
	public JButton getBbuscar() {
		return bbuscar;
	}
	public void setBbuscar(JButton bbuscar) {
		this.bbuscar = bbuscar;
	}
	public JButton getBver() {
		return bver;
	}
	public void setBver(JButton bver) {
		this.bver = bver;
	}
	
	
}
