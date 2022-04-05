package com.Main;
import java.util.ArrayList;

import static com.Main.MAIN.LifeEND;
import static com.asset.lives.LIVES;
import static com.asset.lives.Rlife;
import static com.asset.points.POINTS;
import static com.asset.points.pointadd;
import static com.asset.selection.SCeleb;

public class responses {

    public static class respon{

        public ArrayList CelebL(){
            //A RANDOM CELEBRITY
            //int Spsn = RemovePsn;
            ArrayList CelebL = new ArrayList<>();
            CelebL.add("Ryan Reynolds");
            CelebL.add("Dwayne Rock Johnson");
            CelebL.add("Kanye West");
            CelebL.add("Pete Davidson");
            CelebL.add("Lionel Messi");
            return CelebL;
        }

        private ArrayList CelebList = CelebL();

        public String Celeb = SCeleb(CelebList);


        public String getGreeting()
        {
            return "We have 3 minutes to guess 5 Celebrities!" + "\nHere are all your options: " +
                    "\n1) Ryan Reynolds \n2) Dwayne Rock Johnson \n3) Kanye West" +
                    "\n4) Pete Davidson \n5) Lionel Messi \nYou have 3 lives!\n\n" +
                    "Be sure to start you answer with \"I choose ..." +
                    "\"\nSO START ASKING QUESTIONS!\n";

        }

        public String getResponse(String statement)
        {
            String response = "";
            if (statement.length() == 0)
            {
                response = "UHHHH STOP wasting TIME!";
            }
            else if (findKeyword(statement, "options") >= 0){
                response = "1) Ryan Reynolds \n2) Dwayne Rock Johnson \n3) Kanye West" +
                        "\n4) Pete Davidson \n5) Lionel Messi \n\nBe sure to start you answer with \"I choose ...\"\n";
            }
            else if (findKeyword(statement, "choices") >= 0){
                response = "1) Ryan Reynolds \n2) Dwayne Rock Johnson \n3) Kanye West" +
                        "\n4) Pete Davidson \n5) Lionel Messi \n\nBe sure to start you answer with \"I choose ...\"\n";
            }
            else if (findKeyword(statement, "hair") >= 0){
                response = hair();
            }
            else if (findKeyword(statement, "work") >= 0){
                response = profession();
            }
            /*else if (findKeyword(statement, "print") >= 0){
                response = Celeb;
            }*/
            else if (findKeyword(statement, "known") >= 0){
                response = famous();
            }
            else if (findKeyword(statement, "popular") >= 0){
                response = famous();
            }
            else if (findKeyword(statement, "famous") >= 0){
                response = famous();
            }
            else if (findKeyword(statement, "from") >= 0){
                response = from();
            }
            else if (findKeyword(statement, "live") >= 0){
                response = live();
            }
            else if (findKeyword(statement, "stay") >= 0){
                response = live();
            }
            else if (findKeyword(statement, "house") >= 0){
                response = live();
            }
            else if (findKeyword(statement, "grow") >= 0){
                response = from();
            }
            else if (findKeyword(statement, "home") >= 0){
                response = from();
            }
            else if (findKeyword(statement, "kid") >= 0){
                response = kids();
            }
            else if (findKeyword(statement, "children") >= 0){
                response = kids();
            }

/*
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "I want to", 0) >= 0)  //activity 3 KEYWORD DETECTION
        {
            response = transformIWantToStatement(statement);
        }
*/
            else if (findKeyword(statement, "do") >= 0){
                response = profession();
            }
            else if (findKeyword(statement, "I choose", 0) >= 0){
                response = ANSWER(statement);
            }
            else
            {
                {
                    response = getRandomResponse();
                }
            }
            return response;
        }



        private String live(){
            if (Celeb.equals("Ryan Reynolds")){
                return "The celebrity lives in New York!";
            }
            if (Celeb.equals("Dwayne Rock Johnson")){
                return "The celebrity lives in Los Angeles!";
            }
            if (Celeb.equals("Kanye West")){
                return "The celebrity lives in Los Angeles!";
            }
            if (Celeb.equals("Pete Davidson")){
                return "The celebrity lives in Staten Island!";
            }
            if (Celeb.equals("Lionel Messi")){
                return "The celebrity lives in Paris!";
            }
            return "I FORGOT";
        }


        private String kids(){
            if (Celeb.equals("Ryan Reynolds")){
                return "The celebrity has kids!";
            }
            if (Celeb.equals("Dwayne Rock Johnson")){
                return "The celebrity has kids!";
            }
            if (Celeb.equals("Kanye West")){
                return "The celebrity has kids!";
            }
            if (Celeb.equals("Pete Davidson")){
                return "The celebrity does not have kids!";
            }
            if (Celeb.equals("Lionel Messi")){
                return "The celebrity has kids!";
            }
            return "I FORGOT";
        }


        private String from(){
            if (Celeb.equals("Ryan Reynolds")){
                return "The celebrity is from Vancouver, Canada!";
            }
            if (Celeb.equals("Dwayne Rock Johnson")){
                return "The celebrity is from Hayward, california!";
            }
            if (Celeb.equals("Kanye West")){
                return "The celebrity is from Atlanta, Georgia!";
            }
            if (Celeb.equals("Pete Davidson")){
                return "The celebrity is from Staten Island!";
            }
            if (Celeb.equals("Lionel Messi")){
                return "The celebrity is from Rossario, Argentina!";
            }
            return "I FORGOT";
        }

            private String famous(){
                if (Celeb.equals("Ryan Reynolds")){
                    return "The celebrity is famous for deadpool!";
                }
                if (Celeb.equals("Dwayne Rock Johnson")){
                    return "The celebrity is famous for WWE and being the The Scorpion King!";
                }
                if (Celeb.equals("Kanye West")){
                    return "The celebrity is famous for rap music!";
                }
                if (Celeb.equals("Pete Davidson")){
                    return "The celebrity is famous for SNL skits!";
                }
                if (Celeb.equals("Lionel Messi")){
                    return "The celebrity is famous for playing soccer!";
                }
                return "I FORGOT";
            }


            private String profession()
            {

                if (Celeb.equals("Ryan Reynolds")){
                    return "The celebrity is a actor!";
                }
                if (Celeb.equals("Dwayne Rock Johnson")){
                    return "The celebrity is a actor, musician, bodybuilder and motivationalist!";
                }
                if (Celeb.equals("Kanye West")){
                    return "The celebrity is a musician!";
                }
                if (Celeb.equals("Pete Davidson")){
                    return "The celebrity is a actor and comedian!";
                }
                if (Celeb.equals("Lionel Messi")){
                    return "The celebrity is a famous soccer player!";
                }

                return "I FORGOT";
            }


            private String hair()
            {

                if (Celeb.equals("Ryan Reynolds")){
                    return "The celebrity has Black short hair!";
                }
                if (Celeb.equals("Dwayne Rock Johnson")){
                    return "The celebrity has no hair!";
                }
                if (Celeb.equals("Kanye West")){
                    return "The celebrity has no hair!";
                }
                if (Celeb.equals("Pete Davidson")){
                    return "The celebrity has Black short hair!";
                }
                if (Celeb.equals("Lionel Messi")){
                    return "The celebrity has Black short hair!";
                }

                return "I FORGOT";
            }


/*    private String transformIWantToStatement(String statement)//activity 3 KEYWORD DETECTION I want to
    {
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }
  */

            private String ANSWER(String Statement)
            {

                Statement.replace(")", "");
                Statement.replace(".", "");
                Statement.replace("!", "");
                Statement.replace("?", "");
                int psn = findKeyword (Statement, "I want to", 0);
                String ans = Statement.substring(psn + 8).trim();


                if (ans.contains("1")&&!Celeb.equals("Ryan Reynolds")){
                    Rlife();
                    LivesCheck(LIVES);
                    return "YOU GUESSED IT WRONG! \nYou have " + LIVES + " lives!";
                } else if (ans.contains("1")&&Celeb.equals("Ryan Reynolds")){
                    pointadd();
                    CelebList.remove("Ryan Reynolds");
                    Celeb = SCeleb(CelebList);
                    //System.out.println(CelebList +"\n"+ Celeb);
                    return "YOU GOT THE RIGHT ANSWER! Your score is: " + POINTS;
                }
                if (ans.contains("2")&&!Celeb.equals("Dwayne Rock Johnson")){
                    Rlife();
                    LivesCheck(LIVES);
                    return "YOU GUESSED IT WRONG! \nYou have " + LIVES + " lives!";
                } else if (ans.contains("2")&&Celeb.equals("Dwayne Rock Johnson")){
                    pointadd();
                    CelebList.remove("Dwayne Rock Johnson");
                    Celeb = SCeleb(CelebList);
                    //System.out.println(CelebList +"\n"+ Celeb);
                    return "YOU GOT THE RIGHT ANSWER! Your score is: " + POINTS;
                }
                if (ans.contains("3")&&!Celeb.equals("Kanye West")){
                    Rlife();
                    LivesCheck(LIVES);
                    return "YOU GUESSED IT WRONG! \nYou have " + LIVES + " lives!";
                } else if (ans.contains("3")&&Celeb.equals("Kanye West")){
                    pointadd();
                    CelebList.remove("Kanye West");
                    Celeb = SCeleb(CelebList);
                    //System.out.println(CelebList +"\n"+ Celeb);
                    return "YOU GOT THE RIGHT ANSWER! Your score is: " + POINTS;
                }
                if (ans.contains("4")&&!Celeb.equals("Pete Davidson")){
                    Rlife();
                    LivesCheck(LIVES);
                    return "YOU GUESSED IT WRONG! \nYou have " + LIVES + " lives!";
                } else if (ans.contains("4")&&Celeb.equals("Pete Davidson")){
                    pointadd();
                    CelebList.remove("Pete Davidson");
                    Celeb = SCeleb(CelebList);
                    //System.out.println(CelebList +"\n"+ Celeb);
                    return "YOU GOT THE RIGHT ANSWER! Your score is: " + POINTS;
                }
                if (ans.contains("5")&&!Celeb.equals("Lionel Messi")){
                    Rlife();
                    LivesCheck(LIVES);
                    return "YOU GUESSED IT WRONG! \nYou have " + LIVES + " lives!";
                } else if (ans.contains("5")&&Celeb.equals("Lionel Messi")){
                    pointadd();
                    CelebList.remove("Lionel Messi");
                    Celeb = SCeleb(CelebList);
                    //System.out.println(CelebList +"\n"+ Celeb);
                    return "YOU GOT THE RIGHT ANSWER! Your score is: " + POINTS;
                }

                return "";
            }

            public void LivesCheck(int LIVES){
                if (LIVES==0){
                    LifeEND();
                }
        }


            private int findKeyword(String statement, String goal, int startPos) //findkeword class to find keyword
            {
                String phrase = statement.trim();
                //  The only change to incorporate the startPos is in the line below
                int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

                //  Refinement--make sure the goal isn't part of a word
                while (psn >= 0)
                {
                    //  Find the string of length 1 before and after the word
                    String before = " ", after = " ";
                    if (psn > 0)
                    {
                        before = phrase.substring (psn - 1, psn).toLowerCase();
                    }
                    if (psn + goal.length() < phrase.length())
                    {
                        after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
                    }

                    //  If before and after aren't letters, we've found the word
                    if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
                    {
                        return psn;
                    }

                    //  The last position didn't work, so let's find the next, if there is one.
                    psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

                }

                return -1;
            }


            private int findKeyword(String statement, String goal)
            {
                return findKeyword (statement, goal, 0);
            }

    /*
     Pick a default response to use if nothing else fits.
     */
            private String getRandomResponse()
            {
                final int NUMBER_OF_RESPONSES = 6;
                double r = Math.random();
                int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
                String response = "";

                if (whichResponse == 0)
                {
                    response = "Ask something else!";
                }
                else if (whichResponse == 1)
                {
                    response = "I DON'T KNOW";
                }
                else if (whichResponse == 2)
                {
                    response = "I got a memory leak ask something else.";
                }
                else if (whichResponse == 3)
                {
                    response = "I got no answer!";
                }
                else if (whichResponse == 4)
                {
                    response = "I have no idea what you are saying!";
                }
                else if (whichResponse == 5)
                {
                    response = "...Yea I don't know";
                }

                return response;
            }


        }
    }

