package zuper.programmer.application;

import static zuper.programmer.data.Application.PROCESSORS;
import static zuper.programmer.data.Constant.*;
import zuper.programmer.data.Country;
import zuper.programmer.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
            MathUtil.sum(1,2,3,4,5,6,7,8,9,10)
        );

        Country.City city = new Country.City();
        city.setName("Sumenep");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
