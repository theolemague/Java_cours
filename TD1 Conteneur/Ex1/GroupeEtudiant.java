
import java.util.ArrayList;
import java.util.Iterator;


public class GroupeEtudiant{
	
	private ArrayList<Etudiant> listEtudiant = new ArrayList<Etudiant>();

	/**
     * Ajoute un etudiant dans la list du groupe
     * @param e un etudiant 
     * @return Une 'List<Etudiant>' contenant les etudiants ayant ce nom, vide si aucun ne l'a
     */
	public void ajout(Etudiant e){
		listEtudiant.add(e);
	}

	/**
     * Indique si le nom de l'etudiant est compris dans le groupe d'etudiant
     * @param nom un nom donne
     * @return Une 'List<Etudiant>' contenant les etudiants ayant ce nom, vide si aucun ne l'a
     */
	public ArrayList<Etudiant> recherche(String nom){
		ArrayList<Etudiant> result = new ArrayList<Etudiant>();

		for ( Etudiant e : listEtudiant ) {
			if (e.aCeNom(nom)){
				result.add(e);
			} 
		}
		return result;
	}

}