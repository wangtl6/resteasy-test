package com.plugin;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import lombok.extern.log4j.Log4j;

@Log4j
@Provider
public class RestExceptionHandler implements ExceptionMapper<Exception> {
	
    @Override
    public Response toResponse(Exception e) {    
    	log.error("来异常了"+e.getMessage(), e);
//        ResultDto ret = ResultBuilder.buildResultStr(ResultBuilder.FAIL_CODE, null, "-1", e.getMessage());
        return Response.status(200).entity("wangtlc").build();
    }
}
