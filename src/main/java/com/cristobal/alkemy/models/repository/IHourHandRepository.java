package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristobal.alkemy.models.entity.HourHand;

@Repository
public interface IHourHandRepository extends JpaRepository<HourHand, Integer> {

}
