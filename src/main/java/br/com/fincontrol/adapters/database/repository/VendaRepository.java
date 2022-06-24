package br.com.fincontrol.adapters.database.repository;

import br.com.fincontrol.adapters.database.representation.VendaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<VendaData, Integer> {


}
