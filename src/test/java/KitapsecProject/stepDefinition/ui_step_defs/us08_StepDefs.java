package KitapsecProject.stepDefinition.ui_step_defs;


import KitapsecProject.utilities.ConfigReader;
import KitapsecProject.utilities.Driver;
import io.cucumber.java.en.Given;

public class us08_StepDefs {


    @Given("Kullanici web sitesine girer US08")
    public void kullaniciWebSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("kitapsec_Url"));
    }





}
