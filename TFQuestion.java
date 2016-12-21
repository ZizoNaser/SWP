/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.project;

/**
 *
 * @author BeshBeshy
 */
public class TFQuestion extends Question{
   
    
    public TFQuestion(){
        type = "TF";
          answers = new String[2];
    }
    
    public TFQuestion(String s1 , String s2){
        super(s1 , s2);
        type = "TF";
        answers = new String[2];
        answers[0] = "T";
        answers[1] = "F";
    }
    
}
