class Conto
{

	private int saldoConto;

	public Conto(int x){
		this.saldoConto = x;
	}
	
	private String nome;
	private String pin = "1234";
	private int prelievo;

	public void getNome(){
	}

	public void setNome(String nomeUtente){
		this.nome = nomeUtente;
	} 


	public String getPin(){
		return pin;
	}

	public boolean checkPin(String pinUtente){
		if(pinUtente.equals(this.pin)){
			return true;
		} else {
			return false;
		}
	}

	public void setPrelievo(int prelievo){
		this.prelievo = prelievo;
	}
	
	public int getSaldoConto(){
		this.saldoConto = (saldoConto - prelievo);
		return this.saldoConto;
	}

	public void checkPrelievo(int prelievo){
		if (prelievo > 1000)
		{
			System.out.println("Somma troppo alta!");
		} else {
			System.out.println("Prelievo effettuato!");
		}
	}

}
