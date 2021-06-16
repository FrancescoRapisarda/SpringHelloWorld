package corso.lez19.SpringHelloWorld.models;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	
	
	//COSTRUTTORE
	public Studente() {
		
		
	}

	//COSTRUTTORE CON PARAMETRI
	public Studente(String nome, String cognome, String matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}


	//GETTERS END SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
}
