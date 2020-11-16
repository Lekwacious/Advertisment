package com.advert.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;



@Entity
@Getter
@EqualsAndHashCode
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull(message = "Who is the owner of this ad?")
    public String owner;

    @NotNull(message = "Please, add a title for your ad")
    @Size(min =5, max = 140, message = "Titles must have between {min} and {max} characters.")
    public String title;

    @NotNull(message = "Please, add a description for your ad.")
    @Size(min = 5, max = 500, message = "Description must have between {min} and {max} characters.")
    public String description;


    @Min(message = "Price cannot be negative", value = 0)
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
