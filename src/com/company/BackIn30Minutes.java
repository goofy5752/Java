package com.company;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 30;

        if (minutes > 59){
            minutes -= 60;
            hour++;
            if (hour == 24){
                hour = 0;
            }
        }
        if (minutes < 10 && minutes > 0){
            System.out.printf(hour + ":" + "0" + minutes);
        }
        else
        {
            System.out.printf(hour + ":" + minutes);
        }
    }
}
