package springpractice_crud_1.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springpractice_crud_1.crud.Entity.Product;
import springpractice_crud_1.crud.Reponsitoty.ProductReponsitory;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductReponsitory responsitory;
    public Product saveProduct(Product product){
        return responsitory.save(product);
    }

    public List<Product> saveAllProduct(List<Product> products){
        return responsitory.saveAll(products);
    }

    public List<Product> findProduct(){
        return responsitory.findAll();
    }

    public Product getProductById(int id){
        return responsitory.findById(id).orElse(null);
    }

    public Product findProductbyName(String name){
        return responsitory.findByName(name);
    }

    public String delete(int id){
        responsitory.deleteById(id);
        return "product removed!";
    }

    public Product updateProduct(Product product){
        Product existingProduct=responsitory.findById(product.getId()).orElse(null);
        assert existingProduct != null;
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return responsitory.save(existingProduct);
    }


}
