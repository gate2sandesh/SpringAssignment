package app;

import model.City;
import model.Student;
import model.University;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        City city = (City) context.getBean("city");

        //log.info("Information accessed by a User");

        System.out.println(city.getUni().getFaculty());


    }
}
