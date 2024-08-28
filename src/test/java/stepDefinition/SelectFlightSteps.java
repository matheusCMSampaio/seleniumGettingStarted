package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.SelectFlightPage;

public class SelectFlightSteps extends BasePage {

    LoginSteps login = new LoginSteps();
    SelectFlightPage selectFlight = new SelectFlightPage();

    @Dado("que estou logado")
    public void que_estou_logado() {
        login.que_estou_na_tela_de_login();
        login.entro_com_credenciais_validas();
        login.vejo_a_tela_select_flight();

    }
    @Quando("clico no botao sign off")
    public void clico_no_botao_sign_off() {
        click(selectFlight.btnSignOff);
    }
    @Entao("vejo a mensagem de Signed out")
    public void vejo_a_mensagem_de_signed_out() {
        login.vejo_a_mensagem_de_erro();
    }
}
