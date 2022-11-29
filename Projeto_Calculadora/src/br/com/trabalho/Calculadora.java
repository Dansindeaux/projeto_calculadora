package br.com.trabalho;

public abstract class Calculadora {
	
	public abstract double soma(double numeroA, double numeroB);
	
	public abstract double subtracao(double numeroA, double numeroB);
	
	public abstract double divisao(double numeroA, double numeroB) throws Exception;
	
	public abstract double multiplicacao(double numeroA, double numeroB);
	
	public abstract double exponencial(double numeroA, double numeroB);
	
	public abstract double raizquadrada(double numeroA);
	
	public abstract double teto(double numeroA);
	
	public abstract void piso(double numeroA);
	
}
