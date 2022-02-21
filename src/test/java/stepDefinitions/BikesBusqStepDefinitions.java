package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.BikesPages;
import steps.BikesStep;

import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BikesBusqStepDefinitions {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Steps
    BikesStep step = new BikesStep();

    @Given("^que me encuentro en la pagina bikes$")
    public void queMeEncuentroEnLaPaginaBikes() {
        SeleniumWebDriver.chromeDrive("https://www.bikesonline.com/");
    }

    @When("^llamo datos de mi archivo xlsx$")
    public void llamoDatosDeMiArchivoXlsx() {
        step.bikes();
        step.accessories();
        step.buscar();
    }

    @Then("^hace la busqueda y me muestra resultados$")
    public void haceLaBusquedaYMeMuestraResultados() {
        try {
            leerExcel = Excel.leerXlsx("BikesBusquedas.xlsx", "Hoja1");
        } catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i<leerExcel.size(); i++){
            step.validar(BikesPages.getLblBikes(),leerExcel.get(i).get("Validar"));
        }
    }

}
