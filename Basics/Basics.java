import java.util.ArrayList;

public class BasicJava {

// Print 1-255
// Write a method that prints all the numbers from 1 to 255.
public void OneTo255() {
    for(int i = 0; i<=255; i++) {
        System.out.println(i);
    }
}

// Print odd numbers between 1-255
// Write a method that prints all the odd numbers from 1 to 255.
public void printOdds() {
    for(int i = 0; i <= 255; i++) {
        if(i % 2 == 0)
            System.out.println(i);
    }
}

public int getArraySum(int[] numbers) {
    int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
        sum += numbers [i];
    }
    return sum;
}