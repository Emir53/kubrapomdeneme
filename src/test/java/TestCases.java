import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestCases extends BaseTest{

    CommonFunctions commonFunctions;
    LoginPage loginPage;
    MukavelePage mukavelePage;


    @BeforeEach
    public void background(){
        loginPage = new LoginPage(driver);
        mukavelePage=new MukavelePage(driver);
    }



    @Test
    public void case001(){
        loginPage.loginFunc();
        mukavelePage.loginSonrası();
    }



}
