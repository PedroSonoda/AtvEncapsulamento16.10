package Encapsulamento;

public class ItemCasa {

	long id;
	String nome;
	String descricao;
	
	public ItemCasa () {
	}
		public ItemCasa (long id, String nome, String descricao) {
			this.id = id;
			this.nome = nome;
			this.descricao = descricao; 
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
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
}
