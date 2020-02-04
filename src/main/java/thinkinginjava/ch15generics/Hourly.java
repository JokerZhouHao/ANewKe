package thinkinginjava.ch15generics;

interface Payable<T> {}
class Employee implements Payable<Integer> {}

public class Hourly extends Employee implements Payable<Double> {
}
