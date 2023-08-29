package day6FileExit;

import com.github.javafaker.Faker;
import org.junit.Test;

public class faker {
    @Test
    public void test1() {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        System.out.println(name);

        String adress= faker.address().city();
        System.out.println(adress);

        System.out.println(faker.number().digits(4));


    }
}
