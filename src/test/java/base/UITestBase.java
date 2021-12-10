package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.Homepage;
import utility.DriverUtil;
import utility.TestListener;

public class UITestBase {

    // create variable for loginPage
    private Homepage home;


    /* Before Method implemented from TestNG to call browser to open
    before all methods
    */
    @BeforeMethod
    public void setUp(){
        DriverUtil.open();
    }

    /* After method implemented from TestNG to call browser to close
    after all methods
     */

    @AfterMethod
    public void cleanUp(){
        DriverUtil.close();
    }

    /*
    The protected access modifier is accessible within the package. However, it can also
     accessible outside the package but through inheritance only.
     We can't assign protected to outer class and interface.
     */
    protected Homepage home(){
        if (home == null){
            home = new Homepage();
            return home;
        }
        return home;
    }

    public void log(String message){
        TestListener.step().info(message);
    }









}
