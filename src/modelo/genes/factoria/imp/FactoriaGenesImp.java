package modelo.genes.factoria.imp;

import java.util.Random;

import modelo.genes.GenBoolean;
import modelo.genes.GenReal;
import modelo.genes.factoria.FactoriaGenes;

public class FactoriaGenesImp extends FactoriaGenes
{

	@Override
	public GenBoolean creaGenBoolean(int tam, double xMax, double xMin, double tol, Random generator) 
	{
		// TODO Auto-generated method stub
		return new GenBoolean(tam, xMax, xMin, tol, generator);
	}

	@Override
	public GenReal creaGenReal(int tam, double xMax, double xMin, double tol, Random generator) 
	{
		// TODO Auto-generated method stub
		return new GenReal(tam, xMax, xMin, tol, generator);
	}

}
