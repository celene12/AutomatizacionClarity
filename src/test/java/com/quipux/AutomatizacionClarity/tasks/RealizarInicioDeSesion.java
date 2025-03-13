package com.quipux.AutomatizacionClarity.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.quipux.AutomatizacionClarity.usertinterface.InicioSesionClarityPage.*;


public class RealizarInicioDeSesion {
    public static Performable enClarity(String email, String contrasena) {
        return Task.where("{0} ingresa las credenciales para el inicio de sesion",
                actor -> {
                    actor.attemptsTo(
                            Click.on(INPUT_EMAIL),
                            SendKeys.of(email).into(INPUT_EMAIL),
                            Click.on(INPUT_CONTRASENA),
                            SendKeys.of(contrasena).into(INPUT_CONTRASENA),
                            Click.on(BUTTON_INGRESAR)
                    );
                }

        );
    }
}
