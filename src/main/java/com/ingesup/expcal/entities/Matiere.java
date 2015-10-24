package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Date;

public class Matiere implements Serializable{
	
	 private Long idMatiere;
	 private String nomMatiere;
	 private String descriptionMatiere;
	 private Date dureDuCours; 
	 private Date dateCreationMatiere;
	 private Date dateModificationMatiere;
	 private Professeur professeur; 
}
