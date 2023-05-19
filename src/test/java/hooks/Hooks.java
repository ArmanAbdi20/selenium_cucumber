package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("before method çalıştı");
    }

    @After
    public void tearDown(){

        System.out.println("after method çalıştı");

        // driver kapatılır
        // fail olan testlerde screen shot alma

    }
}
