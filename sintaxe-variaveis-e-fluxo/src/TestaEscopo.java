
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >=2;

		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			
		 acompanhado = true;	
		} else {
			acompanhado = false;
			}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		
		if (idade >= 18 && acompanhado) {
		
		//if (idade >= 18 || quantidadePessoas >= 2) {
			//System.out.println("seja bem vindo");
			//}
		//if (idade >= 18 && quantidadePessoas >= 2) {
			//System.out.println("seja bem vindo");
			//}
		}else {
			System.out.println("infelizmente voce n�o pode entrar");
		}
	}

	}
