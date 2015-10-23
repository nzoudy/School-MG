package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.sql.Date;

public class Note implements Serializable {
	
	private int IdEtudiant;
	private int IdMatiere;
	private String LibelleNote;
	private String CommentaireProfesseur;
	private Date DateDevoir;
	private float  Coefficient;
}
