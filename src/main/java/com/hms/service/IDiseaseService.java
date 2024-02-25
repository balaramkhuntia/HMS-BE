package com.hms.service;

import com.hms.model.DiseaseSpecialization;
import com.hms.request.DiseaseSpecializationReq;

public interface IDiseaseService {
	
	DiseaseSpecializationReq saveDiseaseSpecialization(DiseaseSpecialization diseaseSpecialization);

}
