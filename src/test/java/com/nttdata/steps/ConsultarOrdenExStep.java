package com.nttdata.steps;

import com.nttdata.model.Orden;
import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConsultarOrdenExStep {
    private String URL_BASE = "https://petstore.swagger.io/v2/";
    public Orden orden;

    public void consultarOrden(int orderId){
        Response response = given()
                .baseUri(URL_BASE)
                .log()
                .all()
                .when()
                .get("store/order/" + orderId);
        if (response.statusCode() == 200){
            orden = response.as(Orden.class);
            listarOrden(orden);
        } else if (response.statusCode() == 404) {
            String message = response.toString();
            System.out.println(message);
        }
    }

    public void listarOrden(Orden orden){
        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println("Id Orden: " + orden.getId());
        System.out.println("PetId: " + orden.getId());
        System.out.println("Cantidad: " + orden.getQuantity());
        System.out.println("Fecha: " + orden.getShipDate());
        System.out.println("Estado: " + orden.getStatus());
        System.out.println("Completado: " + orden.isComplete());
        System.out.println("@@@@@@@@@@@@@@@");
    }

    public void validarCodigoRespuesta(int statusCode) {

        assertThat(lastResponse().statusCode(),is(statusCode));
    }
}