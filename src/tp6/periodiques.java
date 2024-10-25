package tp6;

public class periodiques extends documents{
	private double fréquence;
	
public periodiques (String nomA,String titre,int id,int nb_pages , double fréquence) {
		super(titre,id,nb_pages);
		this.fréquence =fréquence;
		
	}
public void edition() {
	System.out.println("périodiques : \n titre : "+titre+"\n identifiant :"+id+"\n nombres de pages :"+nb_pages+"\n fréquence :"+fréquence);
}

public double getFrequence() {
	return fréquence;
}
public void setFrequence(double freq) {
	this.fréquence=freq;
}
}
