package modelo.cromosomas.funcion1;

import modelo.cromosomas.CromosomaBoolean;
import modelo.genes.GenBoolean;

public class CromosomaF1 extends CromosomaBoolean 
{

	public CromosomaF1(int n)
	{
		this.tol = 0.0;
		this.nVar = n;
		this.genes = new GenBoolean[n];
		this.fenotipo = new double[n];
	}
	
	public CromosomaBoolean copia() 
	{
		CromosomaF1 ret = new CromosomaF1(nVar);
		ret.aptitud = this.aptitud;
		ret.puntAcum = this.puntAcum;
		ret.puntuacion = this.puntuacion;
		ret.tol = this.tol;
		ret.lCrom = this.lCrom;
		ret.nVar = this.nVar;
		ret.fenotipo = new double[nVar];
		for(int i=0; i < this.nVar;++i)
			ret.fenotipo[i] = this.fenotipo[i];
		
		ret.genes = new GenBoolean[nVar];
		for(int i=0; i < this.nVar;++i)
			ret.genes[i] = this.genes[i].copia();
		
		return ret;
	}
	
	@Override
	public double evalua() 
	{
		resuelveFenotipo();
		double ret;
		double x = fenotipo[0];
		ret = -Math.abs(x * Math.sin(Math.sqrt(Math.abs(x))));
		return ret;
	}

}
