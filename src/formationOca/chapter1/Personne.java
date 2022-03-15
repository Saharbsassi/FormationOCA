package formationOca.chapter1;

public class Personne {
	// attributs d'instance
	String nom; 
	int age;
	double moyenne;
	
public Personne(String nom)
{
 System.out.println("constructeur avec parametre nom");
 		this.nom = nom;
}

public Personne(String nom, int age, double moy)
{
 System.out.println("constructeur avec 3 parametres");
this.nom = nom;
this.age = age;
this.moyenne = moy;
}
}


