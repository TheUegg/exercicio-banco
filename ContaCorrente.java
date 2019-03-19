
public class ContaCorrente extends Conta{
	protected int LimCheque;
	protected boolean status;
	
	//Apaguei todos os metodes de mostrar Saldo, Número porque  não é aqui, e adicionei elas na entrada do construtor da super classe.
	public ContaCorrente(int,numero, float saldo,int limiteSaque, int LimCheque, boolean status) {
		super(numero, saldo, limiteSaque);
		this.LimCheque = LimCheque;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
