package helloworldmvc.model;

import helloworldmvc.Contract.IModel;

import java.io.BufferedReader;
import java.io.FileReader;

public class Model implements IModel{
private static final String CHEMIN = "helloFile.txt"; //Emplacement du fichier
	    
public String getHelloWorld() {
	// TODO Auto-generated method stub
        String r = "[ERREUR E/S]"; //Sera changé si tout se passe correctement
        try {
	        BufferedReader bf = new BufferedReader(new FileReader(CHEMIN)); //Créaction du lecteur
	        r = bf.readLine(); //On lit
	        bf.close(); //On ferme
	        } catch (Exception e) /*S'il y a une couille*/ {
	            e.printStackTrace(); //Vomir l'erreur à l'utilisateur
	        }
	        return r; //Mange ton String toi qui m'a appelé
	    }


	}

