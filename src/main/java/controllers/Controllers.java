package controllers;

import jdk.javadoc.internal.doclets.toolkit.util.DocFileIOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import srvice.ConvertCurrency;
import srvice.Currency;

@Controller
public class Controllers {
    @GetMapping("/dispatcher")
    public String dispatcher(){
        return "index";
    }

    //@Autowired ConvertCurrency convertCurrency;

    @PostMapping("/result")
    public String result(@RequestParam double rate , double usd , Model model){
        Currency currency = new ConvertCurrency();
        double result = currency.currency(rate , usd);
        model.addAttribute("result",result);
        return "result";
    }
}

