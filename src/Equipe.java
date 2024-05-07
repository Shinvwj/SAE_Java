import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Equipe {
    private boolean sexe;
    private int taille;
    private List<Athlete> listeCoequipiers;

    public Equipe(boolean sexe, int taille){
        this.sexe = sexe;
        this.taille = taille;
        this.listeCoequipiers = new ArrayList<>();
    }

    // Méthode afin d'ajouter un athlète dans la liste des équipe
    public void ajouterMembre(Athlete athlete){
        listeCoequipiers.add(athlete);
    }
    public int getIndiceMembre(Athlete athlete) {
        return this.listeCoequipiers.indexOf(athlete);
    }

    public void enleverMembre(int indice) {
        listeCoequipiers.remove(indice);
    }
}
