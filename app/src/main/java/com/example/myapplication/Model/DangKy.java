package com.example.myapplication.Model;

public class DangKy {
    private int masv;
    private int malop;
    private String kyhoc;
    private int sotinchi;

    public DangKy(int masv, int malop, String kyhoc, int sotinchi) {
        this.masv = masv;
        this.malop = malop;
        this.kyhoc = kyhoc;
        this.sotinchi = sotinchi;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(String kyhoc) {
        this.kyhoc = kyhoc;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
}
