package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Select;

public class PanelOpciones extends JPanel {
	private Controlador controlador;
	
	private JComboBox boxFuncion;
	
	private JTextField precision;
	
	private JTextField poblacion;
	
	private JTextField iteraciones;
	
	private JTextField cruces;
	
	private JTextField mutacion;
	
	private JTextField semilla;
	
	private JComboBox tipoCruce;
	
	private JComboBox seleccion;
	
	private JButton comenzar;
	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setLayout(new GridLayout(11, 2, 0, 0));
		
		add(new JLabel("Funcion: "));
		Select aux[] = {Select.ESTOCASTICO,Select.RULETA,Select.TORNEO};
		boxFuncion = new JComboBox<Select>();
		add(boxFuncion);
		add(new JLabel("Precisión: "));
		precision = new JTextField();
		add(precision);
		add(new JLabel("Población: "));
		poblacion = new JTextField();
		add(poblacion);
		add(new JLabel("Iteraciones: "));
		iteraciones = new JTextField();
		add(iteraciones);
		add(new JLabel("Cruces: "));
		cruces = new JTextField();
		add(cruces);
		add(new JLabel("Mutación: "));
		mutacion = new JTextField();
		add(mutacion);
		add(new JLabel("Semilla: "));
		semilla = new JTextField();
		add(semilla);
		add(new JLabel("TipoCruce: "));
		tipoCruce = new JComboBox();
		add(tipoCruce);
		add(new JLabel("Selección: "));
		seleccion = new JComboBox();
		add(seleccion);
		comenzar = new JButton("Comenzar");
		add(comenzar);
		

	}

}
