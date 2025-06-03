package business;

public class Moderateur extends Utilisateur {
    private String numeroDeTelephone;

    public Moderateur(String pseudo,String motDePasse,String email,String numeroDeTelephone ) {
        this.numeroDeTelephone = numeroDeTelephone;
        super(pseudo, motDePasse, email);
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public String toString() {
        return "Moderateur{" +
                "numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
