package com.jenkins.JenkinsPractice;

import java.util.ArrayList;
import java.util.List;

public class Printing {
     public List print1to10numbers(){
         List<Integer> numberList = new ArrayList<>();
         for(int i=1;i<=10;i++){
             numberList.add(i);
         }
         return numberList;
     }
}
