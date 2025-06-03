import business.Moderateur;

public class Main {
    public static void main(String[] args) {
        Moderateur moderateur = new Moderateur("Sam", "0000", "sam@test.com", "0600000000");
        System.out.print("- " + moderateur);
    }
}