package springboot.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.data.GroceryItem;
import springboot.data.GroceryStore;
import springboot.data.ShopperPerson;

/**
 * Created by WagnerMestrinho on 2/3/17.
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class GroceryRepositoryTest {

    @Autowired
    GroceryItemRepository itemRepository;

    @Autowired
    GroceryStoreRepository storeRepository;

    @Autowired
    ShopperPersonRepository personRepository;


    @Test
    public void testSaveItem() {
        GroceryItem tmp = new GroceryItem();
        tmp.setName("beans");
        tmp.setPrice(2);
        tmp.setType("goods");
        tmp.setIsle(7);
        itemRepository.save(tmp);

        GroceryItem found = itemRepository.findOne(tmp.getId());
        Assert.assertEquals(tmp.getName(), found.getName());
        Assert.assertEquals(tmp.getPrice(), found.getPrice());
        Assert.assertEquals(tmp.getType(), found.getType());
        Assert.assertEquals(tmp.getIsle(), found.getIsle());
    }
     @Test
     public void testSaveStore(){
            GroceryStore tmp = new GroceryStore();
            tmp.setName("bazaar");
            tmp.setAddress("266 Vineland Rd.");
            tmp.setOpen("10 AM");
            tmp.setClose("10 PM");
            storeRepository.save(tmp);

            GroceryStore found = storeRepository.findOne(tmp.getId());
            Assert.assertEquals(tmp.getName(), found.getName());
            Assert.assertEquals(tmp.getAddress(), found.getAddress());
            Assert.assertEquals(tmp.getOpen(), found.getOpen());
            Assert.assertEquals(tmp.getClose(), found.getClose());
     }
     @Test
    public void testSavePerson(){
         ShopperPerson tmp = new ShopperPerson();
         tmp.setName("Bob");
         tmp.setAge(35);
         tmp.setMartial('M');
         tmp.setDiet("vegan");
         personRepository.save(tmp);

         ShopperPerson found = personRepository.findOne(tmp.getId());
         Assert.assertEquals(tmp.getName(), found.getName());
         Assert.assertEquals(tmp.getAge(), found.getAge());
         Assert.assertEquals(tmp.getMartial(), found.getMartial());
         Assert.assertEquals(tmp.getDiet(), found.getDiet());

     }












    }


