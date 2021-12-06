package com.ssoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TheArrays {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));

        System.out.println("colors[0] = " + colors[0]);
        System.out.println("colors[1] = " + colors[1]);
        System.out.println("colors[2] = " + colors[2]);
        System.out.println("colors[3] = " + colors[3]);
        System.out.println("colors[4] = " + colors[4]);

        colors[2] = "yellow";
        System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));

        int[] numbers = {100, 200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println("colors[" + i + "] = " + colors[i]);
        }
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println("colors[" + i + "] = " + colors[i]);
        }

        for (String color : colors) {
            System.out.println("color = " + color);
        }

        Arrays.stream(colors).forEach(System.out::println);
        IntStream.rangeClosed(1, colors.length).mapToObj(value -> colors[colors.length - value]).forEach(System.out::println);
    }
}
