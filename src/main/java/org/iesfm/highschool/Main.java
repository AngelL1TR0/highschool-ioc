package org.iesfm.highschool;


import org.iesfm.highschool.components.HighschoolProgram;
import org.iesfm.highschool.configuration.HighschoolConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(
                    HighschoolConfiguration.class
            );

            HighschoolProgram program = context.getBean(HighschoolProgram.class);
            program.execute();

        }
    }