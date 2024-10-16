package Encapsulamento;

public class Tema {

	private int id;
	private String nome;
	private double valorAluguel;
	private String cortoalha;

	public Tema (int id,String nome,double valorAluguel, String cortoalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.cortoalha = cortoalha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getCortoalha() {
		return cortoalha;
	}

	public void setCortoalha(String cortoalha) {
		this.cortoalha = cortoalha;
	}
}
