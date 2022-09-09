package com.ozlemkrblt.springEntityCase.Model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "UrunYorum")
@Table(name="UrunYorum")
public class UrunYorum {

    @Id
    @SequenceGenerator(
            name = "uYorum_seq",
            sequenceName = "uYorum_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "uYorum_seq"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "uYorum",
            nullable = false,
            length = 500
    )
    private String uYorum;


    @Column(name = "yorumTarihi")
    private Date yorumTarihi;


    @OneToOne
    @JoinColumn(
            name = "urunId",referencedColumnName="urunID")
    private Long urunId;

    @ManyToOne
    @JoinColumn(
            name = "kullaniciId",referencedColumnName="kullaniciId")
    private Long kullaniciId;


    public UrunYorum(Long id, String uYorum, Date yorumTarihi, Long urunId, Long kullaniciId) {
        this.id = id;
        this.uYorum = uYorum;
        this.yorumTarihi = yorumTarihi;
        this.urunId = urunId;
        this.kullaniciId = kullaniciId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getuYorum() {
        return uYorum;
    }

    public void setuYorum(String uYorum) {
        this.uYorum = uYorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public Long getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Long kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", uYorum='" + uYorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                ", urunId=" + urunId +
                ", kullaniciId=" + kullaniciId +
                '}';
    }
}