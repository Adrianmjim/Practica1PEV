package vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.math.plot.Plot2DPanel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,2));
		
		JPanel panel = new PanelOpciones();
		contentPane.add(panel);
		
		Plot2DPanel panel_1 = new Plot2DPanel();
		panel_1.addLegend("SOUTH");
		double xMejor[] = {0.0,0.5,0.7,1.2}, yMejor[] = {0.0,0.5,0.7,1.2};
		double xMejorGen[] = {0.0,0.5,0.7,1.2},yMejorGen[] = {0.0,0.6,0.7,1.5};
		double xMedia[] = {0.0,0.5,0.7,1.5},yMedia[] = {0.0,0.5,0.7,1.2};
		panel_1.addLinePlot("Mejor absoluto", xMejor, yMejor);
		panel_1.addLinePlot("Mejor de la Generación", xMejorGen, yMejorGen);
		panel_1.addLinePlot("Media de la generación", xMedia, yMedia);
		panel_1.setBounds(100, 100, 400,500);
		panel_1.setSize(400, 500);
		contentPane.add(panel_1);
	}

}
