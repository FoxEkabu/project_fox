package lesson15;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class RunnerWordsStatic {


    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        Collection<String> words;

        words = List.of(text.replaceAll("\\pP", "").toLowerCase().split(" "));
        Map wordsCount = words.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        wordsCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


    }
}
