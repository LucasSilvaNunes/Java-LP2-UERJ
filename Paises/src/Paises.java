package modelo;

public class Pais {
	private String sigla,nome;
	private int populacao;
	private double dimensao;
	
	public Pais(String sigla, String nome, int populacao, double dimensao) {
		this.sigla=sigla;
		this.nome=nome;
		this.populacao=populacao;
		this.dimensao=dimensao;
	}
	
	public Pais() {
		
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public double densiPop() {
		System.out.print("A densidade demográfica do país "+nome+" é de: ");
		return populacao / dimensao;
	}
	
	public String toString() {
		return "\nSigla: "+sigla+"\nNome: "+nome+"\nPopulação: "+populacao+"\nDimensão (em km²): "+dimensao+"\n";
	}
}
