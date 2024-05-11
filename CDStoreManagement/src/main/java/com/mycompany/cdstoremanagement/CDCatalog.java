/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstoremanagement;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class CDCatalog {
    private ArrayList<CD> list = new ArrayList<>();

    public CDCatalog() {
    }
    public CDCatalog(ArrayList<CD> list) {
        this.list = list;
    }
    
    public void addCD(){
        CD newCD = new CD();
        newCD.Input();
        list.add(newCD);
    }
    public CD searchByTitle(String title){
        for(CD i : list){
            if (i.getTitle().equals(title) ){
                return i;
            }
        }
        return null;
    }
}
