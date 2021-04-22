package fr.univtln.hgitinit;

public class Calcul {
    private  double longueur ;
    private double largeur  ;


    public   double surface(double longueur , double  largeur){

        return  largeur*longueur ;

    }
    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}
