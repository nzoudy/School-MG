package com.ingesup.expcal.entities;

import java.util.List;
import java.util.Date;

public class Formation {
	private Long idFormation;
	private String nomFormation;
	private String descriptionFormation;
	private Date dureeEtude;
	private Degre degre;
	private List<Matiere> matieres;
}
