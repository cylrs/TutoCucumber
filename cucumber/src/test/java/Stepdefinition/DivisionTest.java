package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class DivisionTest {
    Planete nvP = new Planete("planetetest",100);
    Satellite nvS = new Satellite(new Planete());
    int age = 100;

    @Given("Quand l'age d'une planete atteint {int} million d'année de vie")
    public void quand_l_age_d_une_planete_atteint_million_d_année_de_vie(int age){
    // Write code here that turns the phrase above into concrete actions
        if (nvP.getAge() == age) nvS = nvP.divisionSat();

    }

    @Then("formation d'un sattelite et changement de la planete mere")
    public void formation_d_un_sattelite_et_changement_de_la_planete_mere() {
        // Write code here that turns the phrase above into concrete actions
        String name = nvP.getName();
        assertEquals(name,nvS.getNameMere());
    }
}
