/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.project;
import java.util.Vector;

/**
 *
 * @author BeshBeshy
 */
public class Game {
    public String name;
    public Vector<Question> questions = new Vector<>();
    public int finalScore;
    
    public Game(){
        
    }
    
    public Game(String s , Vector<Question> v1){
        
        name = s;
        questions = v1;
    }
    
}
