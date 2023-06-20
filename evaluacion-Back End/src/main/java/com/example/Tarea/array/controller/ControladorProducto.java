package com.example.Tarea.array.controller;

import com.example.Tarea.array.entity.Producto;
import com.example.Tarea.array.services.ProductoServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class ControladorProducto {
    private ProductoServicio services;

    public ControladorProducto(ProductoServicio services) {
        this.services = services;
    }

    @GetMapping("/listarProductos")
    public List<Producto> listaProductos(){
        return services.listarProductos();
    }

    @GetMapping("/buscarProducto/{numref}")
    public Producto buscarProducto(@PathVariable String numref) {
        return services.buscarProducto(numref);
    }

    @PostMapping("/actualizarPrecios")
    public ResponseEntity<String> actualizarPrecios() {
        services.actualizarPrecios();
        return new ResponseEntity<>("Precios actualizados", HttpStatus.OK);
    }


}
