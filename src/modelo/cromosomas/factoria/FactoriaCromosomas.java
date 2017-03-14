package modelo.cromosomas.factoria;

import modelo.cromosomas.factoria.imp.FactoriaCromosomasImp;
import modelo.cromosomas.funcion1.CromosomaF1;
import modelo.cromosomas.funcion2.CromosomaF2;
import modelo.cromosomas.funcion3.CromosomaF3;
import modelo.cromosomas.funcion4.CromosomaF4;
import modelo.cromosomas.funcion4real.CromosomaF4real;
import modelo.cromosomas.funcion5.CromosomaF5;

public abstract class FactoriaCromosomas 
{
	
	private static FactoriaCromosomas instancia;
	
	protected long seed;
	
	public static FactoriaCromosomas getInstancia()
	{
		if (instancia == null)
			instancia = new FactoriaCromosomasImp();
		return instancia;
	}
	
	//public abstract void setSeed(long seed);
	
	public abstract CromosomaF1 creaCromosomaF1(int n);
	
	public abstract CromosomaF2 creaCromosomaF2(int n);
	
	public abstract CromosomaF3 creaCromosomaF3(int n);
	
	public abstract CromosomaF4 creaCromosomaF4(int n);
	
	public abstract CromosomaF4real creaCromosomaF4real(int n);
	
	public abstract CromosomaF5 creaCromosomaF5(int n);
}
