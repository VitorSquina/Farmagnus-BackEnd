package com.farmagnus.farmagnus.repository;

import com.farmagnus.farmagnus.Medicamento.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
