package org.iesfm.highschool.components;

import org.iesfm.highschool.entity.Group;
import org.iesfm.highschool.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class GroupReader {

    private final static Logger log = LoggerFactory.getLogger(GroupReader.class);

    private Scanner scanner;

    public GroupReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Group readGroup() {
        log.info("Introduce la letra del curso");
        String letter = scanner.nextLine();
        log.info("Introduce el curso");
        int course = scanner.nextInt();
        log.info("Lista de estudiantes:");
        Student students = new Student();
        return new Group(letter, course,students);
    }
}
