package br.ceded.si.notas;

public class Notas {
	
	double [] notas = new double [] {5,9,8,10};
	
	

	public Notas(double[] notas) {
		
		this.notas = notas;
	}

	double mediaNotas(double[] notas) {
		
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		return media = notas.length;
	}
	
	double maiorNotas(double[] notas) {
		double maior = 0;
		
		return maior;
	}
}
