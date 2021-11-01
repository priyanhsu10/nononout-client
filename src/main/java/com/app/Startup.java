package com.app;

import nanonout.ioc.IServiceCollection;
import nanonout.pipeline.AppPipeLineBuilder;
import nanonout.pipeline.mildlewares.AppStartup;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("*")
public class Startup extends AppStartup
{


    public Startup() {
        super("com.app.Startup");
    }

    @Override
    public void configureServices(IServiceCollection iServiceCollection) {

    }

    @Override
    public void configurePipeline(AppPipeLineBuilder appPipeLineBuilder) {
        appPipeLineBuilder.useExceptionHandler();
        appPipeLineBuilder.useEndPointSelector();
        appPipeLineBuilder.useExecuteEndpoint();


    }
}
