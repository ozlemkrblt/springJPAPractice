package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.Kullanici;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KullaniciController {

        private  KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }


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
        public void updateKullanici(@RequestBody Kullanici kullanici,@PathVariable Long id) {
            kullaniciService.updateKullanici(id, kullanici);
        }

        @RequestMapping(value = "/kullanicilar/{id}", method = RequestMethod.DELETE)
        public void deleteKullanicit(@PathVariable Long id) {
            kullaniciService.deleteKullanici(id);

        }

}
