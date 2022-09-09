package com.ozlemkrblt.springEntityCase.Controller;
import com.ozlemkrblt.springEntityCase.Model.Urun;
import com.ozlemkrblt.springEntityCase.Model.UrunRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UrunService {
    public UrunRepository urunRepository;


    public List<Urun> getAllUrunler() {

        List<Urun> urunler = new ArrayList<>();

        urunRepository.findAll()
                .forEach(urunler::add);

        return urunler;
    }

    public void addUrun(Urun urun) {
       urunRepository.save(urun);
    }

    public Optional<Urun> getUrun(Long id) {
        return urunRepository.findById(id);
    }
    public void updateUrun(Long id, Urun urun) {
        urunRepository.save(urun);
    }
    public void deleteUrun(Long id) {
        urunRepository.deleteById(id);
    }

}
