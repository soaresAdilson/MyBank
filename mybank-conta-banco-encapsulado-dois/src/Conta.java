public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//static referente a classe no total e nao ao objeto
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("o total de contas � "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		System.out.println("estou criando uma conta "+ this.numero);
	}
	
	public void deposita(double valor) {
		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			//this.saldo = this.saldo - valor;
			this.saldo -=valor;
			return true;
		}else {
			return false;
		}
	}
	
		
		public boolean transfere(double valor, Conta destino){
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			}
			return false;
		
	
		
	}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			if(numero <= 0) {
				System.out.println("numero nao pode ser menor ou igual a zero");
				return;
			}
			this.numero = numero;
		}
		
		public int getAgencia() {
			return agencia;
	    }
		
		public void setAgencia(int agencia) {
			if(agencia <= 0) {
				System.out.println("agencia nao pode ter valor <= 0");
				return;
			}
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		
		}
		
		public static int getTotal() {
			return Conta.total;
		}
}




