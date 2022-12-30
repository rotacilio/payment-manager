package br.com.rotacilio.payment_manager.pmapi.repositories;

import br.com.rotacilio.payment_manager.pmapi.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
