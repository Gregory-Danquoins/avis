package fr.humanbooster.avis.business;

import java.util.Objects;

public class Moderateur extends Utilisateur {
    private String numeroDeTelephone;

    public Moderateur() {
        super();
    }

    public Moderateur(String pseudo,String motDePasse,String email,String numeroDeTelephone ) {
        super(pseudo, motDePasse, email);
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moderateur that = (Moderateur) o;
        return Objects.equals(numeroDeTelephone, that.numeroDeTelephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDeTelephone);
    }

    @Override
    public String toString() {
        return "Moderateur{" + super.toString() + "numeroDeTelephone=" + numeroDeTelephone + '}';
    }
}
