package springpractice_crud_1.crud.Reponsitoty;

import org.springframework.data.jpa.repository.JpaRepository;
import springpractice_crud_1.crud.Entity.Product;

public interface ProductReponsitory extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
