package br.com.rotacilio.payment_manager.pmapi.models.entities;

import br.com.rotacilio.payment_manager.pmapi.models.payloads.PostUserPayload;
import br.com.rotacilio.payment_manager.pmapi.utils.CommonFunctions;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "User")
@Table(name = "tb_users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @Column(name = "user_first_name")
    private String firstName;

    @Column(name = "user_last_name")
    private String lastName;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_active")
    private boolean active;

    @Column(name = "user_created_at")
    private Date createdAt;

    @Column(name = "user_updated_at")
    private Date updatedAt;

    public UserEntity(PostUserPayload payload) {
        this.firstName = payload.getFirstName();
        this.lastName = payload.getLastName();
        this.email = payload.getEmail();
        this.password = CommonFunctions.strToMd5(payload.getPassword());
        this.active = true;
        this.createdAt = new Date();
    }
}
