package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.Kullanici;
import com.ozlemkrblt.springEntityCase.Model.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService {
    public KullaniciRepository kullaniciRepository;


    kullaniciRepository.findAll();

    public List<Kullanici> getAllKullanicilar() {

        List<Kullanici> kullanicilar = new ArrayList<>();

        kullaniciRepository.findAll()
                .forEach(kullanicilar::add);

        return kullanicilar;
    }

    public void addKullanici(Kullanici kullanici) {
       kullaniciRepository.save(kullanici);
    }

    public Optional<Kullanici> getKullanici(Long id) {
        return kullaniciRepository.findById(id);
    }
}
