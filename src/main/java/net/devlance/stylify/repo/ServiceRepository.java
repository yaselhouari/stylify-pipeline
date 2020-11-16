package net.devlance.stylify.repo;

import net.devlance.stylify.domain.Service;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ServiceRepository extends CrudRepository<Service, Integer> {
    //Operations

    //Service save(Service s);
    //Iterable<Service> saveAll(Iterable<Service> iterable);

    //void deleteById(Integer id);
    //void delete(Service s);
    //void deleteAll(Iterable<Service> iterable);
    //void deleteAll();


    //Optional<Service> findById(Integer id);
    //boolean existsById(Integer id);
    //Iterable<Service> findAll();
    //Iterable<Service> findAllById(Iterable<Integer> iterable);
    //long count();


}
