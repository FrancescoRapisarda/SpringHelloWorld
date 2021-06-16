package corso.lez19.SpringHelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	@GetMapping("/")
	public String testFunzionamento() {
		
		System.out.println("Tutto sta funzionando correttamente");
		
		return "Funziono!";
	}

	
	@GetMapping("/giovanni")			// http://localhost:8181/hello/giovanni  //INTERCETTO LA REST DI REQUEST!
	public String salutaGiovanni() {
		
		return "Ciao Giovanni";			//Restituisce la REST RESPONSE!
	}
	
	
	@GetMapping("/mario")				// http://localhost:8181/hello/mario
	public String salutaMario() {
		
		return "Ciao Mario";
	}
	
	
	@GetMapping("/saluta/{nome}")		// http://localhost:8181/hello/saluta/SonounaVariabile
	public String salutaNome(@PathVariable String nome) {
		return "Ciao " + nome;
	}
	
	
	@GetMapping("/saluta/{nome}/{cognome}")
	public String salutaNomeCognome(@PathVariable String nome, @PathVariable String cognome) {
		return "Ciao " + nome + ", " + cognome;
	}
	
	@GetMapping("/persona")
	public String salutaPersona(@RequestParam( name="nomePer" ) String nome, @RequestParam( name="cognomePer" ) String cognome) {
		return "Ciao " + nome + ", " + cognome;
	}
	
	
	@GetMapping("/test")
	public String testGet() {
		return "Il post funziona! ;)";
	}
	
	//SEZIONE POST
	
	@PostMapping("/test")
	public String testPost() {
		return "Il post funziona! ;)";
	}
}
