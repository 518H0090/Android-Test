package com.example.thunghiemcustomlistview;

public class HaHa {
    private String name;
    private int tuoi;
    private int Img;

    public HaHa(String name, int tuoi, int img) {
        this.name = name;
        this.tuoi = tuoi;
        Img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
