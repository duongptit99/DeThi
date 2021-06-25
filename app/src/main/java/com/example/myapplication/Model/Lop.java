package com.example.myapplication.Model;

public class Lop {
    private int malop;
    private String tenlop;
    private String mota;

    public Lop(int malop, String tenlop, String mota) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.mota = mota;
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
