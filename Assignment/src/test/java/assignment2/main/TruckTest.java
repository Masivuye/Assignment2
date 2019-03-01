package assignment2.main;

import org.junit.Assert;
import org.junit.Test;

public class TruckTest {

    @Test
    public void wheels() {
        Vehicle objTruck = new Truck();
        String output = objTruck.wheels("Truck has 8 wheels");
        Assert.assertEquals("Truck has 8 wheels",output);
    }

    @Test
    public void move(){
        Vehicle objTruck = new Truck();
        String output = objTruck.move("Truck has moved");
        Assert.assertEquals("Truck has moved",output);
    }
}
