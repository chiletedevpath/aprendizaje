package com.chiletedevpath.productos.repository;

import com.chiletedevpath.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
