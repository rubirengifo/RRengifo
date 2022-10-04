/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rengifo.RRengifo.Controller;

import com.rengifo.RRengifo.entity.Categoria;
import com.rengifo.RRengifo.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACER
 */
@RestController
@RequestMapping("/categoria")
@Api(value = "Microservicio de gestión de categoria", description ="Microservicio de gestión")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;

@ApiOperation(value = "Lista una categoria")
    @GetMapping("/all")
    public List<Categoria> findAll() {
        return categoriaService.findAll();

    }
@ApiOperation(value = "Obtiene una categoria")
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria );
    }

@ApiOperation(value = "Crea una categoria")
    @PostMapping("/save")
    public Categoria  save(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
        /*guardar*/
    }

@ApiOperation(value = "Modifica una categoria")
    @PutMapping("/update")
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);/*modifica*/
    }

@ApiOperation(value = "Elimina una categoria")
    @DeleteMapping("/{id}")
    public void delteById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }
}
