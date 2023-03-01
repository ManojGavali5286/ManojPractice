package POMClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
    WebElement settingBtn;
    
    @FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
    WebElement logoutBtn;
    
    public void clicksettingBtn()
    {
    	settingBtn.click();
    }
    public void clicklogiutBtn()
    {
    	logoutBtn.click();
    }
    public Pom_HomePage(WebDriver driver)
    {
    this.driver=driver;
    PageFactory.initElements(driver,this);
    
}
}

