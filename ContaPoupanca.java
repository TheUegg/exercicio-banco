
public class ContaPoupanca extends Conta {
	int variacao;
	int rendimentoMensal;
	
	public ContaPoupanca(int limiteSaldo, int variacao, int rendimentoMensal) {
		super(limiteSaldo);
		this.variacao = variacao;
		this.rendimentoMensal = rendimentoMensal;
	}

	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}

	public int getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(int rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
}
