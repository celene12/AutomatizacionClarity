package com.quipux.AutomatizacionClarity.stepdefinitions;

import com.quipux.AutomatizacionClarity.tasks.IngresarEstadoCanjes;
import com.quipux.AutomatizacionClarity.tasks.RealizarInicioDeSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.quipux.AutomatizacionClarity.usertinterface.EstadoCanjePage.DIV_MENSAJE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PuntosClarityStepdefinitions {

    @Dado("que me encuentro en la paguina de clarity inicio sesion {}, {}")
    public void queMeEncuentroEnLaPaguinaDeClarityInicioSesion(String email, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                RealizarInicioDeSesion.enClarity(email, contrasena)
        );
    }

    @Cuando("voy a estado de canjes para validar mis puntos")
    public void  voyAEstadoDeCanjesParaValidarMisPuntos() {
        theActorInTheSpotlight().attemptsTo(
                IngresarEstadoCanjes.enLaPaginaDeClarity()
        );

    }


    @Entonces("veo el mensaje de '{}'")
    public void veoElMensajeDeMonedasAcumuladas(String mensajeEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(mensajeEsperado).isEqualTo(DIV_MENSAJE.resolveFor(theActorInTheSpotlight()).getText())
        );
    }
}
