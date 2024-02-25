package com.hms.service;

import com.hms.request.DoctorReq;
import com.hms.response.DoctorRes;

public interface IDoctorService {

 DoctorRes registerDoctor(DoctorReq doctorReq);

}
