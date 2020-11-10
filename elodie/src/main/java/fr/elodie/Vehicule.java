package fr.elodie;

public class Vehicule {
    String marque;
    String couleur;
    int nivCarburant;
    int carburantMax;
    boolean isLouee;
    Client locataire;
    boolean isontheReserve;

public void remplir(){
    if(this.nivCarburant == this.carburantMax){
        System.out.println("En reserve");
        } else {
            this.nivCarburant
        }
    this.nivCarburant=this.carburantMax;System.out.println("Le plein a été fait");
    }

    public Vehicule(String marque, String couleur, int nivCarburant) {
        this.marque = marque;
        this.couleur = couleur;
        this.nivCarburant = nivCarburant;
        this.isLouee = false;
        this.carburantMax = 100;

    }

}
