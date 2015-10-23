package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Date;

public class Etudiant implements Serializable {

	private Long idEtudiant;
	private String nomEtudiant;
	private String prenom;
	private Date dateNaissance;
	private String telephone;
	private String email;
	private String nomEntreprise;
	private String numSecuriteSociale; 
	private Date dateCreationCompte;
	private Date dateDernierModification;
	private Long nbModification;
	private Formation formation;
}
