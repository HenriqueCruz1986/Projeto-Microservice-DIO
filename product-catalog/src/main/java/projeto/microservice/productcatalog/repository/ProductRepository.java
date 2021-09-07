package projeto.microservice.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import projeto.microservice.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
