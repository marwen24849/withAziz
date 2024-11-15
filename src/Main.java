

import app.SocieteArrayList;
import entity.Employer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Menu de Gestion des Employés =====");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Rechercher un employé par nom");
            System.out.println("3. Rechercher un employé par objet");
            System.out.println("4. Supprimer un employé");
            System.out.println("5. Afficher tous les employés");
            System.out.println("6. Trier les employés par ID");
            System.out.println("7. Trier les employés par Nom, Département, et Grade");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'employé : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prenom de l'employé : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez le nom du département : ");
                    String depName = scanner.nextLine();
                    System.out.print("Entrez l'ID : ");
                    int id = scanner.nextInt();
                    System.out.print("Entrez le grade : ");
                    int garde = scanner.nextInt();

                    Employer employer = new Employer(id, nom,prenom, depName, garde);
                    societe.ajouterEmploye(employer);
                    break;

                case 2:
                    System.out.print("Entrez le nom de l'employé à rechercher : ");
                    String searchNom = scanner.nextLine();
                    if (societe.rechercherEmploye(searchNom)) {
                        System.out.println("L'employé " + searchNom + " existe.");
                    } else {
                        System.out.println("L'employé " + searchNom + " n'existe pas.");
                    }
                    break;

                case 3:
                    System.out.print("Entrez l'ID de l'employé : ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nom de l'employé : ");
                    String searchNomObj = scanner.nextLine();
                    String searchPrenom = scanner.nextLine();
                    System.out.print("Entrez le nom du département : ");
                    System.out.print("Entrez le département : ");
                    String searchDep = scanner.nextLine();
                    System.out.print("Entrez le grade : ");
                    int searchGarde = scanner.nextInt();

                    Employer searchEmployer = new Employer(searchId, searchNomObj, searchPrenom, searchDep, searchGarde);
                    if (societe.rechercherEmploye(searchEmployer)) {
                        System.out.println("L'employé existe.");
                    } else {
                        System.out.println("L'employé n'existe pas.");
                    }
                    break;

                case 4:
                    System.out.print("Entrez l'ID de l'employé à supprimer : ");
                    int delId = scanner.nextInt();
                    scanner.nextLine(); // Consommer le saut de ligne
                    System.out.print("Entrez le nom de l'employé à supprimer : ");
                    String delNom = scanner.nextLine();
                    System.out.print("Entrez le prenom de l'employé à supprimer : ");
                    String delPrenom = scanner.nextLine();
                    System.out.print("Entrez le département : ");
                    String delDep = scanner.nextLine();
                    System.out.print("Entrez le grade : ");
                    int delGarde = scanner.nextInt();

                    Employer delEmployer = new Employer(delId, delNom, delPrenom, delDep, delGarde);
                    societe.supprimerEmploye(delEmployer);
                    break;

                case 5:
                    System.out.println("Liste des employés :");
                    societe.displayEmploye();
                    break;

                case 6:
                    societe.trierEmployeParId();
                    System.out.println("Les employés ont été triés par ID.");
                    break;

                case 7:
                    societe.trierEmployeParNomDépartementEtGrade();
                    System.out.println("Les employés ont été triés par Nom, Département et Grade.");
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
