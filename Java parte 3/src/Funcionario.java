
//Nao pode instanciar objetos dessa classe(criar objetos), pq � abstrata!!!
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//public Funcionario() { // construtor vazio padr�o}
	
	// significa que o metodo nao tem corpo ou seja nao tem implementa��o
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
