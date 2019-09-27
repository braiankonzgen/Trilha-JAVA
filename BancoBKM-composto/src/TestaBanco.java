
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente braian = new Cliente();
		braian.nome = "Braian Maciel";
		braian.cpf = "222.222.222-22";
		braian.profissao = "programador";
		
		Conta contaDoBraian = new Conta();
		contaDoBraian.deposita(100);
		// associa o cliente braian a conta contaDoBraian
		contaDoBraian.titular = braian;
		
		System.out.println(contaDoBraian.titular.nome); 
		System.out.println(contaDoBraian.titular.cpf);
		System.out.println(contaDoBraian.titular.profissao);
	
	}
}
