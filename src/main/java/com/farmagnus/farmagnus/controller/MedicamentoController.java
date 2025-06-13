package com.farmagnus.farmagnus.controller;


import com.farmagnus.farmagnus.Medicamento.Medicamento;
import com.farmagnus.farmagnus.Medicamento.MedicamentoDto;
import com.farmagnus.farmagnus.repository.MedicamentoRepository;
import com.farmagnus.farmagnus.Medicamento.MedicamentoRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
    @Autowired
    MedicamentoRepository repository;

    @PostMapping
    public void saveMedicamento(@RequestBody MedicamentoRequestDto data){
        Medicamento medicamentoData = new Medicamento(data);
        repository.save(medicamentoData);
        return;
    }

    @GetMapping
    public List<MedicamentoDto> getAll(){
        List<MedicamentoDto> medicamentoList = repository.findAll().stream().map(MedicamentoDto::new).toList();
        return medicamentoList;
    }
}
