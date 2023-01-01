package br.com.rotacilio.payment_manager.pmapi.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Expense")
@Table(name = "tb_expenses")
public class ExpenseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expe_id")
    private long id;

    @Column(name = "expe_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "expe_exty_id", referencedColumnName = "exty_id")
    private ExpenseTypeEntity expenseType;

    @ManyToOne
    @JoinColumn(name = "expe_pame_id", referencedColumnName = "pame_id")
    private PaymentMethodEntity paymentMethod;

    @ManyToOne
    @JoinColumn(name = "expe_card_id", referencedColumnName = "card_id")
    private CardEntity card;

    @Column(name = "expe_value")
    private Double value;

    @Column(name = "expe_recurrent")
    private boolean recurrent;

    @Column(name = "expe_quantity_parcel")
    private Integer quantityOfParcels;

    @Column(name = "expe_parcel_value")
    private Double parcelValue;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
