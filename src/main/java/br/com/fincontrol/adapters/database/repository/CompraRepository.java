package br.com.fincontrol.adapters.database.repository;

import br.com.fincontrol.adapters.database.representation.CompraData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<CompraData, Integer> {


}
