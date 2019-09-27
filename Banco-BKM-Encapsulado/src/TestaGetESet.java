
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337; // não funciona pq numero agora é um atributo privado.
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		Cliente braian = new Cliente();
		//conta.titular = braian; não compila pq titular é privado
		braian.setNome("braian maciel");
		conta.setTitular(braian); // ainda não existe o método set.Titular! Precisa ser criado na classe Conta!!!

		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora em duas linhas:
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(braian);
		System.out.println(conta.getTitular());
		
	}
	
}
