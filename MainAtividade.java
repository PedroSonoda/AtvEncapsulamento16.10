package Encapsulamento;

public class MainAtividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente (520,"Pedro Sonoda","15997272829","47499182886", "991571205");

		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getRg());
		System.out.println(cliente.getCpf());


		Tema tema = new Tema (987,"João",5000,"Branco");

		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAluguel());
		System.out.println(tema.getCortoalha());

		ItemTema item = new ItemTema (9584,"toalha de joão"," Branco com detalhes bordados");

		System.out.println(item.getId());
		System.out.println(item.getNome());
		System.out.println(item.getDescricao());

		Endereco endereco = new Endereco (879,"não possui",520,"casa rosa","jardim shangri-la","são paulo","18280580","sp");

		System.out.println(endereco.getId());		
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
	}

}
