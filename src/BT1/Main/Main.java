/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1.Main;

import BT1.Cong;
import BT1.PhepCong;
import BT1.PhepTru;
import BT1.Tinh;
import BT1.Tru;
import BT1.context;

/**
 *
 * @author KimKhanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tinh cong1 = new Cong();
        context ct1 = new PhepCong();
        ct1.setTinhToan(cong1);
        System.out.println(ct1.cal(75,12));
        
        context ct2 = new PhepTru();
        ct2.setTinhToan(new Tru());
        System.out.println(ct2.cal(54,78));

    }
    
    
}
