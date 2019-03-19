public class Banco {

	private Conta[] conta;
	private int PosAtual = 0;
	
	 public Banco(){
        this.conta = new Conta[20];
    }
	//Na entrada do método, coloquei todo tipo de variavel pra preencher caso for uma contaPoupança ou contaCorrente.
	//No primeiro "for" ele verifica se ja não tem uma conta com o mesmo número.
	//Caso não tenha, ele cria uma variável do tipo conta, vai no tipo de conta desejada, e cria a conta com os dados e ja joga na posição vazia do array de conta.
	
	public void CriarConta( int tipo, int limiteSaque, int numero,float saldo, int LimCheq, boolean status, float variacao, float rendimentoMensal){
		for(int i= 0 ; i< this.conta.length; i++){
			if( numero == conta[i];){
				return " Já existe Conta com este número";
			} else if{
				Conta contaNova;
				if(tipo == 1){
                                        contaNova= new ContaCorrente(numero,saldo,limiteSaque, LimCheque, status);
                                        conta[this.posAtual]= contaNova;
                                        this.posAtual++;
                                }else if (tipo == 2){
                                        contaNova = new ContaPoupanca(numero, saldo,limiteSaque, variacao, rendimentoMensal);
                                        conta[this.posAtual] = contaNova;
                                        this.posAtual++;
				}
			}
        
		}
	}
	
	//Apenas encontra no array de Contas o numero da conta e apaga ela.
	public void apagarConta(int numero){
        for(int x = 0; x<conta.length ; x++ ){
            if(numero  == conta.NumConta){
                conta[x] = null;
            }
        }
    }
	
	
	
	
			
}
