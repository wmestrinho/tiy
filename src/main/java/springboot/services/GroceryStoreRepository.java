package springboot.services;

import org.springframework.data.repository.CrudRepository;
import springboot.data.GroceryStore;

/**
 * Created by WagnerMestrinho on 2/2/17.
 */
public interface GroceryStoreRepository extends CrudRepository<GroceryStore, Long>{
}
