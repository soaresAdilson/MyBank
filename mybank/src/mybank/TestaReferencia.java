package mybank;

public class TestaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta "+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta "+ segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta "+ segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta "+" na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
	}
}
