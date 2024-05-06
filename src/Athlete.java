public class Athlete{
    private String nom;
    private String prenom;
    private boolean sexe;
    private int force;
    private int endurance;
    private int agilite;
    public Athlete(String nom, String prenom, boolean sexe, int force,
                int endurance, int agilite){
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.force = force;
        this.endurance = endurance;
        this.agilite = agilite;
    } 
    public String getNomAthlete(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public boolean isSexe() {
        return sexe;
    }
    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }
    public int getForce() {
        return force;
    }
    public void setForce(int force) {
        this.force = force;
    }
    public int getEndurance() {
        return endurance;
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public int getAgilite() {
        return agilite;
    }
    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }
}
