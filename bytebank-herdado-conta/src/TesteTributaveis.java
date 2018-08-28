
public class TesteTributaveis {

	public static void main(String[] args) {
		
		
		ContaCorrente contaCorrente = new ContaCorrente(1111, 2222);
		contaCorrente.deposita(100);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(seguroDeVida);
		
		
		System.out.println(calculadorDeImposto.getTotalImposoto());
		
	}
}
