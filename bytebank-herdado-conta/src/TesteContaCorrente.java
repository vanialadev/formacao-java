
public class TesteContaCorrente {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		
		
		System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupanca: " + contaPoupanca.getSaldo());
		
		
		
	}

}
