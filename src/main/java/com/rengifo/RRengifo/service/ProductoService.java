/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rengifo.RRengifo.service;

import com.rengifo.RRengifo.entity.Producto;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface ProductoService {
    
  public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save /*metodo guardar*/(Producto producto);

    public void delete(Producto producto);

    public void deleteById(Long id);
}
