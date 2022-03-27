import static java.lang.Math.sqrt;
// classe matrice qui initialise en globale une matrice , et un tableau
public class Matrice {

    int[][] matrice;
    int taille_tableau;


    private int nb_colonne;
    private int nb_ligne;
    private int t[];
    private int in;
    public Matrice(int a) {
        matrice = new int[a][a];
        taille_tableau = matrice.length * matrice.length;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = in;
                in++;
            }
        }
    }
            //affiche le parcours sup

    void parcours_superieur(){
        System.out.println("affichage de la matrice superieur");
        for(int i = 0; i< matrice.length ; i++ ){
            for(int j = 0 ;j< matrice[i].length; j++){
                if(i < j ){
                    System.out.print(matrice[i][j] + "\t");
                }else{
                    System.out.print("*" + "\t");
                }
            }
            System.out.println();
        }

    }
    //affichage de la diagonale
    void parcours_diagonale() {
        System.out.println("affichage de la matrice diagonale");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    System.out.print(matrice[i][i] + "\t");
                }else{
                    System.out.print("*"+ "\t");
                }
            }
            System.out.println();
        }
    }

            //affiche la partie inferieur
    void parcours_inferieur(){
        System.out.println("affichage de la matrice inferieur");
        for(int i = 0; i< matrice.length ; i++ ){
            for(int j = 0 ;j< matrice[i].length; j++){
                if(i > j ){
                    System.out.print(matrice[i][j] + "\t");
                }else{
                    System.out.print("*" + "\t");
                }
            }
            System.out.println();
        }
    }




    // methode qui permet d'afficher le contentu de la matrice.
    void afficher_matrice() {

        int i, j;
        for (i = 0; i < this.matrice.length; i++) {
            for (j = 0; j < this.matrice[i].length; j++) {
                System.out.print(this.matrice[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // methode qui effectue la somme de matrice
    public int somme_matrice() {

        int resultat = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                resultat = resultat + matrice[i][j];
            }
        }
        return resultat;
    }
  /*  public Matrice produit_matrice(Matrice m1, Matrice m2){

    }*/
    /*// methode qui effectue le produit de matrice
    public Matrice produit_matrice(Matrice m1, Matrice m2) {

        int X = m1.getmatrice().length;
        Matrice matrice_produit = new Matrice(X);
        int[][] matrice_resultat = new int[X][X];

        for (int i = 0; i < matrice_resultat.length; i++) {
            for (int j = 0; j < matrice_resultat.length; j++) {
                matrice_resultat[i][j] = m1.getmatrice()[i][j] * m2.getmatrice()[i][j];
            }

        }

        matrice_produit.setmatrice(matrice_resultat);

        return matrice_produit;
    }
*/
    // on retourne un talbeau matrice contenu dans un objet
    public int[][] getmatrice() {
        return matrice;
    }

    // on récupère l'instance courante de la matrice qu'on modifie dans le main
    public void setmatrice(int[][] matrice) {
        this.matrice = matrice;
    }

    // méthode qui permet le pasasge d'une matrice à deux dimensions à une dimension donc un tableau
    void lineariser() {
        int i, j;
        int indice_colonne = 0;
        int taille_tableau = matrice.length * matrice.length; // taille de la matrice
        t = new int[taille_tableau];
        for (i = 0; i < matrice.length; i++) {
            for (j = 0; j < matrice.length; j++) {
                t[indice_colonne] = matrice[i][j];
                indice_colonne++;
            }
        }
        for (i = 0; i < indice_colonne; i++) {
            System.out.print("\t" + t[i] );

        }
        System.out.println();
    }

    // passage d'un tableau à une matrice à deux dimensions
    void délinéariser() {
        int X = matrice.length;

        int nombre_colonne = (int) sqrt(taille_tableau);


        int nombre_ligne = nombre_colonne;
        int matrice[][] = new int[nombre_ligne][nombre_colonne];


        int i, j = 0, k = 0;
        for (i = 0; i < nombre_colonne; i++) {
            matrice[j][k] = t[i];
            j++;
            k++;

        }

        for (i = 0; i < nombre_ligne; i++) {
            for (j = 0; j < nombre_colonne; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
 
}