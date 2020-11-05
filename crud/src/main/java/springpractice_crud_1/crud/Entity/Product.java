package springpractice_crud_1.crud.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
//    @Getter
//    @Setter
    private int id;
//    @Getter
//    @Setter
    private String name;
//    @Getter
//    @Setter
    private int quantity;
//    @Getter
//    @Setter
    private double price;

}
