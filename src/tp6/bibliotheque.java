package tp6;

public class bibliotheque {
	private documents [] Listdoc;
	private int nb_documents;
	private int capacité;
	
public bibliotheque(int capacite) {
	this.capacité=capacite;
	this.Listdoc =new documents[capacite];
	
}
public int getCapacite() {
	return capacité;
}
public void ajoutDoc(documents d) {
    if (nb_documents < capacité) {
        int i = nb_documents - 1;

        while (i >= 0 && Listdoc[i].getId() > d.getId()) {
            Listdoc[i + 1] = Listdoc[i];  
            i--;
        }
        Listdoc[i + 1] = d;
        nb_documents++;
    } else {
        System.out.println("La bibliothèque est pleine");
    }
}
public void supprimDoc(int num) {
    for (int i = 0; i < nb_documents; i++) {
        if (Listdoc[i].getId() == num) {
            for (int j = i; j < nb_documents - 1; j++) {
                Listdoc[j] = Listdoc[j + 1];  
            }
            nb_documents--;
            System.out.println("Document supprimé avec succès");
            return;
        }
    }
    System.out.println("Document non trouvé");
}
public void Inventaire_doc() {
	for(int i = 0; i < nb_documents; i++) {
		Listdoc[i].edition();
	}
}
public int getNbDoc() {
	return nb_documents;
}
public bibliotheque liste_livre() {
	bibliotheque livres = new bibliotheque(capacité);
	for (int i = 0; i < nb_documents; i++) {
        documents doc = Listdoc[i];  
        if (doc instanceof livres) { 
            livres.ajoutDoc(doc);   
        }
    }

    return livres; 
}
public bibliotheque liste_articles() {
	bibliotheque articles = new bibliotheque(capacité);
	for (int i = 0; i < nb_documents; i++) {
        documents doc = Listdoc[i];  
        if ((doc instanceof articles) && !(doc instanceof livres )) { 
            articles.ajoutDoc(doc);   
        } 
    }

    return articles; 
}
public bibliotheque liste_doc() {
	bibliotheque b = new bibliotheque(capacité);
	for (int i = 0; i < nb_documents; i++) {
        documents doc = Listdoc[i];  
        if(! (doc instanceof livres)&&! (doc instanceof articles)&&! (doc instanceof periodiques)){ 
            b.ajoutDoc(doc);   
        }
    }

    return b; 
}
public bibliotheque liste_periodiques() {
	bibliotheque periodiques = new bibliotheque(capacité);
	for (int i = 0; i < nb_documents; i++) {
        documents doc = Listdoc[i];  
        if (doc instanceof periodiques) { 
            periodiques.ajoutDoc(doc);   
        }
    }

    return periodiques ; 
}
}
