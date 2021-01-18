# hsf-pandora-boot-demo

[HSF相关文档](https://help.aliyun.com/document_detail/100087.html?spm=a2c4g.11186623.6.972.26ef7f2eTzFTcH)

## 部署

### 轻量级配置中心

部署在虚拟机**172.16.203.140**这台机器上

关闭防火墙
```shell
systemctl stop firewalld.service
```

### HSF服务提供方（provider）

1. 配置host

部署在虚拟机**172.16.203.202**这台机器上

```shell
vim /etc/hosts
```

添加配置

```shell
172.16.203.140   jmenv.tbsite.net
```

2. 开放端口

```shell
firewall-cmd --zone=public --add-port=8080/tcp --permanent
firewall-cmd --zone=public --add-port=12200/tcp --permanent

```

### HSF服务调用方（consumer）

部署在虚拟机**172.16.203.201**这台机器上

1. 配置host

```shell
vim /etc/hosts
```

添加配置

```shell
172.16.203.140   jmenv.tbsite.net
```

2. 开放端口

```shell
firewall-cmd --zone=public --add-port=8080/tcp --permanent
```
