package com.techgear.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techgear.catalogo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
