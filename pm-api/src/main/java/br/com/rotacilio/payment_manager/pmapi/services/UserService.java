package br.com.rotacilio.payment_manager.pmapi.services;

import br.com.rotacilio.payment_manager.pmapi.models.entities.UserEntity;
import br.com.rotacilio.payment_manager.pmapi.models.payloads.PostUserPayload;

import java.util.Optional;

public interface UserService {
    UserEntity createNewUser(PostUserPayload payload);
    Optional<UserEntity> getUserById(Long userId);
}
