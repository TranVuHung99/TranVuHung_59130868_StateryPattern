/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author KimKhanh
 */
import java.util.ArrayList;
public class QLSV {
    ArrayList<SinhVien> danhsach = new ArrayList<>();
    ISoSanh<SinhVien> iSS;
    
    public void setiSS(ISoSanh<SinhVien> iSS) {
        this.iSS = iSS;
    }
    public void them(SinhVien sv){
        danhsach.add(sv);
    }
    
    void sapXep(){
        SinhVien tam;
        for(int i=0;i<danhsach.size();i++){
            for(int j = i+1;j<danhsach.size();j++){
                if(iSS.soSanh(danhsach.get(i), danhsach.get(j))==1){
                    tam=danhsach.get(i);
                    danhsach.set(i, danhsach.get(j));
                    danhsach.set(j, tam);
                }
                }
                    
        }
        
        
    }
    void inDS(){
        for(int i=0;i<danhsach.size();i++)
        {
            System.out.println(danhsach.get(i).inThongTin());
        }
    }
    
}
