package modelo.genes;

import java.util.Random;

public abstract class Gen
{
	protected int tam;
	protected double xMin;
	protected double xMax;
	protected double tol;
	protected Random generator;
	
	public abstract Gen copia();
	
	public abstract boolean esValido();
	
	public abstract double fenotipo();
	
	public abstract void mutar(double probMutacion); 
}
