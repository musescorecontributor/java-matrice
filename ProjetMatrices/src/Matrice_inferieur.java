public class Matrice_inferieur extends Matrice{

    // methode qui permet de définir un nombre de ligne depuis l'appel à la classe Matrice
    Matrice_inferieur(int ligne){
        super(ligne);
    }
// methode qui permet de créer un nombre de colonne croissant pour chaque ligne passer paramètre
    void allouer_matriceinferieur(){
        System.out.println("---------------- Allocation matrice inférieure ----------------");
        int i, j;
        int nbr=0;
        for(i=0; i< matrice.length; i++){
            matrice[i] = new int [i+1];
            for(j=0; j< matrice[i].length; j++){
                matrice[i][j] = nbr;
                nbr++;
            }
        }
    }

}
