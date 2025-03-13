package com.quipux.AutomatizacionClarity.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.quipux.AutomatizacionClarity.usertinterface.HomeClarityPage.A_ESTADO_CANJES;
import static com.quipux.AutomatizacionClarity.usertinterface.HomeClarityPage.DIV_TIENDA_CANJE;

public class IngresarEstadoCanjes {
    public static Performable enLaPaginaDeClarity() {
        return Task.where("{0} ingresa las credenciales para el inicio de sesion",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DIV_TIENDA_CANJE),
                            Click.on(A_ESTADO_CANJES)
                    );
                }

        );
    }
}
