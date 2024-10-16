package Encapsulamento;

public class Estudante {

	private String nome;
	private double nota1;
	private double nota2;
	
	
	// Construtor
	public Estudante (String nome, double nota1, double nota2) {
		
		this.nome = nome;
		setnota1 (nota1);
		setnota2 (nota2);
		
	}
	
	// Getter e Setter para o  nome
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
	this.nome = nome;
	}
	// Getter e Setter notal com validação
	public double getNota1 () {
	return nota1;
	}
	public void setnota1 (double nota1) {
		if (nota1>=0 && nota1 <= 10) {
			}else {
				System.out.println("Nota 1 inválida! Deve estar entre 0 e 10.");
			}
	}
	
	// Getter e Setter nota2 com validação
	public double getnota2 ( ) {
	return nota2;
	}
	
	public void setnota2 (double nota2) {
		
		if (nota2 >= 0 && nota2 <= 10) {
			
			this.nota2 = nota2;
		} else {
	System.out.println ("Nota 2 inválida! Deve estar entre 0 e 10.");
		}
	}
	
	// Metodo para calcular a média 
	public double calcularMedia() {
		return (nota1 + nota2)/ 2;
	}
	// Método exibir as informações do estudante
	public void exibirinformacoes () {
	System.out.println ("Estudante :" + nome + ", Média: " + calcularMedia ());
	}
}