package projetodiomicroservice.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;
import projetodiomicroservice.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
