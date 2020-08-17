package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzArray2Test {

    @ParameterizedTest
    @MethodSource("fizzArray2DataStream")

    public void shouldReturnAnArrayWithTheStringVersionOfTheInts(int n, List<String> expectedResult){

        FizzArray2 fizzArray2 = new FizzArray2();

        assertEquals(expectedResult, fizzArray2.fizzArray2(n));

    }

    static Stream<Arguments> fizzArray2DataStream(){

        return Stream.of(

                arguments(4, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");

                    }

                }),
                arguments(10, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");
                        add("4");
                        add("5");
                        add("6");
                        add("7");
                        add("8");
                        add("9");
                    }

                }),
                arguments(2, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");

                    }

                }),
                arguments(1, new ArrayList<String>() {

                    {
                        add("0");

                    }

                }),
                arguments(0, new ArrayList<String>() {

                }),
                arguments(7, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");
                        add("4");
                        add("5");
                        add("6");
                    }

                }),
                arguments(9, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");
                        add("4");
                        add("5");
                        add("6");
                        add("7");
                        add("8");
                    }

                }),
                arguments(11, new ArrayList<String>() {

                    {
                        add("0");
                        add("1");
                        add("2");
                        add("3");
                        add("4");
                        add("5");
                        add("6");
                        add("7");
                        add("8");
                        add("9");
                        add("10");
                    }

                })

        );

    }

}
