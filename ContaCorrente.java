
public class ContaCorrente extends Conta{
	int numero;
	int saldo;
	boolean status;
	
	public ContaCorrente(int limiteSaque, int numero, int saldo, boolean status) {
		super(limiteSaque);
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
