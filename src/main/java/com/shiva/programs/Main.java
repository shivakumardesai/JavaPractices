package com.shiva.programs;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


interface Predicate<T> {
    boolean test(T t);
}

interface Function<T,R> {
    R apply(T t);
}

interface Consumer<T> {
    void accept(T t);
}

interface Supplier<R> {
    R get();
}