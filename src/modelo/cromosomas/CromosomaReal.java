package modelo.cromosomas;

import modelo.genes.Gen;
import modelo.genes.GenReal;
import modelo.genes.factoria.FactoriaGenes;

public abstract class CromosomaReal extends Cromosoma
{
	
	public CromosomaReal()
	{
		for (int i = 0; i < this.nVar; ++i)
			this.genes[i] = new GenReal();
	}
	
	public void resuelveFenotipo() 
	{
		fenotipo = new double[nVar];
		for(int i=0; i < nVar; ++i)
			fenotipo[i] = this.genes[i].fenotipo();
		
	}
	
	public abstract Cromosoma copia();
	
	public abstract double evalua();
	
	public void nuevoGen(double xMax, double xMin)
	{
		Gen nuevo = FactoriaGenes.getInstancia().creaGenReal();
		nuevo.setxMax(xMax);
		nuevo.setxMin(xMin);
		nuevo.setTol(tol);
		nuevo.setGenerator(generator);
		nuevo.setTam(1);
		
		Gen[] nuevosGenes = new Gen[nVar + 1];
		for(int i=0; i< nVar; ++i)
			nuevosGenes[i] = genes[i];
		
		nuevosGenes[nVar] = nuevo;
		this.genes = nuevosGenes;
		this.nVar++;
		resuelveFenotipo();
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s += "Fen: ";
		for(Double f : fenotipo)
			s += f + ", ";
		
		return s;
	}

}
