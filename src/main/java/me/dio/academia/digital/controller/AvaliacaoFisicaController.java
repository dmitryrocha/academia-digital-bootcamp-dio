package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvalaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Avaliações físicas")
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvalaliacaoFisicaServiceImpl service;

    @PostMapping
    @ApiOperation(value = "Registra novas avaliações físicas")
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @GetMapping
    @ApiOperation(value = "Lista todas as avaliações físicas no banco de dados")
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }
}
