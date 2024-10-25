package tp6;

public class articles extends documents {
	protected String nomA;
	
	
public articles(String nomA,String titre,int id,int nb_pages) {
	super(titre,id,nb_pages);
	this.nomA=nomA;
	
}
public void edition() {
	System.out.println("article : \n titre : "+titre+"\n identifiant :"+id+"\n nombres de pages :"+nb_pages+"\n nom de l'auteur "+nomA);
}
public String getNomA () {
	return nomA;
	
}
public void setNomA(String nomA) {
	this.nomA=nomA;
}
}

