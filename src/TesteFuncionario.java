
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Viní");
		gerente.setCpf("464678-4");
		gerente.setSenha(123456);
		
		Designer d = new Designer();
		ControleBonicacao controle = new ControleBonicacao();
		controle.registra(gerente);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		System.out.println(gerente.autentica(12346));
		
	}

}
