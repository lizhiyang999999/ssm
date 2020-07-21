新建Maven项目--SSM整合
    打包方式war
    添加依赖
    添加tomcat7的插件

开始整合

Spring : spring.xml(包扫描,数据源,注解驱动,事务管理)
SpringMVC: springmvc.xml(三大组件,包扫描,转换器,拦截器)
MyBatis: SqlMapConfig.xml(空的)
web.xml(前端控制器,过滤器,监听器)
jdbc.properties
log4j.properties

问题:
1. dependencyManagement和dependencies什么区别?