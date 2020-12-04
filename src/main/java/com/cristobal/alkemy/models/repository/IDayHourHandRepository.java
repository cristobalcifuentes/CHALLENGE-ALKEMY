package com.cristobal.alkemy.models.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cristobal.alkemy.models.entity.DayHourHand;

public interface IDayHourHandRepository extends JpaRepository<DayHourHand, Integer> {

	@Query(value = "SELECT * FROM day_hour_hand where day_id = ? and hour_hand_id = ?", nativeQuery = true)
	DayHourHand obtenerDayHourHandPorCampos(int idDay, int idHourHand);

}
