
public class Gerente extends Funcionario{
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		return this.senha == senha ? true : false; 
	}
	
	public double getBonificacao() {
		return super.getSalario() + super.getBonificacao();
	}

}
