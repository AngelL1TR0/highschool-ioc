package org.iesfm.highschool.configuration;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.highschool.components.GroupReader;
import org.iesfm.highschool.components.HighschoolWriter;
import org.iesfm.highschool.components.StudentReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class HighschoolConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public HighschoolWriter highschoolWriter(
            ObjectMapper objectMapper,
            @Value("${output.path}") String outputPath) {
        return new HighschoolWriter(objectMapper, outputPath);
    }

    @Bean
    public GroupReader groupReader( Scanner scanner){
        return  new GroupReader(scanner);
    }

}
