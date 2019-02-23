
## 基于springboot+mybatis的sql数据查询后台。

### 背景
公司没有专门的类似于iDB的sql查询后台，每次需要查询数据都需要登录线上机器，通过sql命令直接连上数据库查询。使用不便，效率低下。

### 使用
###
 31. 引入jar包

```java

<dependency>
    <groupId>com.beautyboss.slogen</groupId>
    <artifactId>sqltool</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

```

#### 2. 修改代码

找到项目中生成`MapperScennerConfigurer`对象的代码(一般在`MapperScannerConfig.java`中)，找到下面这行代码并修改

```java
configurer.setBasePackage("your maper path");
```
，改成如下:

```java

configurer.setBasePackage(SQLToolHelper.wrapScannerPath("your maper path"));

```

#### 3. 启动项目

启动成功之后，输入url 'ip:port/sql' ,界面如下

![sql.png](https://i.loli.net/2019/02/23/5c70e7e72b92f.png)


直接在输入框中输入sql，点击查询即可。

![use2.png](https://i.loli.net/2019/02/23/5c70e7e7314ea.png)
![use1.png](https://i.loli.net/2019/02/23/5c70e7e7438df.png)