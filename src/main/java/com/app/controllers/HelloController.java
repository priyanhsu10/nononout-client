package com.app.controllers;


import nanonout.actionresults.IActionResult;
import nanonout.endpointrouting.ControllerBase;
import nanonout.endpointrouting.annotations.Delete;
import nanonout.endpointrouting.annotations.Get;
import nanonout.endpointrouting.annotations.Post;
import nanonout.endpointrouting.annotations.Put;

public class HelloController  extends ControllerBase {
    @Get(path = "/")
    public IActionResult get() {
        TestModel t= new TestModel();
        t.setId(1);
        t.setName("priyanshu");
        t.setAge(30);
        modelState.put("test",t);
        return view("index.jsp");
    }
    @Post(path = "/hello")
    public String post(String name){
        return "this is post "+name;
    }
    @Put(path = "/helloupdate")
    public String put(String name){
        return "this is post "+name;
    }
    @Delete(path = "/helloDelete")
    public String delete(String name){
        return "this is post "+name;
    }



}
