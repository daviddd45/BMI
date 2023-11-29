/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bmi;

/**
 *
 * @author USER
 */
public class BMI {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int beratbadan= 58;
    float tinggibadan =1.71f;
    float bmi=(beratbadan/ (tinggibadan*tinggibadan));
    
    System.out.println ("BMI ANDA ADALAH\t:"+bmi);
    
    if (bmi<18.5) {
        System.out.println("BERAT BADAN ANDA KURANG");
    }
    else if (bmi<24.9){
        System.out.println("BERAT BADAN ANDA KURANG");
    }
    else if (bmi<29.9){
        System.out.println("BERAT BADAN ANDA LEBIH/GE");
    }
    else{
        System.out.println("OBESITAS");
    }
    
    }
}
