public class Main {

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("LE GALLIC", "Benjamin", "27 Boulevard Henry Orrion", "1988", "28");
        System.out.println("Etudiant n°1 :");
        System.out.println("Nom : " + etudiant1.getNom());
        System.out.println("Prénom : " + etudiant1.getPrenom());
        System.out.println("Adresse : " + etudiant1.getAdresse());
        System.out.println("Annee : " + etudiant1.getAnnee());
        System.out.println("Age : " + etudiant1.getAge());
    }
}
