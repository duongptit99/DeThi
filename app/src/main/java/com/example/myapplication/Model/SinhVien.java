package com.example.myapplication.Model;

public class SinhVien {
    private int maSV;
    private String tenSV;
    private String namsinh;
    private String quequan;
    private String namhoc;

    public SinhVien(String tenSV, String namsinh, String quequan, String namhoc) {
        this.tenSV = tenSV;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.namhoc = namhoc;
    }

    public SinhVien(int maSV, String tenSV, String namsinh, String quequan, String namhoc) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.namhoc = namhoc;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }
}
