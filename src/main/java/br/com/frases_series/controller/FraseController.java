package br.com.frases_series.controller;

import br.com.frases_series.dto.FraseDTO;
import br.com.frases_series.service.FraseResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FraseController {

    @Autowired
    private FraseResponseService fraseResponseService;

    @GetMapping(value = "/series/frases")
    public FraseDTO obterFraseAleatoria(){
        //var limit = PageRequest.of(0, 1);
        return fraseResponseService.obterFraseAleatoria();
    }

}
