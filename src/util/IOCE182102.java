/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Nguyen Huy Hoang - CE182102
 */
public class IOCE182102 {
    Scanner sc = new Scanner(System.in);
    
    // Get string
    public String getString(String iMsg) {
        String str;
        while (true) {
            System.out.print(iMsg);
            str = sc.nextLine();
            if (!str.isEmpty())
                return str;
            System.out.println("Not empty!");
        }
    }
    
    public String getString(String iMsg, String iErr, int len) {
        String str;
        while(true) {
            try {
                System.out.print(iMsg);
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    if(str.length() == len)
                        return str;
                    throw new Exception();
                } else
                    System.out.println("Not empty!");
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    
    // Get int
    public int getInt(String iMsg, String iErr, int numStart) {
        String str;
        while(true) {
            try {
                System.out.print(iMsg);
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    if (Integer.parseInt(str) >= numStart)
                        return Integer.parseInt(str);
                    throw new Exception();
                } else
                    System.out.println("Not empty!");
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public int getInt(String iMsg, String iErr, int numStart, int numEnd) {
        String str;
        if (numStart > numEnd) {
            int tmp = numStart;
            numStart = numEnd;
            numEnd = tmp;
        }
        while(true) {
            try {
                System.out.print(iMsg);
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    if (Integer.parseInt(str) >= numStart && Integer.parseInt(str) <= numEnd)
                        return Integer.parseInt(str);
                    throw new Exception();
                } else
                    System.out.println("Not empty!");
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }
    
    
    // Get double
    public double getDouble(String iMsg, String iErr, double numStart) {
        String str;
        while(true) {
            try {
                System.out.print(iMsg);
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    if (Double.parseDouble(str) >= numStart)
                        return Double.parseDouble(str);
                    throw new Exception();
} else
                    System.out.println("Not empty!");
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }
    
    
    
}