/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rengifo.RRengifo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ACER
 */
@Entity
@Data
@Table(name = "producto")
public class Producto {

    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(name = "prod_nombre")
    private String prodNombre;

    @Column(name = "prod_tipo")
    private String prodTipo;

    @Column(name = "prod_fecha_entrega")
    private String prodFechaEntrega;

    @Column(name = "prod_fecha_vencimiento")
    private String prodFechaVencimineto;

    @Column(name = "prod_Precio")
    private String prodPrecio;

    @Column(name = "prod_tamaño")
    private String prodTamaño;

    @Column(name = "prod_marca")
    private String prodMarca;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Categoria categoria;

}
