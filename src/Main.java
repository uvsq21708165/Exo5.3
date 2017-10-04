
public class Main {

	public static void main(String[] args) {
		 Fichier F=new Fichier("F1",5);
	        Fichier Fich=new Fichier("F2",10);
	        Repertoire r= new Repertoire("repertoire");
	        r.add_elem(F);
	        r.add_elem(Fich);
	        System.out.println(r.Taille());
	}

}
