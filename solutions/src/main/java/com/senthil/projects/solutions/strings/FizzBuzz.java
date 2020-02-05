package com.senthil.projects.solutions.strings;

public class FizzBuzz {
    StringBuilder stringBuilder = new StringBuilder();

    public String fizzBuzz(int range) {
        for (int i = 0; i <= range; i++) {
            if (i % 3 == 0 && i % 15 == 0)
                stringBuilder.append("FizzBuzz\t");
            else if (i % 3 == 0 )
                stringBuilder.append("Fizz\t");
            else if (i % 5 == 0 )
                stringBuilder.append("Buzz\t");
            else
                stringBuilder.append(i+"\t");
        }
        return stringBuilder.toString();
    }
}
