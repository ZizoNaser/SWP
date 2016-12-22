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
public class Question {
    public String question;
    public String CorrectAnswer;
    public String chossenAnswer;
    public String type;
    public String []answers;
    
    public Question(){
        
    }
    public Question(String s1 , String s2){
        question = s1;
        CorrectAnswer = s2;
    }
}
