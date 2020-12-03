package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.alkemy.models.entity.DayHourHand;

public interface IDayHourHandRepository extends JpaRepository<DayHourHand, Integer> {

}
