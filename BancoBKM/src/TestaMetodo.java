
public class TestaMetodo {

	public static void main(String[] args) {
	Conta contaDoBraian = new Conta();
	contaDoBraian.saldo = 100;
	contaDoBraian.deposita(50);
	System.out.println(contaDoBraian.saldo);
	
	boolean conseguiuRetirar = contaDoBraian.saca(20);
	System.out.println(contaDoBraian.saldo);
	System.out.println(conseguiuRetirar);
	
	Conta contaDaMarcela = new Conta ();
	contaDaMarcela.deposita(1000);
	
	if(contaDaMarcela.transfere(300, contaDoBraian)) {
		System.out.println("transferencia feita com sucesso");
	} else {
		System.out.println("faltou dinheiro");
	}
	System.out.println(contaDaMarcela.saldo);
	System.out.println("Seu novo saldo é: " + contaDoBraian.saldo);
	
	
	contaDoBraian.titular = "braian maciel";
	System.out.println(contaDoBraian.titular);
	
	}
}
