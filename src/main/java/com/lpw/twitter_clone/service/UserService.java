package com.lpw.twitter_clone.service;

import com.lpw.twitter_clone.dto.User;
import com.lpw.twitter_clone.entity.UserEntity;
import com.lpw.twitter_clone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public List<User> getUsers() {
        List<UserEntity> users = userRepository.findAll();

        return users.stream().map(it -> User.builder().createdAt(it.getCreatedAt()).dob(it.getDob()).email(it.getEmail()).id(it.getId()).build()).collect(Collectors.toList());
    }
}
