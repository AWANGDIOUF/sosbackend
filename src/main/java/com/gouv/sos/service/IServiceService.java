package com.gouv.sos.service;

import com.gouv.sos.entities.Service;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IServiceService {

    Service getService(Long idService) throws ResourceNotFoundException;
    Service updateService( Service service) throws ResourceNotFoundException;
    Service addService(Service service);
    void deleteService(Long idService);
    List<Service> getAllService();
}
