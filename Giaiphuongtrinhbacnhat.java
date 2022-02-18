/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.baitap1.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
    int a,b;
    Scanner sc= new Scanner(System.in);
        System.out.println("NHap a : ");
        a = sc.nextInt();
        System.out.println("NHap b : ");
        b = sc.nextInt();
        if ( a==0 ){
            if ( b== 0 ) {
                System.out.println("Phuogn trinh vo so nghiem ");
            } else { 
                System.out.println("Phuong trinh vo nghiem ");
            }
        }else{ 
            float x = (float) - b /a;
            System.out.println("Phuong trinh co mot nghiem duy nhat: "+ x);
            
                
                }           
                
}
}
