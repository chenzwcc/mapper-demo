### 通用mapper的使用过程！
```
    1、在项目中引入通用mapper 的依赖
    2、建立一个数据访问层接口并继承Mapper
    3、将通用mapper 放入spring 容器中
    4、在业务逻辑层调用数据访问层
    5、控制器调用业务逻辑层
    6、配置数据源
```

#### 第一步、配置pom文件

```
在pom.xml文件中引入
<!-- 通用 mapper -->
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>1.2.3</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

#### 第二步、配置mapper文件

```
//注意： Mapper也是引用tk.mybatis.mapper.common.Mapper包中的
@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {
}
```

#### 第三步、配置springboot启动类文件

```
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.code.mapperdemo.mapper")
public class MapperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperDemoApplication.class, args);
    }

}

//注意，MapperScan是引用tk.mybatis.spring.annotation.MapperScan包中的
```

#### 第四步、配置service实现类文件

```
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
```

#### 第五、配置controller文件

```
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> all = userInfoService.findAll();
        for (UserInfo userInfo: all
             ) {
            System.out.println("userInfo:"+userInfo.toString());
        }
        return all;
    }
}
```

#### 第六步、配置application.properties文件

```
spring.datasource.url=jdbc:mysql://localhost:3306/gmall?characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=chenzwcc
mapper.identity=MYSQL
```
