package stepDefinition;

import io.cucumber.java.pt.Dado;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.LoginPage;
import pages.SelectFlightPage;

public class LoginSteps extends BasePage {

    LoginPage login = new LoginPage();
    SelectFlightPage selectFlight = new SelectFlightPage();


    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {

        login.isOnLoginPage();
    }

    @Quando("entro com credenciais validas")
    public void entro_com_credenciais_validas() {

        fillInput(login.etUserName, login.name);
        login.fillUserPassword();
        login.clickBtnSigIn();
    }

    @Quando("entro com username invalidas")
    public void entro_com_username_invalidas() {
        // Write code here that turns the phrase above into concrete actions
        fillInput(login.etUserName, "Matheus");
        login.clickBtnSigIn();
    }
    @Entao("vejo a mensagem de erro")
    public void vejo_a_mensagem_de_erro() {
        System.out.println(login.tvLoginError);
        isVisible(login.tvLoginError);
    }

    @Quando("entro com password invalidas")
    public void entro_com_password_invalidas() {
        // Write code here that turns the phrase above into concrete actions
        fillInput(login.etUserPassword, "senha");
        login.clickBtnSigIn();
    }

    @Entao("vejo a tela Select Flight")
    public void vejo_a_tela_select_flight() {
        isVisible(selectFlight.tvUserName);

    }

}
