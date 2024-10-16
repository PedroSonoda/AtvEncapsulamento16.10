package Encapsulamento;

public class ObjetoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto prod = new Produto ("Queijo Prato", 50.00);
		
				// Mostra Valores iniciais
		System.out.println(prod.getNome() + "  " + prod.getpreco());
		
		prod.setPreco(53);
		System.out.println(prod.getpreco());
		
		prod.setPreco(56);
		System.out.println(prod.getpreco());
		
		prod.setNome("Queijo Parmesão");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getpreco());
	}

}
