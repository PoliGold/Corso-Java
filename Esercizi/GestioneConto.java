import javax.swing.*;

class GestioneConto	 
{
	public static void main(String[] args) 
	{

		Conto x = new Conto(1000);

		String nome = JOptionPane.showInputDialog("Nome Utente");

		x.setNome(nome); // catturo il nome dato da input utente



	    int tentativi = 0; // imposto i numeri di tentativi a 0
		boolean autorizzazione = false; //imposto autorizzazione con valore iniziale di false
		do // inizo DO WHILE
		{
		}
		while ();
		{
		String pin = JOptionPane.showInputDialog("Inserisci il PIN");

		if (x.checkPin(pin) == false)  // Controllo se il PIN é corretto o meno ritornando un valore TRUE o FALSE
		{
			tentativi++;	// Icremento i tentativi 		 
		 }
		 else {
			tentativi = 5;
			autorizzazione = true;

        }
	
		}
		while (tentativi < 3);  // se i tentivi sono minori di tre e l'autorizzazione è TRUE allora procedo con il prelievo
		if(autorizzazione == true){

		int prelievo = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'importo da prelevare"));
		x.setPrelievo(prelievo);
		x.checkPrelievo(prelievo);
		
		System.out.println("Il tuo saldo è: " + x.getSaldoConto());
		} else {
			System.out.println("Accesso alla banca bloccato!");
		}
	}
}
