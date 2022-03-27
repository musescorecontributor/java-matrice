public class Main {
    public static void main(String[] args) {

    //    Matrice_superieur matrice_allo = new Matrice_superieur(5);
     //   matrice_allo.allouer_matricesuperieur();
      //  matrice_allo.afficher_matrice();

        Matrice matrice = new  Matrice(5);
        //   matrice.afficher_matrice();
          matrice.parcours_superieur();
        //    matrice.parcours_diagonale();
        matrice.parcours_inferieur();


        //création d'un objet matrice supérieur et de 5 colonnes
        System.out.println("affichage de  la matrice supérieur");
        Matrice_superieur matrice_superieur= new Matrice_superieur(4);
        matrice_superieur.allouer_matricesuperieur();
        matrice_superieur.afficher_matrice();

        // création d'un objet matrice inférieur et de 4 ligne
        System.out.println("affichage la matrice inférieur");
        Matrice_inferieur matrice_inferieur =  new Matrice_inferieur(4);
        matrice_inferieur.allouer_matriceinferieur();
        matrice_inferieur.afficher_matrice();



        // Affichage de la somme d'une matrice
      //  System.out.println("affichage de la somme de la matrice ");
      //  System.out.println(matrice_superieur.somme_matrice());

        // affichage du produit de la matrice supérieur et de la matrice inférieur
        System.out.println("affichage du produit de deux matrices");

       // Matrice reçoit_resultat= matrice_superieur.produit_matrice(matrice_superieur, matrice_superieur);
        //reçoit_resultat.afficher_matrice();


        Matrice m1 = new  Matrice(3);

        System.out.println("voici la linéarisation de la matrice");
        matrice_superieur.lineariser();
        System.out.println("voici la délinéarisation de la matrice");
        matrice_superieur.délinéariser();


    }
}
