package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.sql.Date;

public class Matiere implements Serializable {
	 private int IdMatiere;
	 private String NomMatiere;
	 private String DescriptionMatiere;
	 private Date DureDuCours; 
	 private Date DateCreationMatiere;
	 private Date DateModificationMatiere;
	 private int IdProfesseur; 
}
