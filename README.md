# API接口开放平台

## 项目介绍 🙋

**😀 作为用户您可以通过注册登录账户，获取接口调用权限，并根据自己的需求浏览和选择适合的接口。您可以在线进行接口调试，快速验证接口的功能和效果。** 

**💻 作为开发者 我们提供了客户端SDK: API-SDK， 通过开发者凭证即可将轻松集成接口到您的项目中，实现更高效的开发和调用。** 

**🤝 您可以将自己的接口接入到 API 接口开放平台平台上，并发布给其他用户使用。 您可以管理和各个接口，以便更好地分析和优化接口性能。** 

**👌 我们还提供了开发者在线文档和技术支持，帮助您快速接入和发布接口。**

 **🏁 无论您是用户还是开发者，API 接口开放平台都致力于提供稳定、安全、高效的接口调用服务，帮助您实现更快速、便捷的开发和调用体验。**

## 网站导航 🧭

- **API 后端 🏘️**
- **API 前端 🏘**️
- **API-SDK** 🛠
- **API 接口开放平台 🔗**
-  **API-SDK-demo ✔️**


## 目录结构 📑


| 目录                | 描述            |
| ------------------- | --------------- |
| **🏘️ api-backend**   | API后端服务模块 |
| **🏘️ api-common**    | 公共服务模块    |
| **🕸️ api-gateway**   | 网关模块        |
| **🔗 api-interface** | 接口模块        |
| **🛠 pi-sdk**        | 开发者调用sdk   |

## 项目流程 🗺️

![QiAPI 接口开放平台](https://img.qimuu.icu/typory/QiAPI%2520%25E6%258E%25A5%25E5%258F%25A3%25E5%25BC%2580%25E6%2594%25BE%25E5%25B9%25B3%25E5%258F%25B0.png)

## 快速启动 🚀

### 前端

环境要求：Node.js >= 16

安装依赖：

```bash
yarn or  npm install
```

启动：

```bash
yarn run dev or npm run start:dev
```

部署：

```bash
yarn build or npm run build
```

### 后端

执行sql目录下ddl.sql

## 项目选型 🎯

### **后端**

- Spring Boot 2.7.0
- Spring MVC
- MySQL 数据库
- 腾讯云COS存储
- Dubbo 分布式（RPC、Nacos）
- Spring Cloud Gateway 微服务网关
- API 签名认证（Http 调用）
- IJPay-AliPay  支付宝支付
- WeiXin-Java-Pay  微信支付
- Swagger + Knife4j 接口文档
- Spring Boot Starter（SDK 开发）
- Jakarta.Mail 邮箱通知、验证码
- Spring Session Redis 分布式登录
- Apache Commons Lang3 工具类
- MyBatis-Plus 及 MyBatis X 自动生成
- Hutool、Apache Common Utils、Gson 等工具库

### 前端

- React 18

- Ant Design Pro 5.x 脚手架

- Ant Design & Procomponents 组件库

- Umi 4 前端框架

- OpenAPI 前端代码生成

  

## 功能介绍 📋

`坤币`即积分，用于平台接口调用。

|                          **功能**                           | 游客 | **普通用户** | **管理员** |
| ----------------------------------------------------- |--------------|-----|-----|
| **API-SDK**使用 | ✅ | ✅ |     ✅      |
|                     邀请好友注册得坤币                      | ❌ | ✅ |     ✅      |
|                    切换主题、深色、暗色                     | ✅ | ✅ | ✅ |
|                       微信支付宝付款                        | ❌ | ✅ | ✅ |
|                        在线调试接口                         | ❌ | ✅ | ✅ |
|                       每日签到得坤币                        | ❌ | ✅ | ✅ |
|                 接口大厅搜索接口、浏览接口                  | ✅ | ❌ | ✅ |
|                     邮箱验证码登录注册                      | ✅ | ✅ | ✅ |
|                          钱包充值                           | ❌ | ❌ | ✅ |
|                     支付成功邮箱通知(需要绑定邮箱)                     | ❌ | ✅ | ✅ |
|                          更新头像                           | ❌ | ✅ | ✅ |
|                    绑定、换绑、解绑邮箱                     | ❌ | ✅ | ✅ |
|                          取消订单、删除订单                          | ❌ | ✅ | ✅ |
|                    商品管理、上线、下架                     | ❌ | ❌ |✅|
|                    用户管理、封号解封等                     | ❌ | ❌ | ✅ |
|                接口管理、接口发布审核、下架                 | ❌ | ❌ | ✅ |
|                            退款                             | ❌ | ❌| ❌ |

## 功能展示 ✨

### 首页

![image-20240617010707902](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617010707902.png)

### 登录/注册

![image-20240617012241813](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012241813.png)

![image-20240617012302010](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012302010.png)

### 接口广场

![image-20240617010812880](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617010812880.png)

### 接口描述

#### 在线API

![image-20240617011002137](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011002137.png)

#### 在线调试工具

![image-20240617011056657](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011056657.png)

#### 错误码参考

![image-20240617011126377](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011126377.png)

#### 接口调用代码示例

![image-20240617011214820](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011214820.png)

### 管理页

#### 用户管理

![image-20240617011303388](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011303388.png)

#### 商品管理

![image-20240617011332022](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011332022.png)

#### 接口管理

![image-20240617011410435](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011410435.png)

#### 动态更新响应请求参数

![image-20240617011446747](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011446747.png)

### 积分商城

![image-20240617011524440](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011524440.png)

### 订单支付

![image-20240617011555511](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011555511.png)

### 个人信息

#### 信息展示

![image-20240617011626549](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011626549.png)

#### 每日签到

#### 签到成功

![image-20240617011855413](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011855413.png)

#### 签到失败

![image-20240617011914647](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617011914647.png)

### 订单管理

#### 我的订单

![image-20240617012410543](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012410543.png)

#### 详细订单

![image-20240617012437711](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012437711.png)

### 主题切换

#### 深色主题

![image-20240617012506467](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012506467.png)

#### 浅色主题

![image-20240617012521623](C:\Users\zwd\AppData\Roaming\Typora\typora-user-images\image-20240617012521623.png)
