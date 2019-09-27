
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);		
		System.out.println(conta.saca(101));
	
		System.out.println(conta.getSaldo());
		
		//proibido:
		conta.saca(101);
		//conta.getSaldo() = conta.getSaldo() - 101; 
		System.out.println(conta.getSaldo());
		
	}
}
