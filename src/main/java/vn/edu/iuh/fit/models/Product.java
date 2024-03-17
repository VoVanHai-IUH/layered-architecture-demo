package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Entity @Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name",length = 200, nullable = false)
    private String name;
    private String description;
    private String imagePath;
    private long quantity;//nho nho: khong dung nhu the nay trong thuc te

    public Product(String name, String desc, String imagePath, long quantity) {
        this.name = name;
        this.description = desc;
        this.imagePath = imagePath;
        this.quantity = quantity;
    }
}
