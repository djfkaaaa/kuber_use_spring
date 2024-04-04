package com.james.api.user;

import com.james.api.common.component.MessengerVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    private final UserRepository repository;

    @PostMapping("/api/login")
    public Map<String,?> login(@RequestBody Map<?,?> paraMap){
        Map<String, MessengerVo> resMap = new HashMap<>();
        String username = (String) paraMap.get("username");
        String pw = (String) paraMap.get("password");
        User optUser = repository.findByUsername(username).orElse(null);
        if (optUser == null){
//            resMap.put("message", MessengerVo.FAIL);
        } else if (!optUser.getPassword().equals(pw)) {
//            resMap.put("message", MessengerVo.WRONG_PASSWORD);
        } else {
//            resMap.put("message", MessengerVo.SUCCESS);
        }
        return resMap;
    }

    @PostMapping(path = "/api/user")
    public Map<String, ?> join(@RequestBody Map<String, ?> paramMap){
       User newUser = repository.save (User.builder()
                .username((String) paramMap.get("username"))
                .password((String) paramMap.get("password"))
                .name((String) paramMap.get("name"))
                .phoneNumber((String) paramMap.get("phoneNumber"))
                .job((String) paramMap.get("job"))
                .build());
        System.out.println("db에 저장된 정보 = " + newUser );
        Map<String, MessengerVo> mapp = new HashMap<>();
//        mapp.put("messege", MessengerVo.SUCCESS);
        return mapp;
    }



    public Map<String,?>  addUsers() {
        return null;
    }    @GetMapping("/api/all-users")
    public Map<String, ?> findAllUsers(){
        Map<String, Object> map = new HashMap<>();
        List<User> list = new ArrayList<>();
        list = repository.findAll();
        map.put("result", list);
        return map;
    }


    public Map<String,?>  save(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?>  delete(@RequestBody Map<String,?> map) {
        return null;
    }
    public Map<String,?>  findAll() throws SQLException {return null;}
    public Map<String,?>  findById(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?>  existsById(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?>  findUsersByName(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?>  findUsersByJob(@RequestBody Map<String,?> map) {
        return null;
    }
    public String count() {
        return null;
    }
    public Map<String,?>  updatePassword(@RequestBody Map<String,?> map){
        return null;
    }



    public Optional<User> getOne(@RequestBody Map<String,?> map) {
        return null;
    }
    public Map<String, ?> getUserMap(){
        return null;
    }
    public MessengerVo putUsers(@RequestBody Map<String,?> map) throws SQLException {
        return null;
    }
    public MessengerVo createTable() throws SQLException {
        return null;
    }
    public MessengerVo deleteTable() throws SQLException {
        return null;
    }
}
