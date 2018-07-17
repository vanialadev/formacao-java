
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		super();
	}

	public Conta(int agencia, int numero) {
		super();
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;

	}
	
	public boolean saca(double valor) {
		if (valor <= saldo)  {
			this.saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		} 
		
		return false;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}
	
	

}
