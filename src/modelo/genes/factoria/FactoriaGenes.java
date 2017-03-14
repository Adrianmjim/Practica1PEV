package modelo.genes.factoria;

import modelo.genes.GenBoolean;
import modelo.genes.GenReal;
import modelo.genes.factoria.imp.FactoriaGenesImp;

public abstract class FactoriaGenes 
{
	private static FactoriaGenes instancia;
	
	public static FactoriaGenes getInstancia()
	{
		if (instancia == null)
			instancia = new FactoriaGenesImp();
		return instancia;
	}
	
	public abstract GenBoolean creaGenBoolean();
	
	public abstract GenReal creaGenReal();
}
