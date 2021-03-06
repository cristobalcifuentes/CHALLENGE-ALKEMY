package com.cristobal.alkemy.service.interfaces;

import com.cristobal.alkemy.models.entity.DayHourHand;

public interface IDayHourHandService extends ICRUDService<DayHourHand> {
	
	DayHourHand obtenerDayHourHandPorCampos(DayHourHand dayHourHand);
	
	int horarioAlumno(int IdUser, int idDayHourHand);

}
