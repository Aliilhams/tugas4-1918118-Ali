package com.example.recycle_1918118;

public class Mhs {
    private String nama,job,quote;
    private int img;
    public Mhs(String nama, String job, String quote, int img){
        this.nama = nama;
        this.job = job;
        this.quote = quote;
        this.img=img;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getQuote(){
        return quote;
    }
    public void setQuote(String clock){
        this.quote = quote;
    }
    public void setImg(){
        this.img=img;
    }
    public int getImg(){
        return img;
    }
}
