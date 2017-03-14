package modelo.cromosomas.factoria.imp;

import modelo.cromosomas.factoria.FactoriaCromosomas;
import modelo.cromosomas.funcion1.CromosomaF1;
import modelo.cromosomas.funcion2.CromosomaF2;
import modelo.cromosomas.funcion3.CromosomaF3;
import modelo.cromosomas.funcion4.CromosomaF4;
import modelo.cromosomas.funcion4real.CromosomaF4real;
import modelo.cromosomas.funcion5.CromosomaF5;

public class FactoriaCromosomasImp extends FactoriaCromosomas
{

	@Override
	public CromosomaF1 creaCromosomaF1(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF1(n);
	}

	@Override
	public CromosomaF2 creaCromosomaF2(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF2(n);
	}

	@Override
	public CromosomaF3 creaCromosomaF3(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF3(n);
	}

	@Override
	public CromosomaF4 creaCromosomaF4(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF4(n);
	}

	@Override
	public CromosomaF4real creaCromosomaF4real(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF4real(n);
	}

	@Override
	public CromosomaF5 creaCromosomaF5(int n) 
	{
		// TODO Auto-generated method stub
		return new CromosomaF5(n);
	}
	
}
