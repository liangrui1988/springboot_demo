package com.pro.xdata.data.repostitory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.xdata.data.bean.User;

@Repository
public class UserRepository {

    public User get(int id){
        User user=new User();
        user.setId(id);
        user.setName("hello you");
        return user;
    }


    public List<User> getList(){
        User user=new User();
        user.setId(100);
        user.setName("hello you");
        User user2=new User();
        user2.setId(100);
        user2.setName("hello you");
        List<User> list=new ArrayList<User>();
        list.add(user);
        list.add(user2);
        return list;
    }
}
