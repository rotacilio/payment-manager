package br.com.rotacilio.payment_manager.pmapi.services.impl;

import br.com.rotacilio.payment_manager.pmapi.models.entities.UserEntity;
import br.com.rotacilio.payment_manager.pmapi.models.payloads.PostUserPayload;
import br.com.rotacilio.payment_manager.pmapi.repositories.UserRepository;
import br.com.rotacilio.payment_manager.pmapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserEntity createNewUser(PostUserPayload payload) {
        return repository.save(new UserEntity(payload));
    }

    @Override
    public Optional<UserEntity> getUserById(Long userId) {
        return repository.findById(userId);
    }
}
