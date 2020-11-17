package net.devlance.stylify.service;

import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
import net.devlance.stylify.domain.ServicePackage;
import net.devlance.stylify.repo.ServicePackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePackageService {

        private ServicePackageRepository servicePackageRepository;

        @Autowired
        public ServicePackageService(ServicePackageRepository servicePackageRepository) {
            this.servicePackageRepository = servicePackageRepository;
        }

        public ServicePackage createServicePackage(String code, String name) {
            return !servicePackageRepository.existsById(code) ?
                    servicePackageRepository.save(new ServicePackage(code, name)) :
                    null;

        }
        public Iterable<ServicePackage> lookup(){
            return servicePackageRepository.findAll();
        }

        public long total() {
            return servicePackageRepository.count();
        }
}
