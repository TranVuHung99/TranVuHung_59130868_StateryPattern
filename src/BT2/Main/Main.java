/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2.Main;

/**
 *
 * @author KimKhanh
 */
import BT2.GioHang;
import BT2.HangHoa;
import BT2.ThanhToanCOD;
import BT2.ThanhToanOnline;
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    static void inDS(ArrayList<HangHoa> ds){
        for(int i=0;i<ds.size();i++)
            System.out.println(i+1+"\t Ten Hang: "+ds.get(i).getTenHH()+"\t Gia: "+ds.get(i).getGia()+
                    "\t Mô tả: "+ds.get(i).getMoTa()+"\n");
    }
    public static void main(String[] args) {
        // TODO code application logic here
            ThanhToanOnline ttOnline = new ThanhToanOnline();
            ThanhToanCOD ttCOD = new ThanhToanCOD();
            
            HangHoa hh1 = new HangHoa("Laptop",200000 , "Dell");
            HangHoa hh2 = new HangHoa("Laptop",900000 , "Samsung");
            HangHoa hh3 = new HangHoa("Laptop",1000000 , "HTC");
            
            HangHoa hh4 = new HangHoa("MacBook",1000000 , "Pro");
            HangHoa hh5 = new HangHoa("Ipad",1000000 , "Mini");
            HangHoa hh6 = new HangHoa("Iphone",1000000 , "5s");
            ArrayList<HangHoa> ds1 = new ArrayList<>();
            ds1.add(hh1);
            ds1.add(hh2);
            ds1.add(hh3);
            ArrayList<HangHoa> ds2 = new ArrayList<>();
            ds2.add(hh4);
            ds2.add(hh5);
            ds2.add(hh6);
            
            GioHang gh1 = new GioHang();
            gh1.setHinhThucTT(ttCOD);
            gh1.sethH(ds1);
            inDS(ds1);
            System.out.println("Số tiền phải trả: "+gh1.thanhToan()+"\n");
            
            GioHang gh2 = new GioHang();
            gh2.setHinhThucTT(ttOnline);
            gh2.sethH(ds2);
            inDS(ds2);
            System.out.println("Số tiền phải trả: "+gh2.thanhToan()+"\n");
        }
    }
    

