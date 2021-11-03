package com.app.services;

import com.app.controllers.TestModel;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService {
    public static List<TestModel> list = new ArrayList<>();

    @Override
    public TestModel get(int id) {
        return list.stream().filter(x->x.getId()==id).findFirst().orElseThrow(()->new RuntimeException("item not present"));
    }

    @Override
    public List<TestModel> getAll() {
        return  list;
    }

    @Override
    public TestModel add(TestModel t) {
        t.setId(list.size() + 1);
        list.add(t);
        return t;
    }

    @Override
    public TestModel update(TestModel t) {
        TestModel exitsingt = list.stream().filter(x -> x.getId() == t.getId()).findFirst().orElseThrow(() -> new RuntimeException("Item not pressent"));
        exitsingt.setAge(t.getAge());
        exitsingt.setName(t.getName());
        return exitsingt;
    }

    @Override
    public void delete(int id) {
        TestModel exitsingt = list.stream().filter(x -> x.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Item not pressent"));

        list.remove(exitsingt);
    }
}
