package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Cruce;
import modelo.Funcion;
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
	
	private JCheckBox elitismo;
	private JButton comenzar;
	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setLayout(new GridLayout(12, 2, 0, 0));
		
		add(new JLabel("Funcion: "));
		Funcion aux[] = {Funcion.FUNCION1,Funcion.FUNCION2,Funcion.FUNCION3,Funcion.FUNCION4,Funcion.FUNCION4R,Funcion.FUNCION5};
		boxFuncion = new JComboBox(aux);
		add(boxFuncion);
		add(new JLabel("Precisión: "));
		precision = new JTextField("0.001");
		add(precision);
		add(new JLabel("Población: "));
		poblacion = new JTextField("100");
		add(poblacion);
		add(new JLabel("Iteraciones: "));
		iteraciones = new JTextField("100");
		add(iteraciones);
		add(new JLabel("%Cruces: "));
		cruces = new JTextField("60");
		add(cruces);
		add(new JLabel("%Mutación: "));
		mutacion = new JTextField("5");
		add(mutacion);
		add(new JLabel("Semilla: "));
		semilla = new JTextField("0");
		add(semilla);
		add(new JLabel("Cruce: "));
		Cruce aux2[] = {Cruce.MONOPUNTO,Cruce.MULTIPUNTO,Cruce.UNIFORME,Cruce.ARITMETICO,Cruce.SBX};
		tipoCruce = new JComboBox(aux2);
		add(tipoCruce);
		add(new JLabel("Selección: "));
		Select aux3[] = {Select.RULETA,Select.ESTOCASTICO,Select.TORNEO};
		seleccion = new JComboBox(aux3);
		add(seleccion);
		add(new JLabel("Elitismo: "));
		elitismo = new JCheckBox();
		add(elitismo);
		comenzar = new JButton("Comenzar");
		comenzar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//EJECUTAR
			}
			
		});
		add(comenzar);
		

	}

}
