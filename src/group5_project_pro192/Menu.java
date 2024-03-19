/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5_project_pro192;

import java.util.Scanner;

/**
 *
 * @author Tang Thanh Vui - CE180901
 */
public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("--- MENU ---\n"
                + "1. Commodity management\n"
                + "2. Bill\n"
                + "3. Save and quit");
    }

    public static void menuManagement() {
        System.out.println("--- COMMODITY MANAGEMENT ---\n"
                + "1. Show all commodity\n"
                + "2. Adds new commodity\n"
                + "3. Update a commodity\n"
                + "4. Search a commodity\n"
                + "5. Sort all commodity\n"
                + "6. Remove a commodity\n"
                + "7. Remove all commodites");
    }

    public static void callMenuManagement() {
        int choice = 0;
        while (true) {
            try {
                menuManagement();
                System.out.print("Please enter option: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 3) {
                    throw new Exception();
                }
                System.out.println("\n****************************************************\n");
                break;
            } catch (Exception e) {
                System.out.println("The function of application must be from 1 to 3!\n");
            }
        }
    }

    public static void menuBill() {
        System.out.println("--- Bill ---\n"
                + "1. Add commodity\n"
                + "2. Show all commodites\n"
                + "3. Remove a commodity\n"
                + "4. Print bill");
    }
    
    public static void callMenuBill() {
        int choice = 0;
        while (true) {
                        try {
                            menuBill();
                            System.out.print("Please enter option: ");
                            choice = Integer.parseInt(sc.nextLine());
                            if (choice < 1 || choice > 3) {
                                throw new Exception();
                            }
                            System.out.println("\n****************************************************\n");
                            break;
                        } catch (Exception e) {
                            System.out.println("The function of application must be from 1 to 3!\n");
                        }
                    }
    }

    public static void menuUpdate() {
        System.out.println("--- UPDATE ITEMS IN STORE ---\n"
                + "1. Update ID\n"
                + "2. Update Name\n"
                + "3. Update Price\n"
                + "4. Update Number\n"
                + "5. Exit");
    }
}
