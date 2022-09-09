package com.ozlemkrblt.springEntityCase.Controller;

import com.ozlemkrblt.springEntityCase.Model.UrunYorum;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UrunYorumController {

        private UrunYorumService urunYorumService;



    @RequestMapping(value = "/uYorumlar")
        public List<UrunYorum> getAllUYorumlar()
        {
            return urunYorumService.getAllUYorumlar();
        }


        @RequestMapping(value = "/uYorumlar/{id}")
        public Optional<UrunYorum> getUrunYorum(@PathVariable Long id) {
            return urunYorumService.getUYorum(id);
        }


        @RequestMapping(value = "/uYorumlar", method= RequestMethod.POST)
        public void addUrunYorum(@RequestBody UrunYorum urunYorum) {
            urunYorumService.addUYorum(urunYorum);
        }

        @RequestMapping(value = "/uYorumlar/{id}", method = RequestMethod.PUT)
        public void updateUYorum(@RequestBody UrunYorum urunYorum,@PathVariable Long id) {
            urunYorumService.updateUYorum(id, urunYorum);
        }

        @RequestMapping(value = "/uYorumlar/{id}", method = RequestMethod.DELETE)
        public void deleteUrunYorum(@PathVariable Long id) {
            urunYorumService.deleteUYorum(id);

        }

}
