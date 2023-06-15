package pl.dmuszynski.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dmuszynski.productservice.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
