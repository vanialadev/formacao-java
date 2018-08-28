
public class Cliente2 implements Autenticavel {


	private AutenticacaoUtil autenticador;
	
	
	public Cliente2() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

}
