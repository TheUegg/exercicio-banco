
public class Conta {
	
	protected int limiteSaque;
	protected int numero;
	protected float saldo;
	protected Movimentacao[] movimentacao = new Movimentacao[20];
	
	public Conta() (int limiteSaque,int numero, float saldo){
		this.limiteSaque = limiteSaque;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(int limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public float getSaldo(){
		return this.saldo;
		
	}
	
	public void setSaldo( float saldo){
		this.saldo= saldo;
	}
	

	
}
