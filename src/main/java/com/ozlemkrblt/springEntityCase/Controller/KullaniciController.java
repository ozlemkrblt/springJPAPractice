package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.Kullanici;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KullaniciController {

        private final KullaniciService kullaniciService;



    @RequestMapping(value = "/kullanicilar")
        public List<Kullanici> getAllKullanicilar()
        {
            return kullaniciService.getAllKullanicilar();
        }


        @RequestMapping(value = "/kullanicilar/{id}")
        public Optional<Kullanici> getKullanici(@PathVariable Long id) {
            return kullaniciService.getKullanici(id);
        }


        @RequestMapping(value = "/kullanicilar", method= RequestMethod.POST)
        public void addKullanici(@RequestBody Kullanici kullanici) {
            kullaniciService.addKullanici(kullanici);
        }

        @RequestMapping(value = "/kullanicilar/{id}", method = RequestMethod.PUT)
        public void updateKullanici@RequestBody Kullanici kullanici,@PathVariable Long id ) {
            kullaniciService.updateKullanici(id, kullanici);
        }

        @RequestMapping(value = "/kullanicilar/{id}", method = RequestMethod.DELETE)
        public void deleteKullanicit(@PathVariable Long id) {
            kullaniciService.deleteKullanici(id);

        }
        public void updateKullanici(Long id, Kullanici kullanici) {
            kullaniciRepository.save(kullanici);
    }
    public void deleteKullanici(Long id) {
        kullaniciRepository.deleteById(id);
    }
}
