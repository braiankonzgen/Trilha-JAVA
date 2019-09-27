
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12345677);
		// conta está inconsistente de acordo com a regra de négocio estabelecida 
		// ou seja retorna 0
		//conta.setAgencia(-50);
		//conta.setNumero(-300);
		Conta conta2 = new Conta(1337, 14952);
		Conta conta3 = new Conta(1337, 16456);
		
		System.out.println(Conta.getTotal());
		
	}
}
