该组插件有两种使用方法：
================================================================
一、框架自动调用法：
---------------------------------------------------------------
1.1集成方法：
修改web.xml
org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap为：com.sitech.core.plugins.resteasy.core.ResteasyBootstrapOur
1.2使用方法：
对应用侧透明，应用侧的rest服务器只需要返回retinfo类即可
1.3扩展方法：
Serializer4RetInfo类为对目前的retinfo类的处理类，如果有需要可以修改该类
如果应用要返回一个新的对象，且要做特殊处理，可新定义类且实现ISerializer接口，将该类通过SerializerFactory.registerSerializer方法注入即可。
================================================================
二、工具法手动调用法
---------------------------------------------------------------
2.1使用方法：
在rest服务侧返回时调用JsonDeailUtil.object2JsonString方法即可
2.2扩展方法：
同1.3
---------------------------------------------------------------