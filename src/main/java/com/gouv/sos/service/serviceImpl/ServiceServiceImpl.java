package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Service;
import com.gouv.sos.service.IServiceService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {
    @Override
    public Service getService(Long idService) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Service updateService(Service service) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Service addService(Service service) {
        return null;
    }

    @Override
    public void deleteService(Long idService) {

    }

    @Override
    public List<Service> getAllService() {
        return null;
    }
}
