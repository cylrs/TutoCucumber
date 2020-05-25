package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SatelliteTest {
    Satellite sat1 = new Satellite(new Planete());
    Satellite sat2 = new Satellite(new Planete());
    boolean isPlanete = false;
    boolean isSatellite = false;
    boolean horsSolaire = false;
    String nomOrbite;

    //Scenario 1
    @Given("apparition d'un nouvel astre1  dans le Sys.Solaire qui orbite autour d'un autre astre2")
    public void apparitionNouvelAstre() {
        sat1.setNameMere("Soleil");
    }


    @When("Le nom de astre2 coorespond à {string}")
    public void astreRetrouve(String string) {
        // Write code here that turns the phrase above into concrete actions
        isPlanete= sat1.satOuPlanete();
        isSatellite =sat2.satOuPlanete();
    }

    @Then("L'astre astre1 est effectivement une planete parmi les autres planetes du Sys.Solaire")
    public void disntinguerPlanete (){
        // Write code here that turns the phrase above into concrete actions
        assertEquals(true,isPlanete);
        assertEquals(false,isSatellite);
    }
    //Scenario 2
    @Given("un satellite naturel du Sys.solaire est donné par son nom")
    public void satelliteNaturel() {
        // Write code here that turns the phrase above into concrete actions
        sat1.setName("Encelade");
    }

    @When("on utilise la méthode qui permet de recuperer la planete mere d'un satellite naturel")
    public void recupererPlanetemere() {
        // Write code here that turns the phrase above into concrete actions
        nomOrbite=sat1.orbiteP();
    }

    @Then("on obtient le nom de la planete mere")
    public void on_obtient_le_nom_de_la_planete_mere() {
        assertEquals("Saturne",nomOrbite);
        assertEquals("Saturne",sat1.getNameMere());

    }

    //Scenario 3
    @Given("Découvert ou reception d'un nom de planete non contenu du Sys.Solaire")
    public void découvert_ou_reception_d_un_nom_de_planete_non_contenu_du_Sys_Solaire() {
        // Write code here that turns the phrase above into concrete actions
        sat2.setNameMere("Exoplanete");
    }

    @When("une méthode verifie si le nom est un nom d'une planete ou peut etre parmis les satellte naturels renvoie 'faux'")
    public void une_méthode_verifie_si_le_nom_est_un_nom_d_une_planete_ou_peut_etre_parmis_les_satellte_naturels_renvoie_faux() {
        // Write code here that turns the phrase above into concrete actions
        horsSolaire = sat2.containInSysSolaire(sat2.getNameMere());
    }

    @Then("Le systeme confirme que <astreExterne> et affiche que cet astre n'appartient pas au sys.Solaire")
    public void astreExterne() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(false,horsSolaire);
    }


}
