package com.asset;

import java.util.ArrayList;
import java.util.Random;

public class selection {

    public static String SCeleb(ArrayList CelebL){
        int index = new Random().nextInt(CelebL.size());
        String SCeleb = (String) CelebL.get(index);

        return SCeleb;
    }

}














 /*   //A RANDOM CELEBRITY
    //int Spsn = RemovePsn;
    ArrayList CelebL = new ArrayList<>();
        CelebL.add("Ryan Reynolds");
                CelebL.add("Dwayne Rock Johnson");
                CelebL.add("Kanye West");
                CelebL.add("Pete Davidson");
                CelebL.add("Lionel Messi");*/

//System.out.println(SCeleb);
//A RANDOM CELEBRITY