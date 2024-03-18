package org.example.unitTesting.unittesting.Repository;

import org.example.unitTesting.unittesting.Model.item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<item,Integer> {



}
