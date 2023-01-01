package br.com.rotacilio.payment_manager.pmapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "PaymentMethod")
@Table(name = "tb_payment_methods")
public class PaymentMethodEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pame_id")
    private long id;

    @Column(name = "pame_description")
    private String description;
}
