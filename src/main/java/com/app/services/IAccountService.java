package com.app.services;

import com.app.controllers.TestModel;

import java.util.List;

public interface IAccountService {
    public TestModel get(int id);
    public List<TestModel> getAll();
    public  TestModel add(TestModel t);
    public  TestModel update(TestModel t);
    public  void delete(int id);
}
