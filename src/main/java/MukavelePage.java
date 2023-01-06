import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MukavelePage extends CommonFunctions{
    public MukavelePage(WebDriver driver) {
        super(driver);
    }


    By mukaveleMatter= By.xpath("(//img[@src='./assets/images/clientlogos/mukavele.svg'])[1]");
    By projeSecimi=By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3)");
    By devtest=By.xpath("(//div[normalize-space()='DevTest0001'])[1]");

    public void loginSonrası(){
        clickOnElement(mukaveleMatter);
        clickOnElement(projeSecimi);
        clickOnElement(devtest);
    }


}
