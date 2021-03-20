package org.devkiu.spring.core.annotationconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class StudentConfiguration {
//    You can declare name on Bean annotation or use function name as container name
    @Bean(name="kelvin")
    public Student student(){
        return new Student("SCT221", "Kelvin", "Ndisi");
    }
}
