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
public class Teacher extends User {
    
    public Teacher(String fn, String ln, String un, String pw, int a) {
        super(fn, ln, un, pw, a);
        type="T";
    }
    
    
}
