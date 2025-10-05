package com.nttdata.glue;

import com.nttdata.steps.CrearOrdenExStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExamenStepDef {
@Steps
    CrearOrdenExStep crearOrdenExStep;

    @Given("estoy en la pagina {string}")
    public void estoyEnLaPagina(String arg0) {
        }

    @When("creo la orden con petId {int}, quantity {int}, shipdate {string} y status {string}")
    public void creoLaOrdenConPetIdQuantityShipdateYStatus(int petId, int quantity, String shipdate, String status) {

        crearOrdenExStep.crearOrden( petId, quantity, shipdate,status);

       }

    @Then("valido que el código de respuesta sea {int}")
    public void validoQueElCódigoDeRespuestaSea(int statusCode) {
        crearOrdenExStep.validarCodigoRespuesta(statusCode);

       }
}