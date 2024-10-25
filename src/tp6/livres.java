package tp6;

public class livres extends articles {
	private String nomE;
	
public livres (String nomA,String titre,int id,int nb_pages ,String nomE) {
		super(nomA,titre,id,nb_pages);
		this.nomE=nomE;
		
	}
public void edition() {
	System.out.println("livres : \n titre : "+titre+"\n identifiant :"+id+"\n nombres de pages :"+nb_pages+"\n nom de l'éditeur "+nomE);
}

public String getNomE() {
	return nomE;
}
public void setNomE(String nomE) {
	this.nomE=nomE;
}

}
