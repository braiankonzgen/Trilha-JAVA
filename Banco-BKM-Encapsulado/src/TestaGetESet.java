
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337; // n�o funciona pq numero agora � um atributo privado.
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		Cliente braian = new Cliente();
		//conta.titular = braian; n�o compila pq titular � privado
		braian.setNome("braian maciel");
		conta.setTitular(braian); // ainda n�o existe o m�todo set.Titular! Precisa ser criado na classe Conta!!!

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
