package modelo.genes.factoria.imp;

import modelo.genes.GenBoolean;
import modelo.genes.GenReal;
import modelo.genes.factoria.FactoriaGenes;

public class FactoriaGenesImp extends FactoriaGenes
{

	@Override
	public GenBoolean creaGenBoolean() 
	{
		// TODO Auto-generated method stub
		return new GenBoolean();
	}

	@Override
	public GenReal creaGenReal() 
	{
		// TODO Auto-generated method stub
		return new GenReal();
	}

}
