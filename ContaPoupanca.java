
public class ContaPoupanca extends Conta {
	protected float variacao;
	protected float rendimentoMensal;
	
	public ContaPoupanca(int limiteSque,int numero, int saldo, float variacao, float rendimentoMensal) {
		super(limiteSaque, numero, saldo);
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
