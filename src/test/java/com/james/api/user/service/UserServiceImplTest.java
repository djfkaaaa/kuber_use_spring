package com.james.api.user.service;

import com.james.api.common.component.MessengerVo;
import com.james.api.user.model.UserDto;
import com.james.api.user.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserServiceImplTest {


    @Autowired
    UserService service;

    @Test
    @DisplayName("유저 수")
    void count() {
        long usercount = service.count();
        assertThat(usercount).isEqualTo(20L);
        System.out.println("유저수 = " + usercount);
    }

    @Test
    @DisplayName("회원가입")
    void save() {
        UserDto dto = new UserDto();
        MessengerVo messengerVo = service.save(dto);
        assertThat(messengerVo.getMessage()).isEqualTo("Success");
        System.out.println("결과 = " + messengerVo);
        //??????
    }

    @Test
    @DisplayName("삭제")
    void deleteById() {
    }

    @Test
    @DisplayName("상세 유저 리스트")
    void findById() {
        for (int i = 1; i < 21; i++) {
            Long l = Long.valueOf(i);
            System.out.println("상세 유저 리스트 = " + service.findById(l));
        }
    }

    @Test
    @DisplayName("전체 유저 리스트")
    void findAll() {
        System.out.println("전체 리스트 = " + service.findAll());
    }

    @Test
    void login() {

    }
}