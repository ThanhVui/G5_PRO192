/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5_project_pro192;

import java.util.Scanner;

/**
 *
 * @author Nguyen Huy Hoang - CE182102
 */
public class Group5_Project_PRO192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommodityList cList = new CommodityList();
        Menu m = new Menu();
        int choice;

        do {
            while (true) {
                try {
                    m.menu();
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

            switch (choice) {
                case 1:
                    m.callMenuManagement();
                    break;
                case 2:
                    m.callMenuBill();
                    break;
                case 3:
                    // thoat va cam on user
                    System.out.println("THANK FOR USING OUR APPLICATION!\n"
                            + "SEE YOU AGAIN!");
            }

        } while (choice != 3);
    }
}
