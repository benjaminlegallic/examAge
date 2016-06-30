public class Etudiant {


    private String nom;

    private String prenom;

    private String adresse;

    private int annee = 2016;

    private int anneeDeNaissance;

    private int age;


    public Etudiant(String nom, String prenom, String adresse, int anneeDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.annee = annee;
        this.anneeDeNaissance = anneeDeNaissance;

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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculDeAge() {
        int age = annee-anneeDeNaissance;
        return age;
    }

}

