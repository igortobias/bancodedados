package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.DadoscadastrarRemedio;
import com.remedios.igor.aula.enums.Via;
import com.remedios.igor.aula.model.Laboratorio;
import com.remedios.igor.aula.model.Remedio;
import com.remedios.igor.aula.dtos.DadosListarRemedio;
import com.remedios.igor.aula.dtos.DadosatualizarRemedio;
import com.remedios.igor.aula.repository.LaboratotioRepo;
import com.remedios.igor.aula.repository.RemedioRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class RemedioService {

    @Autowired
    private RemedioRepository repository;

    @Autowired
    private LaboratotioRepo laboratotioRepo;

    public Remedio criar(Remedio remedio){
        return repository.save(remedio);
    }

    public void create(DadoscadastrarRemedio dto){
        Remedio remedio;

        Laboratorio laboratorio = laboratotioRepo.findById(dto.laboratorioId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Laboratorio nao existe"));

        remedio = new Remedio();
        remedio.setNome(dto.nome());
        remedio.setLote(dto.lote());
        remedio.setValidade(dto.validade());
        remedio.setQuantidade(dto.quantidade());
        remedio.setVia(dto.via());
        remedio.setLaboratorio(laboratorio);

        criar(remedio);
    }

    public List<DadosListarRemedio> listar(Via via){
        List<Remedio> remedios;

        if (via != null){
            remedios = repository.findByVia(via);
        }else {
            remedios = repository.findAll();
        }

        List<DadosListarRemedio> list = new ArrayList<>();
        for (Remedio remedio : remedios){
            DadosListarRemedio listarRemedio = new DadosListarRemedio(
                    remedio.getId(),
                    remedio.getNome(),
                    remedio.getVia(),
                    remedio.getLote(),
                    remedio.getValidade()
            );
            list.add(listarRemedio);
        }
        return list;
    }

    public void atualizar(DadosatualizarRemedio dados) {
        Remedio remedio = repository.findById(dados.id())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Remedio nao encontrado"));

        remedio.setNome(dados.nome());
        remedio.setLote(dados.lote());
        remedio.setValidade(dados.validade());
        remedio.setQuantidade(dados.quantidade());
        remedio.setVia(dados.via());

        criar(remedio);
    }

    public void deletarById(Long id) {
        Remedio remedio = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Remedio nao encontrado"));

       repository.delete(remedio);
    }

    // Atualização parcial de um recurso
    public Remedio atualizarParcialmente(Long id, Remedio remedioAtualizacao) {
        // Busca o remédio pelo ID
        Remedio remedioExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Remédio não encontrado"));

        // Atualiza apenas os campos fornecidos
        if (remedioAtualizacao.getNome() != null) {
            remedioExistente.setNome(remedioAtualizacao.getNome());
        }

        if (remedioAtualizacao.getNome() != null) {
            remedioExistente.setNome(remedioAtualizacao.getNome());
        }

        if (remedioAtualizacao.getLote() != null) {
            remedioExistente.setLote(remedioAtualizacao.getLote());
        }

        // Salva as alterações e retorna o recurso atualizado
        return repository.save(remedioExistente);
    }
 }

 
