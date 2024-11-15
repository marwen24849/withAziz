package entity;

import java.util.Objects;

public class Employer implements Comparable<Employer>{

    private int id;
    private String nom;
    private String prenom;
    private String depName;
    private int garde;

    public Employer(int id, String nom, String prenom, String depName, int garde) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.depName = depName;
        this.garde = garde;
    }

    public Employer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getGarde() {
        return garde;
    }

    public void setGarde(int garde) {
        this.garde = garde;
    }

    @Override
    public String toString() {
        return "entity.Employer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", depName='" + depName + '\'' +
                ", garde=" + garde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id && Objects.equals(nom, employer.nom);
    }


    @Override
    public int compareTo(Employer o) {
        return Integer.compare(o.getId(),id);
    }
}
