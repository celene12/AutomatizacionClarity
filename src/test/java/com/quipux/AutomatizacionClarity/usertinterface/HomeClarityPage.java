package com.quipux.AutomatizacionClarity.usertinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeClarityPage {
    public static final Target DIV_TIENDA_CANJE = Target.the("Div para desplegar las opciones")
            .locatedBy("//div[@class='category-title__label'][contains(text(), 'Tienda de Canje')]");

    public static final Target A_ESTADO_CANJES = Target.the("Enlase para ingresar al estado de canje")
            .locatedBy("//li[@class='subcategory']/a[contains(text(), 'Estado de Canjes')]");
}
