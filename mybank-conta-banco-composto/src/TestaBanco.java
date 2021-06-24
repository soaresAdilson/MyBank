
public class TestaBanco {
	public static void main(String[] args) {
		Cliente Adilson = new Cliente();
		Adilson.nome = "Adilson de Freitas";
		Adilson.cpf = "222.222.222-22";
		Adilson.profissao = "Software Developer";
		
		
		Conta contaAdilson = new Conta();
		contaAdilson.deposita(100);
		
		contaAdilson.titular = Adilson;
		System.out.println(contaAdilson.titular.nome);
		
	
	}
}
