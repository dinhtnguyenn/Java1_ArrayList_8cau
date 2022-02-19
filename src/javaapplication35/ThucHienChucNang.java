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

/**
 *
 * @author DinhNguyen
 */
public class ThucHienChucNang {

    ArrayList<SinhVien> listSV = new ArrayList<>();

    //sử dụng for
    public void NhapDanhSach(Scanner s) {
        System.out.println("Nhập số lượng sinh viên: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.NhapTT();
            listSV.add(sv);
        }
    }

    //sử dụng do...while
    public void NhapDanhSach2(Scanner s) {
        do {
            SinhVien sv = new SinhVien();
            sv.NhapTT();
            listSV.add(sv);

            System.out.println("Bạn có muốn tiếp tục nhập không? - 1. Nhập tiếp - 0.Kết thúc");
            int check = s.nextInt();

            if (check == 0) {
                break;
            }
        } while (true);
    }

    //sử dụng for
    public void XuatDanhSach() {
        for (int i = 0; i < listSV.size(); i++) {
            SinhVien sv = listSV.get(i);
            sv.XuatTT();
        }
    }

    //sử dụng foreach
    public void XuatDanhSach2() {
        //for(phần_tử_trong_ds tên_của_pt : danh_sách_cần_duyệt)
        for (SinhVien sv : listSV) {
            sv.XuatTT();
        }
    }

    //cập nhật thông tin sv - theo mã
    public void CapNhatThongTin(Scanner s) {
        System.out.println("Nhập mã số sinh viên cần cập nhật thông tin: ");
        String ma = s.nextLine();
        boolean flag = false; //flag = true: tìm thấy, flag = false: không tìm thấy
        for (SinhVien sv : listSV) {
            if (sv.getMasv().equalsIgnoreCase(ma)) {
                sv.NhapTT();
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Không tìm thấy sinh viên");
        } else {
            XuatDanhSach();
        }
    }

    //tìm sinh viên
    public void TimSV(Scanner s) {
        System.out.println("Nhập mã số sv cần tìm: ");
        String ma = s.nextLine();
        boolean flag = false;
        for (SinhVien sv : listSV) {
            if (sv.getMasv().equalsIgnoreCase(ma)) {
                sv.XuatTT();
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    //xóa sinh viên
    public void XoaSV(Scanner s) {
        System.out.println("Nhập mã số sv cần xóa: ");
        String ma = s.nextLine();
        boolean flag = false;
        for (SinhVien sv : listSV) {
            if (sv.getMasv().equalsIgnoreCase(ma)) {
                listSV.remove(sv);
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Không tìm thấy sinh viên");
        }else {
            XuatDanhSach();
        }
    }

    //sắp xếp giảm dần theo điểm trung bình
    public void SapXepGiamDanDTB() {
//        Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return (int) (o2.getDiemTB() - o1.getDiemTB());
//            }
//        };
//        Collections.sort(listSV, comparator);

        //Collections.sort(danh_sach_sap_xep, (o1, o2) -> (int) (...))
        Collections.sort(listSV, (o1, o2) -> (int) (o2.getDiemTB() - o1.getDiemTB()));
    }

    //sắp xếp tăng dần theo tên
    public void SapXepTangDanTheoTen() {
        Collections.sort(listSV, (o1, o2) -> (int) (o1.getTensv().compareTo(o2.getTensv())));
    }

    //top 5
    public void Top5() {
        //b1: sắp xếp danh sách diem trung binh giam dan
        Collections.sort(listSV, (o1, o2) -> (int) (o2.getDiemTB() - o1.getDiemTB()));

        //b2: lấy 5 sv đầu tiên
        //cach 1: for
        for (int i = 0; i < 5; i++) {
            SinhVien sv = listSV.get(i);
            sv.XuatTT();
        }

        //cach 2: foreach
        int count = 1;
        for (SinhVien sv : listSV) {
            sv.XuatTT();

            if (count == 5) {
                break;
            }

            count++;
        }

    }
}
