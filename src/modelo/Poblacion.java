package modelo;

import modelo.cromosomas.Cromosoma;
import modelo.cromosomas.factoria.FactoriaCromosomas;
import modelo.cromosomas.funcion1.CromosomaF1;
import modelo.cromosomas.funcion2.CromosomaF2;
import modelo.cromosomas.funcion3.CromosomaF3;
import modelo.cromosomas.funcion4.CromosomaF4;
import modelo.cromosomas.funcion4real.CromosomaF4real;
import modelo.cromosomas.funcion5.CromosomaF5;

public class Poblacion 
{

	private Cromosoma[] individuos;
	private int tam;
	
	public int getTam() 
	{
		return tam;
	}

	public void setIndividuos(Cromosoma[] individuos) 
	{
		this.individuos = individuos;
	}

	public Poblacion(int n)
	{
		tam = n;
		this.individuos = new Cromosoma[tam];
	}
	
	public void inicializa()
	{
		for(int i=0; i < tam; ++i)
			if (individuos[i] instanceof CromosomaF1)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF1(tam);
			else if (individuos[i] instanceof CromosomaF2)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF2(tam);
			else if (individuos[i] instanceof CromosomaF3)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF3(tam);
			else if (individuos[i] instanceof CromosomaF4)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF4(tam);
			else if (individuos[i] instanceof CromosomaF4real)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF4real(tam);
			else if (individuos[i] instanceof CromosomaF5)
				individuos[i] = FactoriaCromosomas.getInstancia().creaCromosomaF5(tam);
		
	}

	public Cromosoma[] getIndividuos() 
	{
		return individuos;
	}

}
