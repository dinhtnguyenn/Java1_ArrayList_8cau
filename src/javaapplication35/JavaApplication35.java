/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author DinhNguyen
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        ThucHienChucNang chucNang = new ThucHienChucNang();
        
        do{
            System.out.println(" - - - MENU  - - -");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã số sinh viên");
            System.out.println("4. Tìm sinh viên theo mã số sinh viên");
            System.out.println("5. Xóa sinh viên theo mã số sinh viên");
            System.out.println("6. Xuất ra top 5 sinh viên có điểm trung bình cao nhất");
            System.out.println("7. Sắp xếp danh sách sinh viên giảm dần theo điểm trung bình");
            System.out.println("8. Sắp xếp danh sách sinh viên tăng dần theo tên");
            System.out.println("0. Kết thúc chương trình");
            System.out.print("Mời bạn chọn chức năng: ");
            int chon = s.nextInt();   
            s.nextLine();
            
            switch(chon){
                case 1:
                    //cong viec 1
                    chucNang.NhapDanhSach2(s);
                    break;
                case 2:
                    //cong viec 2
                    chucNang.XuatDanhSach2();
                    break;
                case 3:
                    chucNang.CapNhatThongTin(s);
                    chucNang.XuatDanhSach();
                    break;
                case 4:
                    chucNang.TimSV(s);
                    break;
                case 5:
                    chucNang.XoaSV(s);
                    chucNang.XuatDanhSach();
                    break;
                case 6:
                    chucNang.Top5();
                    break;
                case 7:
                    chucNang.SapXepGiamDanDTB();
                    chucNang.XuatDanhSach();
                    break;
                case 8:
                    chucNang.SapXepTangDanTheoTen();
                    chucNang.XuatDanhSach();
                    break;
            }
            if(chon == 0){
                System.out.println("Hẹn lại các bạn nè");
                break;
            }
            
        }while(true);
      
    }

}
