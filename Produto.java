package Encapsulamento;

public class Produto {

	private String nome;
	private double preco;

	// Construtor
	public Produto ( String nome, double preco) {
		this.nome = nome;
		setPreco(preco);
	}


	// Getter para o nome
	public String getNome () {
		return nome;
	}

	// Setter para o nome
	public  void setNome (String nome) {
		this.nome = nome;
	}

	// Getter para o preço
	public double getpreco ( ) {
		return preco;
	}

	// setter para o preço com validade
	public void setPreco (double preco) {
		if (preco >= 0) {

			this.preco = preco;
		

	} else { 
		System.out.println("Preço invalido! não pode ser negativo.");
	}
}
// Método para exibir informações do produto

public void exibirInformacoes () {
	System.out.println("Produto: " + nome + ", Preço: " + preco);
}}
