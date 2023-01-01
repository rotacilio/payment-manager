package br.com.rotacilio.payment_manager.pmapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "ExpenseType")
@Table(name = "tb_expenses_types")
public class ExpenseTypeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exty_id")
    private long id;

    @Column(name = "exty_description")
    private String description;
}
