package modelo.genes;

import java.util.Random;

public class GenReal extends Gen 
{
	
	private double alelo;
	
	public GenReal()
	{
		this.generator = new Random();
		this.tam = 1;
		this.xMax = 0.0;
		this.xMin = 0.0;
		this.tol = 0.0;
		do
		{
			alelo = xMin + (generator.nextDouble()*xMax);
		} while(!esValido());
	}

	@Override
	public Gen copia() 
	{
		GenReal copia = new GenReal();
		copia.alelo = this.alelo;
		return copia;
	}

	@Override
	public boolean esValido()
	{
		return (alelo >= xMin && alelo <= xMax);
	}

	@Override
	public double fenotipo() 
	{
		return alelo;
	}

	@Override
	public String toString() 
	{
		return String.valueOf(alelo);
	}

	@Override
	public void mutar(double probMutacion) 
	{
		double prob;
		prob = generator.nextDouble();
		if(prob < probMutacion)
			this.alelo = xMin + (generator.nextDouble()*xMax);
		
	}

	public double getAlelo() 
	{
		return alelo;
	}

	public void setAlelo(double alelo) 
	{
		this.alelo = alelo;
	}

	@Override
	public void setTam(int tam) 
	{
		this.tam = tam;
	}

}
