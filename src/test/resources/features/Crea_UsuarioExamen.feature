Feature: Crear y consultar orden en PetStore

  @Examen
  Scenario: Crear la orden correctamente
    Given estoy en la pagina "https://petstore.swagger.io/store/order"
    When creo la orden con petId 2, quantity 10, shipdate "2025-10-05T05:42:58.745Z" y status "placed"
    Then valido que el código de respuesta sea 200

  @Examen
  Scenario: Consultar la orden correctamente
    Given en la pagina "https://petstore.swagger.io/store/order/orderId"
    When consulto la orden con orderId 9
    Then valido que tenga código de respuesta sea 200

