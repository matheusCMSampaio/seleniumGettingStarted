package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Setup {

    public static WebDriver driver;

    public static WebDriver createDriverInstance(){ //inicializa o drive
        ChromeOptions options = new ChromeOptions(); //instancia as opcoes do chrome
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //carrega a pagina toda, css, imagens, etc
        driver = new ChromeDriver(options); // cria o driver utilizando as opcoes
        driver.manage().window().maximize(); // faz com que o drive seja maximizado
        return driver;
    }

    public static void quitDriver () {
        driver.quit(); // fecha driver, evita que fique aberto o navegador consumindo recursos
    }








}
