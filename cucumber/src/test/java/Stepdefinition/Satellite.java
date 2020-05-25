package Stepdefinition;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Cylia & Ibrahim @version DU 24 MAI 2020
 */
public class Satellite {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private Planete planeteMere;
    private int distance;

    public Satellite(Planete planeteMere) {
        // initialisation des variables d'instance
        this.planeteMere = planeteMere;
        name = "fX";
        distance = 1000;
        
    }
    public String getNameMere(){
        return this.planeteMere.getName();
    }
    public void setNameMere(String name){
        this.planeteMere.setNamePlanete(name);
    }
    public void setName(String name){ this.name = name;}
    public int dureeVie() {
        /*La durée de vie d'un satellite est
        l'age de la planete fille * la distance */
        return planeteMere.ageFille()*distance ;
    }
    //scenario 1
    /* methode qui renvoie true s'il s'agit bien d'une planete, false sinon*/
    public boolean satOuPlanete(){
        if (this.planeteMere.getName().equals("Soleil")) return true;
        return false;
    }
    //Scenario 2
    /*methode retrouvant le nom de la planete mere d'un satellite naturel*/
    public String orbiteP() {
        if (this.name== "Encelade") {
            planeteMere.setNamePlanete("Saturne");
            return ("Saturne");
        }
        if (this.name== "Phobos") {
            planeteMere.setNamePlanete("Mars");
            return ("Mars");
        }
        if (this.name== "Titania") {
            planeteMere.setNamePlanete("Uranus");
            return ("Uranus");
        }
        if (this.name== "Titan") {
            planeteMere.setNamePlanete("Saturne");
            return ("Saturne");
        }
        if (this.name== "Triton") {
            planeteMere.setNamePlanete("Neptune");
            return ("Neptune");
        }
        if (this.name== "Charon") {
            planeteMere.setNamePlanete("Pluton");
            return ("Pluton");
        }
        if (this.name== "Io") {
            planeteMere.setNamePlanete("Jupiter");
            return ("Jupiter");
        }
        if (this.name== "Miranda") {
            planeteMere.setNamePlanete("Uranus");
            return ("Uranus");
        }
        if (this.name== "Mimas") {
            planeteMere.setNamePlanete("Saturne");
            return ("Saturne");
        }
        else return ("\n Ce satellite n'appartient pas au Sys.solaire \n");
    }
    //Scenario 3
    // methodes qui distigue les sattelite appartenant au Sys.solaire
    public boolean containInSysSolaire(String astreExterne){
        List<String> planetes = new ArrayList<>(
                List.of("Mercure" ,"Vénus" ,"Terre","Mars","Jupiter","Saturne","Uranus","Neptune"));
        return planetes.contains(astreExterne);

    }
}
