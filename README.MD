## 用于git和mvn学习和练习的repository

### git常用命令
查看git对象  
git cat-file -p [文件名称]  
查看remote状态  
git remote -vv  
查看branch状态  
git branch -avv	 

### mvn常用命令
clean生命周期  
mvn clean  

default(build)生命周  
mvn compile  编译  
mvn test  测试  
mvn package  打包  
mvn install  安装(安装打包的项目到本地仓库，以供其他项目使用)  
mvn deploy  部署(上传到远程仓库,比如nexus)  

site 生命周期  
略  
