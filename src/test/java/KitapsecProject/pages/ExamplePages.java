package KitapsecProject.pages;


import KitapsecProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamplePages {
    public ExamplePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
