
public class Movimentacao {
	int numeroConta;
	String movimento;
	float  valor;
	
	public Movimentacao(int numeroConta, int valor, String movimento) {
		this.numeroConta = numeroConta;
		this.valor = valor;
		this.movimento = movimento;
	}

	public int getnumeroConta() {
		return numeroConta;
	}

	public int getValor() {
		return valor;
	}

	public String getMovimento() {
		return movimento;
	}
	
}
