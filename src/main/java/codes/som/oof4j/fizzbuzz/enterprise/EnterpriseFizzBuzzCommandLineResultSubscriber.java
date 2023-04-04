package codes.som.oof4j.fizzbuzz.enterprise;

import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResult;
import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResultSubscriber;

import java.io.*;

public class EnterpriseFizzBuzzCommandLineResultSubscriber implements FizzBuzzResultSubscriber {
    private final PrintStream outputStream;

    public EnterpriseFizzBuzzCommandLineResultSubscriber(PrintStream outputStream) {
        this.outputStream = outputStream;
    }


    @Override
    public void onResult(FizzBuzzResult result) {
        outputStream.println("Hello World from FizzBuz! iteration: " + result.getAsString());
    }
}
