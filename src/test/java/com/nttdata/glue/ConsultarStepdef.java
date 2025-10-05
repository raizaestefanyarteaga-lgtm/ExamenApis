package com.nttdata.glue;

import com.nttdata.steps.ConsultarOrdenExStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultarStepdef {

    @Steps
    ConsultarOrdenExStep consultarOrdenExStep;

    @Given("en la pagina {string}")
    public void enLaPagina(String arg0) {

    }

    @When("consulto la orden con orderId {int}")
    public void consultoLaOrdenConOrderId(int orderId) {
        consultarOrdenExStep.consultarOrden(orderId);
    }

    @Then("valido que tenga código de respuesta sea {int}")
    public void validoQueTengaCódigoDeRespuestaSea(int arg0) {

    }
}
