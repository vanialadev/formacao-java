package bytebank;

public class TestaValores {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1111, 1232);
		
		conta.setTitular(new Cliente());
		conta.getTitular().setNome("vania");
		
		System.out.println(conta.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
		
		
		Conta conta2 = new Conta(2222, 1232);
		
		
		System.out.println(Conta.getTotal());
		
		System.out.println(conta2.getAgencia());


	}
}
