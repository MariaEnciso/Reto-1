package pageObjects;

import org.openqa.selenium.By;

public class BikesPages {
    private static By btnBikes = By.xpath("//a[@href='https://www.bikesonline.com/bikes/' and @class='dropdown-toggle']");
    private static By btnSelecBike = By.xpath("//img [@src= 'https://www.bikesonline.com/assets/thumbL/SISKIU_D5_2022.jpg?20210713225156&tr=w-316,h-226']");
    private static By btnBikesAccesso = By.xpath("//a[@href='https://www.bikesonline.com/bicycle-accessories/' and @class='dropdown-toggle']");
    private static By btnSelecAccesso = By.xpath("//img [@src= 'https://www.bikesonline.com/assets/thumbL/S0910ET0101.jpg?20210317030641&tr=w-257,h-257']");
    private static By txtBusqSync = By.xpath("//input[@class='form-control ajax_search findify-autocomplete-search-selector' and @nsearch-id= '0']");
    private static By btnSelecBusqSync = By.xpath("//img [@src= 'https://www.bikesonline.com/assets/thumbL/4904048.jpg?20210317031343&tr=w-258,h-258']");
    private static By lblBikes = By.xpath("//span[contains(text(),'Bikes')]");

    public static By getBtnBikes() {
        return btnBikes;
    }

    public static By getBtnSelecBike() {
        return btnSelecBike;
    }

    public static By getBtnBikesAccesso() {
        return btnBikesAccesso;
    }


    public static By getBtnSelecAccesso() {
        return btnSelecAccesso;
    }

    public static By getBtnSelecBusqSync() {
        return btnSelecBusqSync;
    }

    public static By getLblBikes() {
        return lblBikes;
    }

    public static By getTxtBusqSync() {
        return txtBusqSync;
    }
}

