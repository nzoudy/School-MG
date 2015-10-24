package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.util.Date;

public class Absence implements Serializable {

	private Long absence;
	private Date dateAbscence;
	//private bJustificatifAbcence, PDFJustificatif,
	private boolean flagJustifier;
	private Etudiant etudiant;
	private Professeur professeur;
	
}
