
// methode qui permet de récupère l'interface de la classe mère Matrice dans la classe Matrice_superieur
public class Matrice_superieur extends Matrice {

// methode qui permet d'initialise le tableau de la super classe mère

     public Matrice_superieur(int entier_superieur){
         super(entier_superieur);
    }

 // methode qui permet d'allouer une ligne à hauteur du nombre qui lui aura était passer en paramètre
 void allouer_matricesuperieur() {
     System.out.println("-------------- Allocation de la matrice supérieur --------------");
     int i, j;
     int nbr = 1;
     for (i = 0; i < this.matrice.length; i++) {
         this.matrice[i] = new int[this.matrice.length];
         for (j = i + 1; j < this.matrice[i].length; j++) {
             this.matrice[i][j] = nbr;
             nbr++;
         }
     }
 }

}
