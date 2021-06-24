
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente adilson = new Cliente();
		//conta.titular = adilson;
		//adilson.nome = "adilson de freitas";
		adilson.setNome( "adilson de freitas");
		
		conta.setTitular(adilson);
		
		System.out.println(conta.getTitular().getNome());
		
		
		
		conta.getTitular().setProfissao("estudante");
		//agora com duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		// grafo
		System.out.println(titularDaConta);
		System.out.println(adilson);
		System.out.println(conta.getTitular());
	
		
	}

}
