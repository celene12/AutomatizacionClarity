package com.quipux.AutomatizacionClarity.usertinterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionClarityPage {
    public static final Target INPUT_EMAIL= Target.the("Input para iniciar sesion")
            .locatedBy("//input[@class='email accounts-content-form__input form-control ']");

    public static final Target INPUT_CONTRASENA = Target.the("Input para la contraseña")
            .locatedBy("//input[@class='accounts-content-form__input form-control ']");

    public static final Target BUTTON_INGRESAR = Target.the("Boton ingresar al Clarity")
            .locatedBy("//button[@id='submit_button']");


}
