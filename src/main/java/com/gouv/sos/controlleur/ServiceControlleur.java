package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Service;
import com.gouv.sos.service.serviceImpl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serviceSOS")
public class ServiceControlleur {
    @Autowired
    private ServiceServiceImpl serviceService;

    private Service service = new Service();

    // Permet d'obtenir la liste des services pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Service>> getAllService(){
        List<Service> services = serviceService.getAllService();
        return ResponseEntity.ok().body(services);
    }

    // Permet d'obtenir la liste des informations des services pour une entreprise
    @GetMapping("/list/idService")
    @ResponseBody
    public ResponseEntity<List<Service>> getAllServiceEntreprise(@PathVariable(value = "idService") Long idService) throws ResourceNotFoundException{
        List<Service> services = serviceService.getAllServiceEntreprise(idService);
        return ResponseEntity.ok().body(services);
    }

    // Permet d'obtenir un service en envoyant l'identifiant
    @GetMapping("/idService")
    public ResponseEntity<Service> getContact(@PathVariable(value = "idService") Long idService) throws ResourceNotFoundException {
        service = serviceService.getService(idService);
        return ResponseEntity.ok().body(service);
    }

    // Permet d'ajouter un service
    @PostMapping
    public ResponseEntity<Service> addContact(@RequestBody Service service){
        return ResponseEntity.ok().body(serviceService.addService(service));
    }

    // Permet de Modifier un service en envoyant sont identifiant
    @PutMapping("/idService")
    public  ResponseEntity<Service> updateService(@PathVariable(value = "idService") Long idService, @RequestBody Service serviceRequest) throws ResourceNotFoundException{
        serviceRequest.setIdService(idService);
        return ResponseEntity.ok().body(serviceService.updateService(serviceRequest));
    }

    // Permet de Supprimer un service en specifiant l'identifiant
    @DeleteMapping("/idService")
    public String deleteContact(@PathVariable(value = "idService") Long idService){
        serviceService.deleteService(idService);
        return "ok";
    }
}
