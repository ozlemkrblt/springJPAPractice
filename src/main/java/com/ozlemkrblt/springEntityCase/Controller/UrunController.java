package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.Urun;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UrunController {

        private final UrunService urunService;

    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }


    @RequestMapping(value = "/urunler")
        public List<Urun> getAllUrunler()
        {
            return urunService.getAllUrunler();
        }


        @RequestMapping(value = "/urunler/{id}")
        public Optional<Urun> getUrun(@PathVariable Long id) {
            return urunService.getUrun(id);
        }


        @RequestMapping(value = "/urunler", method= RequestMethod.POST)
        public void addUrun(@RequestBody Urun urun) {
            urunService.addUrun(urun);
        }

        @RequestMapping(value = "/urunler/{id}", method = RequestMethod.PUT)
        public void updateUrunler(@RequestBody Urun urun,@PathVariable Long id ) {
            urunService.updateUrun(id, urun);
        }

        @RequestMapping(value = "/urunler/{id}", method = RequestMethod.DELETE)
        public void deleteUrun(@PathVariable Long id) {
            urunService.deleteUrun(id);

        }

}
