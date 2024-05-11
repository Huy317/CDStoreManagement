/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cdstoremanagement;

import java.util.*;

/**
 *
 * @author Student
 */
public class CDStoreManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDCatalog catalog = new CDCatalog();
        CD cd;
        String stringInput;
        int n = 0;
        while (n != 9) {
            System.out.println("Choose an action");
            System.out.println("1.Add CD");
            System.out.println("2.Search by title");
            System.out.println("3.Search by collection");
            System.out.println("4.Search by type");
            System.out.println("5.Delete by id");
            System.out.println("6.Edit information by id");
            System.out.println("7.Display all cd");
            System.out.println("8.Sort cd by ascending order of year of release");
            System.out.println("9.Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    catalog.addCD();
                    break;
                case 2:
                    String title = sc.next();
                    cd = catalog.searchByTitle(title);
                    if (cd != null) {
                        System.out.println(cd.toString());
                        cd = null;
                    } else {
                        System.out.println("Couldn't find CD");
                    }
                    break;
                case 3:
                    String collection = sc.next();
                    cd = catalog.searchByCollection(collection);
                    if (cd != null) {
                        System.out.println(cd.toString());
                        cd = null;
                    } else {
                        System.out.println("Couldn't find CD");
                    }
                    break;
                case 4:
                    String type = sc.next();
                    cd = catalog.searchByType(type);
                    if (cd != null) {
                        System.out.println(cd.toString());
                        cd = null;
                    } else {
                        System.out.println("Couldn't find CD");
                    }
                    break;
                case 5:
                    stringInput = sc.next();
                    catalog.deleteCD(stringInput);
                    break;
                case 6:
                    stringInput = sc.next();
                    catalog.editCD(stringInput);
                    break;
                case 7:
                    
                    break;
                case 8:
                    catalog.sortByYear();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
