package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Matrículas")
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @GetMapping
    @ApiOperation(value = "Lista todas as matrículas")
    public List<Matricula> getAll() {
        return service.getAll();
    }

    @GetMapping("bairro")
    @ApiOperation(value = "Lista todas as matrículas pelo bairro do aluno")
    public List<Matricula> getAllByBairro(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAllByBairro(bairro);
    }

    @PostMapping
    @ApiOperation(value = "Registra novas matrículas")
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

}
