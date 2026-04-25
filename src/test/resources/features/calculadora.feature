Feature: Operaciones de calculadora

  Scenario: Sumar dos numeros
    Given que tengo los numeros 5 y 3
    When realizo la suma
    Then el resultado debe ser 8

  Scenario: Restar dos numeros
    Given que tengo los numeros 10 y 4
    When realizo la resta
    Then el resultado debe ser 6