package zorrillo.reto2.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import zorrillo.reto2.model.Order;

import java.util.List;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    @Query("{'salesMan.zone':{$eq:'?0'}}")
    public List<Order> getOrderZone(String zone);
}
