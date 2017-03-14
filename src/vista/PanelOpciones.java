package vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class PanelOpciones extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setLayout(new GridLayout(10, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		JLabel aux = new JLabel("NEW");
		add(aux);

	}

}
