package com.cristobal.alkemy.models.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cristobal.alkemy.models.entity.DayHourHand;

public interface IDayHourHandRepository extends JpaRepository<DayHourHand, Integer> {

	@Query(value = "SELECT * FROM day_hour_hand where day_id = ? and hour_hand_id = ?", nativeQuery = true)
	DayHourHand obtenerDayHourHandPorCampos(int idDay, int idHourHand);
	

	@Query(value = "SELECT count(*) FROM day_hour_hand d " +
			"JOIN subject s ON d.day_hour_hand_id = s.day_hour_hand_id " +
			"join subject_user su on s.subject_id = su.subject_id " +
			"join users u on su.user_id = u.user_id " +
			"where u.user_id=? and d.day_hour_hand_id=?", nativeQuery = true)
	int horarioAlumno(int IdUser, int idDayHourHand);

}
