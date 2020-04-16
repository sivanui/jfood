package ivan.jfood.controller;

import ivan.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo()
    {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Promo getPromoById(@PathVariable String code) throws PromoNotFoundException {
        Promo promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active)
    {
    Promo promo = null;
    try {
        promo = new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active);
        DatabasePromo.addPromo(promo);
    } catch (PromoCodeAlreadyExistsException p) {
        System.out.println(p.getMessage());
        }
        return promo;
    }
}