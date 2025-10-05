package com.nttdata.glue;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamenStepDef {


    @Given("estoy en la pagina {string}")
    public void estoyEnLaPagina(String arg0) {
        }

    @When("creo la orden con petId {int}, quantity {int}, shipdate {string} y status {string}")
    public void creoLaOrdenConPetIdQuantityShipdateYStatus(int arg0, int arg1, String arg2, String arg3) {
       }

    @Then("valido que el código de respuesta sea {int}")
    public void validoQueElCódigoDeRespuestaSea(int arg0) {

       }
}