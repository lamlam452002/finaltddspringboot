package org.example;

public class FizzBuzz {

    public String getFizzBuzz(int input) {
        if (input <= 0) {
            throw new IllegalArgumentException("out of fizz buzz");
        }
        String output = "";
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) output += "Fizz";
            else output += output == ""? ""+i : " ," + i;
        }
        return output;
    }
}

