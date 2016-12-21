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
public class Student extends User{
   
    
    public Student(String fn , String ln  , String un , String pw , int a ,String s1 ){
        super( fn , ln , un , pw , a);
        school = s1;
        score = 0;        
        type="S";
    }
}
