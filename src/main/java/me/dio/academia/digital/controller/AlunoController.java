package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Alunos")
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    @ApiOperation(value = "Lista todos os alunos")
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @GetMapping("aniversario")
    @ApiOperation(value = "Lista alunos pela data de aniversário")
    public List<Aluno> getAllByDataDeNascimento(@RequestParam(value = "dataDeNascimento",required = false) String dataDeNascimento) {
        return service.getAllByDataDeNascimento(dataDeNascimento);
    }

    @PostMapping
    @ApiOperation(value = "Registra novos alunos")
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("avaliacoes/{id}")
    @ApiOperation(value = "Lista as avaliações físicas feitas por determinado aluno")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }
}
