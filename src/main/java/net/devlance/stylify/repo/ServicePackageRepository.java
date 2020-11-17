package net.devlance.stylify.repo;

import net.devlance.stylify.domain.ServicePackage;
import org.springframework.data.repository.CrudRepository;

public interface ServicePackageRepository extends CrudRepository<ServicePackage, Integer> {

    boolean existsById(String code);

    ServicePackage save(ServicePackage servicePackage);

    Iterable<ServicePackage> findAll();
}
