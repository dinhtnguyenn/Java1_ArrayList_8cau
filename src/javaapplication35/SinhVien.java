/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author DinhNguyen
 */
public class SinhVien {
    private String masv;
    private String tensv;
    private double diemTB;
    
    //chuột phải, insert code - alt + insert | alt + fn + insert

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, double diemTB) {
        this.masv = masv;
        this.tensv = tensv;
        this.diemTB = diemTB;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void NhapTT(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập mã sv: ");
        masv = s.nextLine();
        System.out.println("Nhập tên sv: ");
        tensv = s.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        diemTB = s.nextDouble();
    }
    
    public void XuatTT(){
        System.out.println("\nMã sv: " + masv + " - Tên sv: " + tensv + " - DTB: " + diemTB);
    }
}
