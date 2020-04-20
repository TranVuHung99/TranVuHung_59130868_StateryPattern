/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author KimKhanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        QLSV ds = new QLSV();
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
        
        SinhVien sv1 = new SinhVien("Trần Vũ C", spf.parse("10/04/1999") , (float)8.5);
        SinhVien sv2 = new SinhVien("Lê Văn A", spf.parse("15/11/1999") , (float)7.5);
        SinhVien sv3 = new SinhVien("Lê Thị B", spf.parse("20/06/1999") , (float)9.5);
        
        ds.them(sv1);
        ds.them(sv2);
        ds.them(sv3);
        
        ds.inDS();
        
        System.out.println("Danh sach sinh viên sắp xếp theo tên:\n");
        ds.setiSS(new SoSanhTheoTen());
        ds.sapXep();
        ds.inDS();
        
        System.out.println("Danh sach sinh viên sắp xếp theo điểm:\n");
        ds.setiSS(new SoSanhTheoDiem());
        ds.sapXep();
        ds.inDS();
    }
    
}
