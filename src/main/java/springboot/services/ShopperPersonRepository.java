package springboot.services;

import org.springframework.data.repository.CrudRepository;
import springboot.data.ShopperPerson;

/**
 * Created by WagnerMestrinho on 2/2/17.
 */
public interface ShopperPersonRepository extends CrudRepository<ShopperPerson, Long>{
}
