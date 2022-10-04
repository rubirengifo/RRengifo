/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rengifo.RRengifo.service;

import com.rengifo.RRengifo.entity.Categoria;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface CategoriaService {

    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria save /*metodo guardar*/(Categoria categoria);

    public void delete(Categoria categoria);

    public void deleteById(Long id);
    
}
