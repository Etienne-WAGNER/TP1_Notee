/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_notee;

/**
 *
 * @author arcst
 */
public class Adresse{
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    
   public Adresse (){
   
  }
   public Adresse (String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex){
       this.numero = validate(numero, 4);
       this.voie = validate(voie, 50);
       this.ville = validate(ville, 75);
       this.codePostal = validate(codePostal, 5);
       this.bp = validate(bp, 40);
       this.lieuDit = validate(lieuDit, 40);
       this.cedex = validate(cedex, 80);
   }
   private String validate (String chaine, Integer taille){
       return chaine;
   }
}