package me.jaehoon.section3.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;

@Component
interface DataService {
    int[] retrieveData();
}

@Component
@Primary
class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{-1, 10, 64, 32, 21, 25};
    }
}

@Component
class MysqlDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{6, 10, 1, 3, 2};
    }
}

@Component
class BusinessCalculationService {
    DataService dataService;
    BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class CalculationApplication {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(CalculationApplication.class);
                ) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
