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
public class Architecte {
    private String conseilRegional ;
    private boolean inscriptionOrdre ;
    private Adresse adresse ;
    private String telephone ;
    
    public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone){
        this.nom = nom ;
        this.prenom = prenom ;
        this.conseilRegional = conseilRegional ;
        this.inscriptionOrdre = inscriptionOrdre ;
        this.adresse = adresse ;
        this.telephone = telephone;
    }
    
    private boolean telephoneValide (String telephone) {
    }
    
    public void Maj_conseilRegional{
    }

    public String  getConseilRegional {
    }

    public void setConseilRegional(String conseilRegional) {
    }

    public boolean isIncriptionOrdre {
    }
    
    public void setInscriptionOrdre(boolean inscriptionOrdre){
    }
    
    public Adresse adresse {
    }
    
    public void setAdresse(Adresse adresse) {
    }
    
    public String getTelephone {
    }
    
    public void setTelephone (String telephone) {
    }
    
    public String toString{
    }
    
    
}