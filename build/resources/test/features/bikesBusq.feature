#language: en
  Feature: Busqueda exitosa con datos extraidos de un xlsx

    Scenario: Buscar en la pagina bikes

      Given que me encuentro en la pagina bikes
      When llamo datos de mi archivo xlsx
      Then hace la busqueda y me muestra resultados