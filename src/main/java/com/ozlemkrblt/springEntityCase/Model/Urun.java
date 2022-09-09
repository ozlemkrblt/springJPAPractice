package com.ozlemkrblt.springEntityCase.Model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Urun")
@Table(name= "Urun")
public class Urun{

    @Id
    @SequenceGenerator(
            name = "urun_seq",
            sequenceName = "urun_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "urun_seq"
    )
    @Column(
            name="urunId",
            updatable = false
    )
    private Long urunId;
    @Column(
            name="urunAdi",
            nullable = false,
    )
    private String urunAdi;

    @Column(
            name="fiyat",
            nullable = false,
    )
    private Double fiyat;

    @Column(name="skt")
    private Date skt;

    public Urun(Long urunId, String urunAdi, Double fiyat, Date skt) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.skt = skt;
    }

    public Urun() {

    }

    public Long getUrunId() {
        return urunId;
    }

    public void setId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Date getSkt() {
        return skt;
    }

    public void setSkt(Date skt) {
        this.skt = skt;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "urun id=" + urunId +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                ", skt=" + skt +
                '}';
    }
}
