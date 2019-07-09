package manina.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TVConfig {
    @Bean
    public TV tv(){
        return new TV(programChecker());
    }

    @Bean
    public ProgramChecker programChecker(){
        return new ProgramChecker();
    }
}
