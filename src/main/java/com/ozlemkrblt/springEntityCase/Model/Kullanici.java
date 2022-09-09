package com.ozlemkrblt.springEntityCase.Model;

import javax.persistence.*;

@Entity(name = "Kullanici")
@Table(name="Kullanici",
        uniqueConstraints = {
        @UniqueConstraint(name="kullanici_email_unique",
                        columnNames="e_mail")
        })
public class Kullanici {

    @Id
    @SequenceGenerator(
            name = "kullanici_seq",
            sequenceName = "kullanici_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "kullanici_seq"
    )
    @Column(
            name="id",
            updatable = false
    )
    private Long id;
    @Column(
            name="ad",
            nullable = false,
            length = 50
    )
    private String ad;
    @Column(
            name="soyad",
            nullable = false,
            length = 50
    )
    private String soyad;
    @Column(
            name="e_mail",
            nullable = false,
            length = 50
    )
    private String e_mail ;
    @Column(
            name="telefon",
            nullable = false,
            length = 15,
            unique = true
    )
    private String telefon;

    public Kullanici(String ad, String soyad, String e_mail, String telefon) {

        this.ad = ad;
        this.soyad = soyad;
        this.e_mail = e_mail;
        this.telefon = telefon;
    }

    public Kullanici() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
