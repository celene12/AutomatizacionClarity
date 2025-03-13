package com.quipux.AutomatizacionClarity.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/puntos_clarity.feature",
        glue = {"com.quipux.AutomatizacionClarity.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"pretty"}

)

public class PuntosClarityTest {
}
