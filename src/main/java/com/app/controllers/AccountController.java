package com.app.controllers;

import com.app.services.IAccountService;
import nanonout.endpointrouting.ControllerBase;
import nanonout.endpointrouting.annotations.*;

import java.util.List;

@Route(path = "/account")
public class AccountController extends ControllerBase {
    private IAccountService iAccountService;

    public AccountController(IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }

    @Get(path = "/:id")
    public TestModel get(int id) {
        return iAccountService.get(id);
    }
    @Get(path = "/")
    public List<TestModel> getAll() {
        return iAccountService.getAll();
    }

    @Post
    public TestModel post(TestModel model){
        return iAccountService.add(model);

    }
    @Put(path = "/:id")
    public TestModel put(TestModel model,int id){
        model.setId(id);
        return iAccountService.update(model);
    }
    @Delete(path = "/:id")
    public String delete(int id){

        iAccountService.delete(id);
        return "delete successful";
    }
}
