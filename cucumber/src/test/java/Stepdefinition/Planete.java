package Stepdefinition;
import org.junit.validator.PublicClassValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author CYLIA & IBRAHIM @version DU 24 MAI 2020
 */
public class Planete {
    /* La planete est définie par son nom et son age (en million d'année)*/
    private String name;
    private int age;

    public Planete() {/* initialisation des variables d'instance zéro */
        name = "PlaneteX";
        age = 0;
    }
    public Planete(String name, int age) {
        /* initialisation des variables d'instance par des valeurs données*/
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setNamePlanete(String name) {

        this.name = name;
    }
    public String getAll() {

        return this.name + Integer.toString(this.age);
    }
    public void setPlanete(String name, int age){
        /*Definit les champs d'une planete */
        this.name= name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Planete))return false;
        Planete nv = (Planete) obj;
        if (!name.equals(nv.name)) return false;
        if (age != nv.age) return false;
        return true;
    }
    public int ageFille()
    {/* age de la planete fille*/
        return this.age/2 ;
    }
    //Scenario 1
    public void finDeVie(){
        this.age= (int) (Math.random() * 99999 + 999 );
    }
    public void toBeSupernova(){
        this.name = "Supernova";
    }
    //scenario 2
    public boolean fillante(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof Planete))return false;
        Planete nv = (Planete) obj;
        List<String> planetes = new ArrayList<>(
                List.of("Mercure" ,"Vénus" ,"Terre","Mars","Jupiter","Saturne","Uranus","Neptune"));
        if (!planetes.contains(nv.getName()) && getAge() ==0) return true;
        return false;
    }
    //Scenario Class division
    public Satellite divisionSat(){
    Satellite sat = new Satellite(this);
    return sat;
    }
}
