
public class Movimentacao {
	
	String descricao;
	int valor;
	int movimento;
	
	public Movimentacao(String descricao, int valor, int movimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.movimento = movimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getMovimento() {
		return movimento;
	}

	public void setMovimento(int movimento) {
		this.movimento = movimento;
	}
	
	
}
