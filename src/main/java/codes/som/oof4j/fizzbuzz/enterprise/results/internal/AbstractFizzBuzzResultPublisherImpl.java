package codes.som.oof4j.fizzbuzz.enterprise.results.internal;

import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResult;
import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResultPublisher;
import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResultSubscriber;

import java.util.*;
import java.util.concurrent.*;

public abstract class AbstractFizzBuzzResultPublisherImpl implements FizzBuzzResultPublisher {
    private final List<FizzBuzzResultSubscriber> subscribers = new CopyOnWriteArrayList<>();

    @Override
    public void registerSubscriber(FizzBuzzResultSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unregisterSubscriber(FizzBuzzResultSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    protected void publishResult(FizzBuzzResult result) {
        for (FizzBuzzResultSubscriber subscriber : this.subscribers) {
            subscriber.onResult(result);
        }
    }
}
