package assignment2.main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class VehicleTest {
    private Vehicle vehicle;

    @Before
    public void setUp() throws Exception{
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        vehicle = (Vehicle)ctx.getBean("Move");
        vehicle = (Vehicle)ctx.getBean("Finish");
    }
    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void wheels() throws Exception {

        String output = vehicle.wheels("Truck has 8 wheels");
        Assert.assertEquals("Truck ",output,"Truck has 8 wheels");
    }

}
