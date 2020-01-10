#Author : Team CT_APP
Feature: Log in CT As a user I want to log in CT APP

  @Login
  Scenario: Login to the CT application
    When I login with username USUERIO and password CONTRASENA
    Then you should see the home page
