package br.com.frases_series.repository;

import br.com.frases_series.model.Frase;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase, Long>{

   Optional<Frase>  findById(Long id);

   @Query("SELECT f FROM Frase f " +
           "ORDER BY function('RANDOM') LIMIT 1")
   Optional<Frase> obterFraseAleatoria();
}
