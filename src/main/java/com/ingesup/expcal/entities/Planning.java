package com.ingesup.expcal.entities;

import java.io.Serializable;
import java.sql.Date;

public class Planning implements Serializable{
	 private int IdPlanning;
	 private int IdSalle;
	 private Date HeureDebutOccupation;
	 private Date HeureFinOccupation;
}
