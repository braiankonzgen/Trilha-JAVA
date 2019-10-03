
public class ControleBonificacao {
	
	private double soma; //atributo
	
	//Com apenas o Método Funcionário é possivel controlar os demais 
	// funcionários e utilizam a referencia mais genérica, no caso Gerente  e Editor de video;
	
	public void resgistra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
//	public void resgistra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;
//	}
//	
//	public void resgistra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//		
//	}
	
	public double getSoma() {
		return soma;
	}
}
