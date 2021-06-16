package corso.lez19.SpringHelloWorld.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import corso.lez19.SpringHelloWorld.models.Studente;

@RestController
@RequestMapping("/studente")
public class StudenteController {

//	@PostMapping("/inserisci")				//chiede di inserire chiave: valore in JSON!
//	public String inserisciStudente(@RequestBody Studente objStudente) {
//		return objStudente.toString();
//	}
	
	
	@PostMapping("/inserisci")				//ECO invia uno Studente e restituisce Studente ovvero un oggetto di tipo JSON con chiave:valore!
	public Studente inserisciStudente(@RequestBody Studente objStudente) {
		return objStudente;
	}
	
	@PostMapping("/lista")
	public List<Studente> listastudenti() {
		
		Studente gio = new Studente("Giovanni", "Pace", "MT000001");
		Studente fra = new Studente("Francesco", "Rapisarda", "MT000002");
		Studente fed = new Studente("Federico", "Di Pasquali", "MT000003");
	
		List<Studente> elenco = new ArrayList();
		elenco.add(gio);
		elenco.add(fra);
		elenco.add(fed);
		
		return elenco;
		
	}
	
	@PostMapping("/importa")				//intercetta ogni singolo elemento della lista e a portarlo dentro come se fosse un OGGETTO!
	public String importStudenti(@RequestBody List<Studente> elenco) {
		
		for(int i=0; i<elenco.size(); i++) {
			Studente temp = elenco.get(i);
			System.out.println(temp.toString());
		}
		return "Tutto ok!";
		
	}
	
}
