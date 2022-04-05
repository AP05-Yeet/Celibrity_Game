package com.Main;

import com.asset.GUI;

import java.util.Scanner;

import static com.asset.points.POINTS;

public class MAIN {
    public static void main(String[] args) {

        new GUI();

        responses.respon maggie = new responses.respon();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!(POINTS == 4) || (POINTS == -1))
        {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }

        System.out.println("Well done you got all of them under 3 minute!");
        System.exit(69);

    }

    public static String END(){
        System.out.println("You ran out of time! \nYou ended with a score of: " + POINTS);
        System.exit(69);
        return "END";
    }
    public static String LifeEND(){
        System.out.println("You ran out of lives! \nYou ended with a score of: " + POINTS);
        System.exit(69);
        return "END";
    }




    }








//String[][] Celebes = new String[2/*row*/][5/*colum*/];
        /*
        Celebes[0][0] = "1";
        Celebes[0][1] = "2";
        Celebes[0][2] = "3";
        Celebes[0][3] = "4";
        Celebes[0][4] = "5";

        Celebes[1][0] = "Ryan Reynolds";
        Celebes[1][1] = "Dwayne Rock Johnson";
        Celebes[1][2] = "Kanye West";
        Celebes[1][3] = "Pete Davidson";
        Celebes[1][4] = "Lionel Messi";
        */
//int RR/* row random*/ = Math.random();

//System.out.println(Celebes[1][3]);
