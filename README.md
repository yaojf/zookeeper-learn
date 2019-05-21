#zookeeper学习工程
[![Build Status](https://travis-ci.org/Sayi/swagger-dubbo.svg?branch=master)](https://travis-ci.org/Sayi/swagger-dubbo) ![jdk1.8+](https://img.shields.io/badge/jdk-1.8%2B-orange.svg)

1. 修改zoo.cfg的dataDir配置项为自己的数据目录,修改tickTime为合适的心跳时间
2. 启动Server的main方法
3. 启动Client的main发放，开始debug，超时时间可自行设置
4. 依赖zookeeper版本3.5.0-alpha