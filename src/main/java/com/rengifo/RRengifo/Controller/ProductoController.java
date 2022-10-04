/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rengifo.RRengifo.Controller;

import com.rengifo.RRengifo.entity.Producto;
import com.rengifo.RRengifo.service.ProductoService;
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
@RequestMapping("/producto")
@Api(value = "Microservicio de gestión de productos", description = "Microservicio de gestión")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @ApiOperation(value = "Lista una producto")
    @GetMapping("/all")
    public List<Producto> findAll() {
        return productoService.findAll();

    }

    @ApiOperation(value = "Obtiene una producto")
    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        return ResponseEntity.ok(producto);
    }

    @ApiOperation(value = "Crea una producto")
    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
        /*guardar*/
    }

    @ApiOperation(value = "Modifica una producto")
    @PutMapping("/update")
    public Producto update(@RequestBody Producto producto) {
        return productoService.save(producto);/*modifica*/
    }

    @ApiOperation(value = "Elimina una producto")
    @DeleteMapping("/{id}")
    public void delteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }

}
