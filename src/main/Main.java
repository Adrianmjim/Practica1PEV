package main;

import java.awt.EventQueue;

import vista.Ventana;
import controlador.Controlador;

public class Main 
{

	public static void main(String[] args) 
	{
		Controlador controlador = new Controlador();
		final Ventana v = new Ventana(controlador);
		
		EventQueue.invokeLater(new Runnable()
		{

			@Override
			public void run() 
			{
				v.setVisible(true);						
			}
			
		});
		
	}

}
