package br.com.frases_series.service;

import br.com.frases_series.dto.FraseDTO;
import br.com.frases_series.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FraseResponseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria(){
        var f = repository.obterFraseAleatoria().get();
        return new FraseDTO(f.getTitulo(), f.getFrase(),f.getPersonagem(), f.getPoster());
    }

}
