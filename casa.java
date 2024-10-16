package Encapsulamento;

public class casa {

	long id;
	String nome;
	double valoraluguel;
	String cor;
	
	public casa () {
	}
		public casa (long id, String nome, double valoraluguel, String cor) {
			this.id = id;
			this.nome = nome;
			this.valoraluguel = valoraluguel;
			this.cor = cor;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getValoraluguel() {
			return valoraluguel;
		}
		public void setValoraluguel(double valoraluguel) {
			this.valoraluguel = valoraluguel;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		
	}

