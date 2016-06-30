import java.util.Calendar;

public class Etudiant {


    private String nom;

    private String prenom;

    private String adresse;

    private String annee;

    private String age;



    public Etudiant(String nom, String prenom, String adresse, String annee, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.annee = annee;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

