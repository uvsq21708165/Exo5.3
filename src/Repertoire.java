import java.util.ArrayList;
import java.util.Iterator;

public class Repertoire extends Systeme
{
    //liste de type Systeme qui peut etre soit un repertoire soit un fichier
    private ArrayList<Systeme> systeme;
    //nom du repertoire
    private String nom;

   //constructeur
    public Repertoire(String nom)
    {
        this.nom = nom;
        this.systeme = new ArrayList<Systeme>();
    }
    
    //ajouter un elem dans ma liste
    public boolean add_elem (Systeme elem)
    {
          
            return systeme.add(elem);
            
    }
    
    //supprimer un elem de ma liste
    public boolean remove_elem(Systeme elem)
    {
        return systeme.remove(elem);
    }
    
    
    
    public int Taille()
    {
        //iterateur de la liste de systeme pouvant contenir des repertoires et/ou fichiers
        Iterator<Systeme> liste = systeme.iterator();
        int x = 0;
        
        //tant que le suiv de la liste existe
        while(liste.hasNext()) {
            x += liste.next().Taille();     //la taille sera egale à la taille des fichiers + taille des repertoires qui est toujours 0 
        }
        return x;
    }
}

