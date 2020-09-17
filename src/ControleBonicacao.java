
public class ControleBonicacao {
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	public void registra(Funcionario f) {
		soma += f.getBonificacao();
	}
}
