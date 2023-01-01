package br.com.rotacilio.payment_manager.pmapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Card")
@Table(name = "tb_cards")
public class CardEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private long id;

    @Column(name = "card_name")
    private String name;
}
