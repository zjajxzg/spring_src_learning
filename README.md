### Spring源码构建

#### 一、构建环境

1. jdk8
2. idea

#### 二、下载源码构建编译

1. [github下载源码](https://github.com/spring-projects/spring-framework) 
2. idea打开项目 自动构建
3. 构建完成后使用gradle编译  需要先编译spring-oxm

> 注意：使用阿里云镜像构建更快

```groovy
maven { url "https://maven.aliyun.com/nexus/content/groups/public/"} 
```

#### 三、编译遇到的问题

1. 有test case 没通过  gradle -x test 跳过test case

```
gradle build -x testClasses -x test -x javadoc -x compileTestKotlin
```

#### 四、测试

1. 构建gradle moudle    项目->右键new moudle->选择gradle 修改名称
2. 找到对应moudle的build.gradle   添加spring核心依赖

```groovy
dependencies {
    // 添加spring核心依赖
    compile(project(":spring-context"))
    compile(project(":spring-beans"))
    compile(project(":spring-core"))
    compile(project(":spring-aop"))
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
```

3. 测试代码