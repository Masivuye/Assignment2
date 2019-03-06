package assignment2.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="Move")
    public Vehicle getService()
    {
        return new Truck();
    }
    @Bean(name ="Finish")
    public Vehicle getWheels(){

        return new Bus();
    }
    
}
