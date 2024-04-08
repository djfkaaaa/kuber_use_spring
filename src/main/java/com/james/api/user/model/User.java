package com.james.api.user.model;


import com.james.api.article.model.Article;
import com.james.api.common.BaseEntitiy;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
@ToString(exclude = {"id"})
public class User extends BaseEntitiy {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String job;

    @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY)
    private List<Article> articles;

//    @Builder(builderMethodName = "builder")
//    public User(Long id,String username,String password, String name, String phoneNumber, String job){
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.job = job;
//    }




}
