package controlador;

import modelo.AGS;
import modelo.Observador;
import modelo.Cruce;
import modelo.Funcion;
import modelo.Select;
import modelo.cromosomas.Cromosoma;
import modelo.cromosomas.factoria.FactoriaCromosomas;
import modelo.genes.Gen;
import modelo.genes.GenBoolean;
import modelo.genes.GenReal;
import modelo.genes.factoria.FactoriaGenes;

public class Controlador 
{
	private Cromosoma cromosoma;
	private boolean maximizar; 
	private AGS alg;
	private long lastSeed;
	
	public Controlador ()
	{
	}
	
	public void addObserver(Observador o)
	{
		alg.addObserver(o);
	}
	
	public void setParametersRun(Funcion funcion, int n,  double tol, int pob, int generaciones, double pCruce, double pMutacion, long seed, Cruce cruce, Select seleccion, boolean elitismo)
	{
		if(seed == 0)
			lastSeed = System.currentTimeMillis();
		
		else
			lastSeed = seed;
		
		this.generaFuncion(funcion, n, tol);
		alg = new AGS(pob, generaciones, pCruce, pMutacion, seleccion, cruce, elitismo, maximizar, lastSeed);
	}
	
	public void setParametersReRun(Funcion funcion, int n,  double tol, int pob, int generaciones, double pCruce, double pMutacion, long seed, Cruce cruce, Select seleccion, boolean elitismo)
	{
		if(seed != 0)
			lastSeed = seed;
		
		this.generaFuncion(funcion, n, tol);
		alg = new AGS(pob, generaciones, pCruce, pMutacion, seleccion, cruce, elitismo, maximizar, lastSeed);
	}
	
	public void lanzaAGS()
	{
		alg.ejecuta();
	}
	
	private void generaFuncion(Funcion f, int n, double tol)
	{
		int x = 0;
		
		Cromosoma aux;
		
		switch(f)
		{
			case FUNCION1:
				double[] xMax1 = {250};
				double[] xMin1 = {-250};
				x = 1;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF1(n);//new CromosomaFactoryF1(xMax1, xMin1, tol, 1);
				maximizar = false;
				this.actualizaCromosoma(xMax1, xMin1, tol, x, aux, f);
				break;
			case FUNCION2:
				double[] xMax2 = {512,512};
				double[] xMin2 = {-512,-512};
				x = 2;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF2(n);//new CromosomaFactoryF2(xMax2, xMin2, tol, 2);
				maximizar = false;
				this.actualizaCromosoma(xMax2, xMin2, tol, x, aux, f);
				break;
			case FUNCION3:
				double[] xMax3 = {12.1, 5.8};
				double[] xMin3 = {-3, 4.1};
				x = 2;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF3(n);//new CromosomaFactoryF3(xMax3, xMin3, tol, 2);
				maximizar = true;
				this.actualizaCromosoma(xMax3, xMin3, tol, x, aux, f);
				break;
			case FUNCION4:
				double[] xMax4 = new double[n];
				double[] xMin4 = new double[n];
				for(int i=0; i < n; ++i){
					xMax4[i] = Math.PI;
					xMin4[i] = 0;
				}
				x = n;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF4(n);//new CromosomaFactoryF4(xMax4, xMin4, tol, n);
				maximizar = false;
				this.actualizaCromosoma(xMax4, xMin4, tol, x, aux, f);
				break;
			case FUNCION4R:
				double[] xMax4r = new double[n];
				double[] xMin4r = new double[n];
				for(int i=0; i < n; ++i){
					xMax4r[i] = Math.PI;
					xMin4r[i] = 0;
				}
				x = n;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF4real(n);//new CromosomaFactoryF4real(xMax4r, xMin4r, tol, n);
				maximizar = false;
				this.actualizaCromosoma(xMax4r, xMin4r, tol, x, aux, f);
				break;
			case FUNCION5:
				double[] xMax5 = {10,10};
				double[] xMin5 = {-10,-10};
				x = 2;
				aux = FactoriaCromosomas.getInstancia().creaCromosomaF5(n);//new CromosomaFactoryF5(xMax5, xMin5, tol, 2);
				maximizar = false;
				this.actualizaCromosoma(xMax5, xMin5, tol, x, aux, f);
				break;
			default:
				break;
		}
	}
	
	private void actualizaCromosoma (double[] xMax, double[] xMin, double tol, int x, Cromosoma aux, Funcion f)
	{
		aux.setTol(tol);
		aux.setSeed(this.lastSeed);
		aux.setnVar(x);
		double[] fenotipo = new double[x];
		Gen[] genes = null;
		switch (f)
		{
			case FUNCION1:
			case FUNCION2:
			case FUNCION3:
			case FUNCION4:
			case FUNCION5:
				genes = new GenBoolean[x];
				break;
			case FUNCION4R:
				genes = new GenReal[x];
				break;
			default:
				break;
		}
		aux.setGenes(genes);
		for (int j = 0; j < x; ++j)
		{
			genes[j] = FactoriaGenes.getInstancia().creaGenBoolean();
			fenotipo[j] = genes[j].fenotipo();
		}
		aux.setFenotipo(fenotipo);
		for(int i = 0; i < x; ++i)
			aux.nuevoGen(xMax[i], xMin[i]);
		
		//this.cromosoma = aux.copia();
	}

}
