package com.example.solojootcamp.user.service.dto;

import com.example.solojootcamp.user.repository.entity.UserEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AddUser {
    private String name;
    private String nickname;
    private String password;
    private String email;

    public UserEntity of(){
        return UserEntity.sign()
                .email(this.email)
                .name(this.name)
                .nickname(this.nickname)
                .password(this.password)
                .up();
    }
}
