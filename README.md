# springboot-mybatis
springboot整合mybatis
Springboot启动类，添加@MapperScan("com.xxx.xxx")//扫描mapper接口;
Springboot配置文件中，配置xml文件的目以及别名
  mybatis:
    type-aliases-package: com.hyanzz.po ,com.hyanzz.form.request #mybatis会自动扫描你指定包下面的javabean
    mapper-locations: classpath:mapping/*.xml  # 扫描mapper.xml文件

分页插件,需要在pom文件中添加依赖,并且新增一个注解类标记;
请求参数:统一继承MyRequestForm对象,里面有分页相关参数;
返回参数:统一返回PageBean对象,里面进行了封装;
