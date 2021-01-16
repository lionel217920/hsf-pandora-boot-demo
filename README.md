# hsf-pandora-boot-demo

[HSF相关文档](https://help.aliyun.com/document_detail/100087.html?spm=a2c4g.11186623.6.972.26ef7f2eTzFTcH)

## 部署

### 轻量级配置中心

172.16.203.140

### HSF服务提供方（provider）

配置host

**172.16.203.202**

```shell
vim /etc/hosts
```

添加配置

```shell
172.16.203.140   jmenv.tbsite.net
```

### HSF服务调用方（consumer）

**172.16.203.201**

配置host

```shell
vim /etc/hosts
```

添加配置

```shell
172.16.203.140   jmenv.tbsite.net
```
