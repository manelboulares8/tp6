package tp6;

public class documents {
	protected String titre;
	protected int id;
	protected int nb_pages;
	
public documents(String titre , int id, int nb_pages) {
	this.titre=titre;
	this.id=id;
	this.nb_pages=nb_pages;
}

public void edition() {
	System.out.println("documents : \n titre : "+titre+"\n identifiant :"+id+"\n nombres de pages :"+nb_pages);
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre=titre;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public int getNbPages() {
	return nb_pages;
}
public void setNbPages(int nb_pages) {
	this.nb_pages=nb_pages;
}


}
