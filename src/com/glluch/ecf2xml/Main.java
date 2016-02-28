package com.glluch.ecf2xml;

import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    public static void main(String[] args)  throws IOException{
        ecfReader ecfR = new ecfReader();
        HashMap<String, Competence> competences=ecfR.parseTxtDocument();
        System.out.println(competences);
        

    }
}
