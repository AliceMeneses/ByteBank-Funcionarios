
public class Cliente implements Autenticavel{
	
private AutenticavelUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticavelUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
