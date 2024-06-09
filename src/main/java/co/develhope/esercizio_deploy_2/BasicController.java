package co.develhope.esercizio_deploy_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/basic")
public class BasicController {
    private final Random random = new Random();
    @GetMapping
    public String sumOfRandomIntegers () {
        int n1 = random.nextInt(100);
        int n2 = random.nextInt(100);
        int sum = n1 + n2;
        return "The result of the sum between " +  n1 + " and " + n2 + " is: " + sum;
    }
}
