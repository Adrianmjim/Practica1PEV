package modelo.cromosomas;

import modelo.genes.Gen;

public class CromosomaMaxMin extends Cromosoma {
	private int xmin;
	private int xmax;
	private int longitudCromosoma;
	public CromosomaMaxMin(int xmin, int xmax, int longitud) {
		super();
		this.xmax = xmax;
		this.xmin = xmin;
		longitudCromosoma = longitud;
		this.genes = new Gen[longitudCromosoma];
		
	}
	public double fenotipo() {
		return 0;
	}
	public double evalua() {
		return 0;
	}

}
