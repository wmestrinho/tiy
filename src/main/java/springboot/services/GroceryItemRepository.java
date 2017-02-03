package springboot.services;

import org.springframework.data.repository.CrudRepository;
import springboot.data.GroceryItem;

/**
 * Created by WagnerMestrinho on 2/2/17.
 */
public  interface GroceryItemRepository extends CrudRepository<GroceryItem, Long>{
}
