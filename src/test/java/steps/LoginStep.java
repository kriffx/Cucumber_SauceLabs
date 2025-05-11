package steps;

import com.aventstack.extentreports.Status;
import framework.webDrivers.DriverManager;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import taks.LoginTask;
import validations.LoginValidation;
import validations.ProductsValidation;

import static framework.tools.Report.extentTest;

public class LoginStep {
    private final WebDriver driver = DriverManager.getDriver();
    private final LoginTask loginTask = new LoginTask(driver);
    private final LoginValidation loginValidation = new LoginValidation(driver);
    private final ProductsValidation productsValidation = new ProductsValidation(driver);

    @Dado("que acesso o sistema Sauce Labs")
    public void queAcessoSistemaSauceLabs() {
        extentTest.log(Status.INFO, "Estou em Sauce Labs");
    }

    @Quando("realizo acessom com usuário {string} e senha {string}")
    public void realizoAcessoComUsuarioSenha(String usuario, String senha) {
        loginTask.login(usuario, senha);
    }

    @Entao("valido o sucesso do acesso")
    public void validoSucessoDoAcesso() throws IllegalAccessException {
        productsValidation.validarPaginaProdutos();
    }

    @Entao("valido a mensagem de erro nome de usuário é obrigatório")
    public void validoMensagemDeErroNomeDeUsuarioObrigatorio() throws IllegalAccessException {
        loginValidation.validarMensagemErroDeLogin("Epic sadface: Username is required");
    }

    @Entao("valido a mensagem de erro senha é obrigatório")
    public void validoMensagemDeErroSenhaObrigatorio() throws IllegalAccessException {
        loginValidation.validarMensagemErroDeLogin("Epic sadface: Password is required");
    }

    @Entao("valido a mensagem de erro dados não correspondem a nenhum usuário")
    public void validoMensagemDeErroDadosNaoCorrespodemNenhumUsuario() throws IllegalAccessException {
        loginValidation.validarMensagemErroDeLogin("Epic sadface: Username and password do not match any user in this service");
    }

    @Entao("valido a mensagem de erro usuário bloqueado")
    public void validoMensagemDeErroUsuarioBloqueado() throws IllegalAccessException {
        loginValidation.validarMensagemErroDeLogin("Epic sadface: Sorry, this user has been locked out.");
    }
}