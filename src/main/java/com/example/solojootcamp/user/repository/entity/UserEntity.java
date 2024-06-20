package com.example.solojootcamp.user.repository.entity;

import com.example.solojootcamp.common.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String password;

    private String nickname;

    @Builder(builderMethodName = "sign", buildMethodName = "up")
    public UserEntity(String name, String email, String password, String nickname) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
