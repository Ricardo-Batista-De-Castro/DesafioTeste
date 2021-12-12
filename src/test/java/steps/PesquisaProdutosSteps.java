package steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PesquisaProdutosSteps {


    WebDriver drive;

    @Before
    public void inicio(){

        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
        drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Dado("que o usuario está na tela de pesquisa do Amazon")
    public void que_o_usuario_esta_na_tela_de_pesquisa_do_Amazon() {

        drive.get("https://www.amazon.com.br/ref=nav_logo");

    }

    @Quando("pesquisa por {string}")
    public void pesquisa_por(String produto) {

        drive.findElement(By.id("twotabsearchtextbox")).sendKeys(produto);
        drive.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

    }

    @Então("o titulo da pagina deve ser {string}")
    public void o_titulo_da_pagina_deve_ser(String tituloObtido) {

        Assert.assertEquals(tituloObtido, drive.getTitle());
        drive.quit();
    }
}
