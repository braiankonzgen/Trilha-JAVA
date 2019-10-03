
//Gerente � um Funcionario, ou seja Gerente herda da class Funcionario, e Assina o contrato Autenticavel.
// � uma extens�o do Funcionario e uma extens�o de Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		
		System.out.println("chamando o m�todo de bonificacao do GERENTE");
		//return super.getBonificacao() + super.getSalario(); 
		// metodo get.Bonificacao esta definido na classe mae.
			// novo salario 
		return super.getSalario(); 
		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		}
	}