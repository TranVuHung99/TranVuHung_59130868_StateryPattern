/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author KimKhanh
 */
import java.util.ArrayList;
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> hH;

    public void sethH(ArrayList<HangHoa> hH) {
        this.hH = hH;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public double thanhToan(){
        int tong=0;
        for(int i=0;i<hH.size();i++){
            tong+=hH.get(i).getGia();
        }
        return hinhThucTT.thanhToan(tong);
    }
    
}
