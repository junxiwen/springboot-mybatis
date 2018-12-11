# springboot-mybatis
springboot整合mybatis<br>
Springboot启动类，添加@MapperScan("com.xxx.xxx")//扫描mapper接口;<br>
Springboot配置文件中，配置xml文件的目以及别名<br>
  mybatis:<br>
    type-aliases-package: com.hyanzz.po ,com.hyanzz.form.request #mybatis会自动扫描你指定包下面的javabean<br>
    mapper-locations: classpath:mapping/*.xml  # 扫描mapper.xml文件<br>

分页插件,需要在pom文件中添加依赖,并且新增一个注解类标记;<br>
请求参数:统一继承MyRequestForm对象,里面有分页相关参数;<br><br>
返回参数:统一返回PageBean对象,里面进行了封装;<br>
