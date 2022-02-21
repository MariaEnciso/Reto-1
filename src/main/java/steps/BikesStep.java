package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.BikesPages;
import utils.Excel;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BikesStep {


    public void escribirMasEnter(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    public void darClick(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public void limpiarTxt(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).clear();
    }


    @Step
    public void bikes(){
        darClick(BikesPages.getBtnBikes());
        try{
            Thread.sleep(6000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        darClick(BikesPages.getBtnSelecBike());
       }


    @Step
    public void accessories(){
        darClick(BikesPages.getBtnBikesAccesso());
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        darClick(BikesPages.getBtnSelecAccesso());
    }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Step
    public void buscar(){
        try {
            leerExcel = Excel.leerXlsx("BikesBusquedas.xlsx", "Hoja1");
        } catch (IOException e){
            e.printStackTrace();
        }
        for(int i = 0; i < leerExcel.size(); i++){
            escribirMasEnter(BikesPages.getTxtBusqSync(),leerExcel.get(i).get("Busquedas"));
            /*limpiarTxt(BikesPages.getTxtBusqSync());*/

        }
    }
    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);

        darClick(BikesPages.getBtnSelecBusqSync());

    }



}
