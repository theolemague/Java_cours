
/*compilation : 
	javac *.java -d /build
	java -cp build/ nomdelaclasse 

*/
public class ClientEtudiant {
	public static void main (String[] args){
		GroupeEtudiant TC = new GroupeEtudiant();
		Etudiant toto = new Etudiant(1, "Toto", "Tata");
		Etudiant Thomas = new Etudiant(2, "Thomas", "Georges");
		Etudiant Gaetan = new Etudiant(2, "Gaetan", "Roussel");
		TC.ajout(toto);
		TC.ajout(Thomas);
		TC.ajout(Gaetan);
		System.out.println(TC.recherche("Titi"));
		System.out.println(TC.recherche("Georges"));
	}
}