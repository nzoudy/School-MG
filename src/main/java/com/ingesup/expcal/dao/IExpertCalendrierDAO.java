package com.ingesup.expcal.dao;

import java.util.List;

import com.ingesup.expcal.entities.Absence;
import com.ingesup.expcal.entities.Etudiant;
import com.ingesup.expcal.entities.Formation;
import com.ingesup.expcal.entities.Matiere;
import com.ingesup.expcal.entities.Note;
import com.ingesup.expcal.entities.Salle;

public interface IExpertCalendrierDAO {
	
	public void addEtudiant(Etudiant etudiant);
	public void updateEtudiant(Etudiant etudiant);
	public void deleteEtudiant(Long idEtudiant);
	public Etudiant findEtudiantById(Long idEtudiant);
	public List<Etudiant> getAllEtudiants();
	public Absence findAbsenceByEtudiant(Long idEtudiant);
	public List<Absence> getAllAbsence();
	
	public List<Etudiant> getAllEtudiantsByFormation(Formation formation);
	public List<Etudiant> getAllEtudiantsBySalle(Salle salle);
	public List<Matiere> getAllMatiersByFormation(Long idMatiere, Formation formation);
	public List<Matiere> getAllMatiersByEtudiant(Long idMatiere, Etudiant etudiant);
	public List<Etudiant> getAllEtudiantsByDegre(String degre);
	public List<Note> getAllNoteByEtudiant(Long idNote, Etudiant etudiant);

}
