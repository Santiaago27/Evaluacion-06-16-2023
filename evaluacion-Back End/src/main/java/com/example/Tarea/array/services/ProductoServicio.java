package com.example.Tarea.array.services;

import com.example.Tarea.array.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
    public class ProductoServicio {
    public List<Producto> p = new ArrayList<>();

    public ProductoServicio() {
        p.add(new Producto("A1", "Leche", "Lacteos", 4000, 1));
        p.add(new Producto("A2", "Hamburguesa", "Comida", 6000, 2));
        p.add(new Producto("A3", "Camisa", "Ropa", 20000, 1));
        p.add(new Producto("A4", "Galletas", "Comida", 1000, 4));
        p.add(new Producto("A5", "Barrilete", "Dulces", 500, 1));
    }

    public List<Producto> listarProductos() {
        return p;
    }

    public Producto buscarProducto(String numref) {
        for (Producto producto : p) {
            if (producto.getNumref().equals(numref)) {
                return producto;
            }
        }
        return null;
    }

    public void actualizarPrecios() {
        for (Producto producto : p) {
            int cantidad= producto.getCant();
            int precioActual = producto.getPreciou();
            int aumento = (int) (precioActual * (cantidad * 0.1));
            int nuevoPrecio = precioActual + aumento;
            producto.setPreciou(nuevoPrecio);
        }
    }

}
