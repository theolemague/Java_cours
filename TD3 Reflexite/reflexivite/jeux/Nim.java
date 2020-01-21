import fr.insalyon.tc.framework.JeuCombinatoire; 


public class Nim implements JeuCombinatoire {

    /** taille de la pile */
    private int pile = 15;

    /** indique si le jeu est fini ('true') ou non ('false') */
    public boolean estFini() {
        return ( pile <= 0 ); 
    }
    
    /** Coup realise par un joueur
     * @param unCoup coup d'un joueur sous la forme "i,j", 
     * où i et j sont les coordonnées de la nouvelle position
     * (l'origine "0,0" est le coin en bas a gauche).
     * @return 'true' si le coup est valide et que la position
     * a ete modifiee en consequence, 'false' sinon
     */
    public boolean joueUnCoup(String unCoup) {
        boolean res = true;
		int i = Integer.parseInt(unCoup);
		if (i>=1 && i<=3){
			pile =  pile-i;
		}
		else {
			res = false;
		}
        return res; 
    }
    
    /**
     * Representation textuelle de la position courante
     */
    @Override
    public String toString() {
		return Integer.toString(pile);
	}
}
