# API开放平台



## Lab 1

环境的部署及搭建

初始化的时候，使用nvm管理node版本，因为windows系统不像mac os和linux一样，可以sudo去下载，如果直接在node英文官网上下载node16.14去覆盖16.13的时候会报错，所以用Github牛人编写的nvm工具去管理node版本，切记要以管理员身份打开这个cmd然后再去进行操作

npm已经安装好了，在D盘的Program Files目录下，用管理员身份打开cmd窗口

如果要安装16.14版本的node.js，使用指令：nvm install 16.14.0

显示目前安装了哪些版本的node.js，使用指令：nvm ls

切换node版本，nvm use 16.14.0



## Lab 2

19：19	在替换InterfaceInfo的时候，把routes.ts里的component也替换掉了，实际上是不用替换的

01:17:18

是http，不是https，多打了一个s

![image-20230527214700406](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20230527214700406.png)

Lombok requires enabled annotation问题：

设置——构建、执行、部署——编译器——注解处理器——“启用注解处理”

看到01：17：37



可以开发一个starter写到简历上，有加分。不用自己创建客户端，写配置还有语法的提示。



## Lab 3

前端JS代码中 ``和’‘的区别？

点了查看没有跳转的原因！



先看到2：10：47

遇到bug：

发布接口报错：操作失败ConnectException: Connection refused: connect



操作失败ConnectException: Connection refused: connect

如果发布失败，一定要把yuapi-interface打开于explorer中，然后把它单独打开，去启动它的Application，才能去点发布功能



## Lab 4

要打开yuapi-backend的application，还要打开yuapi-interface和yuapi-client-sdk的application（这个不用开，这个只是个自定义的SDK）

以及前端的dev，start的虚拟的数据，dev才是接入了后端的。

之前一直报一个 HTTP 500 的错误，原来发现是pom.xml里面的包引错了！



SpringBoot项目启动失败：看看application.yml中的格式缩进对不对



限流：学习令牌桶算法、学习漏桶算法，学习一下RedisLimitHandler



## Lab 6

翻车了，弄ZooKeeper弄不出来，启不起来注册中心

换成了Nacos（也是Alibaba的）后，可以成功运行

启动Nacos注册中心：

切到Nacos的bin目录下：，执行操作：startup.cmd -m standalone

就可以启动Nacos

standalone 代表着单机模式运行，非集群模式

D:\soft\nacos\bin>startup.cmd -m standalone
"nacos is starting with standalone"

在弹出的cmd窗口中可以点进页面，输入账户和密码均为nacos。



## Lab 7

如果以debug模式启动项目的时候，发现启动不起来，原因很可能是因为断点打在了Java的某个方法上，查看断点，然后把打在方法上的断点取消掉即可。

在Gateway项目中，一开始发现以debug模式启动不了项目，最后发现是provider的路径不对，将DemoService换到provider包目录下，便可以成功启动了。

用yupi和yupi1登录，密码都是12345678，然后进入第一个开放的接口中去调用{"username":"yupi"}，得到返回值，同时可以在后端数据库中看到数据的变化。

02:05:19。

要启动backend、interface、Gateway和前端项目以及Nacos网关。



## 项目上线

​	前端版本一开始初始化的时候没有去除国际化的内容，导致了前端的登录页面的网页渲染有问题，我自己写的WebStorm项目需要导入一个找不出的.less文件，这不影响项目的启动，但是会在网页转圈进入时卡住，导致无法登录，所以将前端弄清逻辑后，一定要用fronted-master来部署上线，可以把master去掉改个名字就行。

​	后端的话，直接用自己写的，对照过了，基本上没有任何问题，直接用自己编写的来部署就行。



个人灵感：

Dead By Daylight 社区，如果能把这个Web网站复现，将会是一个很不错的项目。



需要补充的知识点：

Java 8 Stream流，正则表达式

QueryWrapper

HttpServlet

Mono<Void>

Mybatis

Mybatis-plus
