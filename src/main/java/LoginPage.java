import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonFunctions{


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By login_butonu=By.xpath("//a[normalize-space()='LOG IN']");
    By usr_name=By.xpath("//input[@id='input-usr']");
    By loginPagePasswordBox=By.xpath("//input[@id='input-pwd']");

    By loginPageLogİnButton=By.xpath("//span[contains(text(),'Oturum aç')]");



    public void  loginFunc(){
        clickOnElement(login_butonu);
        typeOnElement(usr_name,"");
        typeOnElement(loginPagePasswordBox,"");
        clickOnElement(loginPageLogİnButton);
    }

}
