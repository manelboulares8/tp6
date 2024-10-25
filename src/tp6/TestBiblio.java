package tp6;
import java.util.Scanner;

public class TestBiblio {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

	documents d1=new documents("document1",1,100);
	documents d2=new documents("document2",2,120);
	documents d3=new documents("document3",3,300);
	articles a1 =new articles("auteur 1","article 1",4,230);
	articles a2 =new articles("auteur 2","article 2",5,290);
	livres l1=new livres ("auteur de livre 1","livre1",6,500,"editeur 1");
	livres l2=new livres ("auteur de livre 2","livre2",7,1200,"editeur 2");
	periodiques p1=new periodiques("auteur de periodique 1","periodique 1",8,790,10);
	periodiques p2=new periodiques("auteur de periodique 2","periodique 2",9,1234,16);
	bibliotheque biblio = new bibliotheque(20);
	biblio.ajoutDoc(a1);
	biblio.ajoutDoc(a2);
	biblio.ajoutDoc(p2);
	biblio.ajoutDoc(d3);
	biblio.ajoutDoc(d1);
	biblio.ajoutDoc(l1);
	biblio.ajoutDoc(p1);
	biblio.Inventaire_doc();
	System.out.println("la liste des articles : \n");
	bibliotheque bb=biblio.liste_articles();
	bb.Inventaire_doc();
	//bibliotheque bbb=biblio.liste_doc();
	//bbb.Inventaire_doc();
	//bibliotheque bbbb=biblio.liste_livre();
	//bbbb.Inventaire_doc();
	//bibliotheque bper=biblio.liste_periodiques();
	//bper.Inventaire_doc();
	System.out.println("Donner l'id du document  à supprimer  :");
    int id =scanner.nextInt();
    biblio.supprimDoc(id);
    biblio.Inventaire_doc();
	
}
}
