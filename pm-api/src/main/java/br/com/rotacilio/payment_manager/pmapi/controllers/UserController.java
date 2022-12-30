package br.com.rotacilio.payment_manager.pmapi.controllers;

import br.com.rotacilio.payment_manager.pmapi.models.entities.UserEntity;
import br.com.rotacilio.payment_manager.pmapi.models.payloads.PostUserPayload;
import br.com.rotacilio.payment_manager.pmapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseBody
    public UserEntity createUser(@RequestBody PostUserPayload payload) {
        return service.createNewUser(payload);
    }

    @GetMapping("/{userId}")
    public UserEntity getUser(@PathVariable("userId") long userId) {
        Optional<UserEntity> result = service.getUserById(userId);
        return result.orElseGet(result::get);
    }
}
