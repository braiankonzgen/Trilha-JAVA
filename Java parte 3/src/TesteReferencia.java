
public class TesteReferencia {

	public static void main(String[] args) {
		//Referencia através da Classe Gerente
		// Declarando a variavel tipo gerente  (esquerda)
		//e criando Objeto tipo gerente(direita)
		Gerente g1 = new Gerente();	
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		
//		Funcionario f = new Funcionario();
//		f.setSalario(2000.00);
		
		
		EditorVideo ev= new EditorVideo();
		ev.setSalario(2500.00);

		Designer d = new Designer();
		d.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.resgistra(g1);
		//controle.resgistra(f);
		controle.resgistra(ev);
		controle.resgistra(d);
		
		System.out.println(controle.getSoma());
		
	}



	
	
	
	
	
	
	
	
	
	
	
//
//public static void main(String[] args) {
//	//Referencia através da  Classe Funcionrio
//	// Declarando a variavel tipo gerente  (esquerda)
//	//e criando Objeto tipo gerente(direita)
//	Gerente g1 = new Gerente();	
//	g1.setNome("MArcos");
//	String nome = g1.getNome();
//	
//	System.out.println(nome);
//	
//}

}