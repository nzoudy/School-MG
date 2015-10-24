package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable{

	private String libelleNote;
	private String commentaireProfesseur;
	private Date dateDevoir;
	private float  Coefficient;
	private Etudiant etudiant;
	private Matiere matiere;
}
