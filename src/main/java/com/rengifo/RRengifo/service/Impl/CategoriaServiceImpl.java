/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rengifo.RRengifo.service.Impl;

import com.rengifo.RRengifo.entity.Categoria;
import com.rengifo.RRengifo.repository.CategoriaRepository;
import com.rengifo.RRengifo.service.CategoriaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    /*sobre escribir un metodo*/
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
