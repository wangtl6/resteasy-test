使用方法：
在WEB.XML里面配置
	    <context-param>  
        <param-name>resteasy.providers</param-name>  
        <param-value>com.plugin.RestExceptionHandler</param-value>  
    </context-param>  
    
使用：
RestExceptionHandler可以拦截REST里面抛出的异常

    