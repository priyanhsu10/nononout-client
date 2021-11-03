package com.app;

import com.app.services.AccountService;
import com.app.services.IAccountService;
import nanonout.ioc.IServiceCollection;
import nanonout.pipeline.AppPipeLineBuilder;
import nanonout.pipeline.mildlewares.AppStartup;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("*")
public class Startup extends AppStartup {


    public Startup() {
        super("com.app.Startup");
    }

    @Override
    public void configureServices(IServiceCollection iServiceCollection) {
        iServiceCollection.AddRequestScope(IAccountService.class, AccountService.class);
    }

    @Override
    public void configurePipeline(AppPipeLineBuilder app) {
        app.useExceptionHandler();
        //app.useStatic()


        //

        app.useEndPointSelector();

        //app.useAuthositaion()


        app.useExecuteEndpoint();


    }
}
