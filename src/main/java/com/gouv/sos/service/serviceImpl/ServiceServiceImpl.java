package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Service;
import com.gouv.sos.repository.IServiceRepository;
import com.gouv.sos.service.IServiceService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {

    private final IServiceRepository serviceRepository;

    public ServiceServiceImpl(IServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public Service getService(Long idService) throws ResourceNotFoundException {
        return serviceRepository.findById(idService).orElseThrow(()->new ResourceNotFoundException("Cette service n'existe pas"));
    }

    @Override
    public Service updateService(Service service) throws ResourceNotFoundException {
        return serviceRepository.save(service);
    }

    @Override
    public Service addService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long idService) {
        serviceRepository.deleteById(idService);
    }

    @Override
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public List<Service> getAllServiceEntreprise(Long idService) throws ResourceNotFoundException {
        return serviceRepository.AllServices(idService);
    }
}
