
public class CalculadorDeImposto {
	
	private double totalImposoto;
	
	public void registra(Tributavel tributavel) {
		this.totalImposoto += tributavel.getValorImposto();;
	}
	
	public double getTotalImposoto() {
		return totalImposoto;
	}

}
