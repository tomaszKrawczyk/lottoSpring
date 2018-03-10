package pl.tomaszKrawczyk.lotttoSpring.panel;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Tomek Krawczyk on 20.01.2018.
 */
public class Lotto {


    public static List<Integer> gameRandomNumber() {


        Random random = new Random();


        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size() != 6) {

            numbers.add(random.nextInt(49) + 1);
        }


        return numbers.stream().collect(Collectors.toList());


    }
}