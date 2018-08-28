
public class TesteSistema {

	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);

		Administrador administrador = new Administrador();
		administrador.setSenha(3333);
		
		Designer designer = new Designer();
//		designer.setSenha(4444); não pode mais
		
		Cliente2 cliente = new Cliente2();
		cliente.setSenha(2222);
		
		Autenticavel referencia = new Administrador();
		referencia.setSenha(34344);

		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(cliente);
		sistemaInterno.autentica(referencia);
//		sistemaInterno.autentica(designer); não pode mais
		
	}
}
