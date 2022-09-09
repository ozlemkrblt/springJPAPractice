package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.Urun;
import com.ozlemkrblt.springEntityCase.Model.UrunYorum;
import com.ozlemkrblt.springEntityCase.Model.UrunYorumRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UrunYorumService {
    public UrunYorumRepository urunYorumRepository;

    public List<UrunYorum> getAllUYorumlar() {

        List<UrunYorum> uYorumlar = new ArrayList<>();

        urunYorumRepository.findAll().forEach(uYorumlar::add);

        return uYorumlar;
    }

    public void addUYorum(UrunYorum uYorum) {
       urunYorumRepository.save(uYorum);
    }

    public Optional<UrunYorum> getUYorum(Long id) {
        return urunYorumRepository.findById(id);
    }

    public void updateUYorum(Long id, UrunYorum urunYorum) {
        urunYorumRepository.save(urunYorum);
    }
    public void deleteUYorum(Long id) {
        urunYorumRepository.deleteById(id);
    }
}
