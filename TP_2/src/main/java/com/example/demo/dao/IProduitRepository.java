package com.example.demo.dao;

import java.util.List;





import com.example.demo.entities.Produit;

public interface IProduitRepository extends MongoRepository<Produit,Long> {
//@Query("select p from Produit p where p.designation like :x")
//public Page<Produit> produitParMc(@Param("x")String mc, Pageable p);
//public List<Produit> findByDesignation(String des);
//public Page<Produit> produitParMc(String des, Pageable p);

}
