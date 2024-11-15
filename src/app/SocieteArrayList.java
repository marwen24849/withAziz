package app;

import entity.Employer;
import service.IGestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SocieteArrayList implements IGestion<Employer> {

    static List<Employer> employers = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employer employer) {
        employers.add(employer);
        System.out.println("Add Done!");
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employers
                .stream()
                .filter(
                        e-> !e.getNom().equals(nom)
                )
                .collect(Collectors.toList())
                .isEmpty();
    }

    @Override
    public boolean rechercherEmploye(Employer employer) {
        return employers
                .stream()
                .map(
                        emp -> emp.equals(employer)
                )
                .collect(Collectors.toList())
                .isEmpty();
    }

    @Override
    public void supprimerEmploye(Employer employer) {
        employers.remove(employer);
        System.out.println("Delete Done!!");
    }

    @Override
    public void displayEmploye() {
       employers
               .forEach(
                       employer -> System.out.println(employer.toString())
               );


    }

    @Override
    public void trierEmployeParId(){
        employers.sort(Employer::compareTo);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employers.sort(
                Comparator.comparing(Employer::getNom)
                        .thenComparing(Employer::getDepName)
                        .thenComparingInt(Employer::getGarde)
        );
    }

}
