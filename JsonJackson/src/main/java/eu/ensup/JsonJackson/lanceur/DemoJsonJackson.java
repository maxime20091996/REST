package eu.ensup.JsonJackson.lanceur;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.ensup.JsonJackson.domaine.Employe;

public class DemoJsonJackson {
	
	public static void main(String[] args) throws IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Employe employe1 = new Employe("Jean", "Eudes");
		Employe employe3 = new Employe("Pierre", "Paul");
		
		//Object vers fichier JSON
		File resultFile = new File("employe.json");
		mapper.writeValue(resultFile, employe1);
		
		//Fichier JSON vers Object
		Employe employe2 = mapper.readValue(resultFile, Employe.class);
		System.out.println(employe2);
		
		List<Employe> listeEmployes = new ArrayList <Employe>();
		listeEmployes.add(employe1);
		listeEmployes.add(employe2);
		listeEmployes.add(employe3);
		System.out.println(listeEmployes);
	}
}
