package mybank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaAysha = new Conta();
		contaDaAysha.saldo = 100;
		contaDaAysha.deposita(50);
		System.out.println( contaDaAysha.saldo);
		boolean conseguiuRetirar = contaDaAysha.saca(20);
		//contaDaAysha.saca(20);
		System.out.println(contaDaAysha.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMidian = new Conta();
		contaMidian.deposita(1000);
		boolean sucessoTransferencia = contaMidian.transfere(300, contaDaAysha);
		if(sucessoTransferencia) {
		    System.out.println("transfere com sucesso");
	
	}else {
		System.out.println("faltou dinheiro");
	}
		System.out.println(contaMidian.saldo);
		System.out.println(contaDaAysha.saldo);
		
		contaDaAysha.titular = "Aysha Torres de freitas";
		System.out.println(contaDaAysha.titular);



	}
}
