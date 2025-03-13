package com.quipux.AutomatizacionClarity.usertinterface;

import net.serenitybdd.screenplay.targets.Target;

public class EstadoCanjePage {

    public static final Target DIV_MENSAJE = Target.the("Mensajes de validacion de los puntos acumulados gastados")
            .locatedBy("//div[@class='store-cart-header-points__text']");
}
