#Author:  Soraya Azzaoui
Feature: premier  test

  @test
  Scenario: Open a invoice

    Given I openGex
    When I click on My invoices
    And I select the first invoice
    Then I am redirected to the contents of the invoice
