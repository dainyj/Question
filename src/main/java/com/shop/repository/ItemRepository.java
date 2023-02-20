package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm); // find(엔티티이름)By변수이름  ==> where x .ItemNm = ?1

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail); // Or

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

}
