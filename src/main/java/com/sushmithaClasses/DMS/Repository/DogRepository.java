package com.sushmithaClasses.DMS.Repository;
import java.util.List;

/*
 * @author Sushmitha Vadhireddy-S570745
 */
import org.springframework.data.repository.CrudRepository;

import com.sushmithaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
      List<Dog> findByName(String name);
}
