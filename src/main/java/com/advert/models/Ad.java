package com.advert.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String owner;

    public String title;

    public String description;

    public BigDecimal price;

    public Ad(){

    }

    public Ad(int id, String owner, String title, String description, BigDecimal price) {
        this.id = id;
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ad{");
        sb.append("id=").append(id);
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
