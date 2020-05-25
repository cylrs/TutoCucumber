package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.security.cert.TrustAnchor;

import static org.junit.Assert.assertEquals;

public class PlaneteTest {
    Planete nvP = new Planete();
    Planete meteorite = new Planete();
    boolean isFillante=false;

    //Scenario 1 ******************************************************************************
    @Given("lorsque un astre de type étoile a une durée de vie assez grande par rapport a sa taille")
    public void lorsque_un_astre_de_type_étoile_a_une_durée_de_vie_assez_grande_par_rapport_a_sa_taille() {
        // Write code here that turns the phrase above into concrete actions
        nvP.finDeVie();
    }

    @When("l'astre <etoile> atteint son age maximum  et se raproche de sa fin de vie et sa taille est assez grande")
    public void l_astre_etoile_atteint_son_age_maximum_et_se_raproche_de_sa_fin_de_vie_et_sa_taille_est_assez_grande() {
        // Write code here that turns the phrase above into concrete actions
        nvP.toBeSupernova();
    }

    @Then("l'astre <etoile> explose et devient supernova et peut meme creer des trous noirs")
    public void l_astre_etoile_explose_et_devient_supernova_et_peut_meme_creer_des_trous_noirs() {
        // Write code here that turns the phrase above into concrete actions
        String x = Integer.toString(nvP.getAge());
        assertEquals("Supernova"+x,nvP.getAll());
    }
    //Scenario 2 **********************************************************************************
    @Given("lorsque un astre de type meteore est en mouvement en direction la planete terre")
    public void lorsque_un_astre_de_type_meteore_est_en_mouvement_en_direction_la_planete_terre() {
        // Write code here that turns the phrase above into concrete actions
        meteorite.setPlanete("Hoba",0);
    }

    @When("un meteore entre en conatact avec notre athmosphere et s'enflamme")
    public void un_meteore_entre_en_conatact_avec_notre_athmosphere_et_s_enflamme() {
        // Write code here that turns the phrase above into concrete actions
        isFillante=nvP.fillante(meteorite);
    }

    @Then("le météore devient visible")
    public void le_météore_devient_visible() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(true,isFillante);
    }
}
