/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author KimKhanh
 */
public abstract class context {
    Tinh tinhToan;

    public context() {
    }
    

    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float performTinh(float a, float b){
        return tinhToan.tinh(a,b);
    } 
    public abstract String cal();
    
}
