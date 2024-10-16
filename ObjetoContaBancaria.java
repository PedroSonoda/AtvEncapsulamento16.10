package Encapsulamento;

public class ObjetoContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(100000.00);
		System.out.println(conta.getSaldo());
		
		//Depósitos
		conta.depositar(500);
		conta.depositar(1000);
		
		// mostrar saldo após dois depósitos
		
		System.out.println(conta.getSaldo());
		
		//Saque 
		conta.sacar(1500);
		
		// mostrar após saque
		System.out.println(conta.getSaldo());
	}
	
}
