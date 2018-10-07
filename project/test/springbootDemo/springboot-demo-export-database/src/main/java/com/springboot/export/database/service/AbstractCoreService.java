package com.springboot.export.database.service;

import com.springboot.demo.po.Request;
import com.springboot.demo.po.Response;
import com.springboot.demo.service.CoreService;

public abstract class AbstractCoreService implements CoreService {

    @Override
    public Response exceute(Request request) {
        Response response = null;
        try{
            response = process(request);
        }catch (Exception e){

        }

        return response;
    }

    protected abstract Response process(Request request);
}
