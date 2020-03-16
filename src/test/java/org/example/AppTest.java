package org.example;
import static org.junit.Assert.assertTrue;
import org.junit.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private App calculations;

    @Before
    public void setUp() throws Exception{
        calculations = new App();
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void volumeEquality(){
        int result = calculations.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void volumeIdentity(){
        int result = calculations.volume(1, 1, 1);
        Assert.assertSame(1, result);
    }

    @Test
    public void volumeFail(){
        Assert.fail("Fail Test");
    }

    @Test (timeout = 200)

    public void volumeTimeout(){
        int result = calculations.volume(1, 1, 1);
        Assert.assertSame(1, result);
    }

    @Ignore
    @Test

    public void volumeDisable(){
        int result = calculations.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }




}
