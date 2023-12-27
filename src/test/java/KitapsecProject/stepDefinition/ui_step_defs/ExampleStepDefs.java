package KitapsecProject.stepDefinition.ui_step_defs;


import KitapsecProject.utilities.ConfigReader;
import KitapsecProject.utilities.Driver;
import io.cucumber.java.en.Given;

public class ExampleStepDefs {


    @Given("Kullanici web sitesine girer")
    public void kullaniciWebSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("kitapsec_Url"));
    }





}
