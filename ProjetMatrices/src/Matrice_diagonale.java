public class Matrice_diagonale extends Matrice{

    // methode qui alloue et initialise la diagonale d'une matrice
    public Matrice_diagonale (int  taille){
        super(taille);
        int X = 1;

        for(int i=0 ; i< matrice.length;i++){
                matrice[i][i] = X;
                X++;
        }
    }
}

