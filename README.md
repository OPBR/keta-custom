keta-custom
===========

一个开源的、安全的、可扩展的定制化平台。
本人作为学习使用，感谢原作者的开源精神，原作见下面链接
如有冒犯：侵删

原作者：https://github.com/ketayao/keta-custom

# 本地运行步骤
## 第一步
* 项目包中*patcha*目录拷贝出来解压
* 解压后的文件直接放入本地maven仓库的org目录下解决*patcha*包依赖
## 第二步
* 创建本地数据库，创建名为keta_custom的数据库
* 拷贝项目中sql目录下的*keta_custom.sql*文件的SQL语句刷入本地MySql
* 修改项目中的*jdbc.properties*文件中数据库的用户名和密码对应本地的用户名密码
