/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstoremanagement;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class CD {
    private String id;
    private String collection;
    private String type;
    private String title;
    private double price;
    private int yearOfRelease;

    public CD(String id, String collection, String type, String title, double price, int yearOfRelease) {
        this.id = id;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }

    public CD() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = sc.next();
        System.out.print("Collection: ");
        this.collection = sc.next();
        System.out.print("Type: ");
        this.type = sc.next();
        System.out.print("Title: ");
        this.title = sc.next();
        System.out.print("Price: ");
        this.price = sc.nextDouble();
        System.out.print("Year of release: ");
        this.yearOfRelease = sc.nextInt();
    }

    public String getId() {
        return id;
    }

    public String getCollection() {
        return collection;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
    
    @Override
    public String toString(){
        return "ID: "+id+" Collection: "+collection+" Type: "+type+" Title: "+title+" Price: "+price+" Release year: "+yearOfRelease;
    }
}
