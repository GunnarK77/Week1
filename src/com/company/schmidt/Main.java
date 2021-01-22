package com.company.schmidt;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Hello world");
	int age = 18;
	double GPA = 3.5;
	boolean isRaining = false;

        System.out.println(age+"|"+GPA+"|"+isRaining);
    String city = "Columbus";
        System.out.println(city.toUpperCase());
    float pi = 3.14f;

    int dailyHighs[] = {50,60,70,80,90};

        for(int i=4;i>-1;i--){
            System.out.println(dailyHighs[i]);
        }
    int twoDArray[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(twoDArray[2][2]);

    int sum = 3+2;
        System.out.println(sum);

    double total = 10.0/4.0;
        System.out.println(total);

        System.out.println("what is your name");
        String name = input.nextLine();
        System.out.println(name);




    }
}
