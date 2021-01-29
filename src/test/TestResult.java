package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        System.out.println(Exercise.IsArmstrongNumber(1)); // true
        System.out.println(Exercise.IsArmstrongNumber(370)); // true
        System.out.println(Exercise.IsArmstrongNumber(153)); // true
        
        System.out.println(Exercise.IsArmstrongNumber(101)); //false
        System.out.println(Exercise.IsArmstrongNumber(213)); // false
    }
}
