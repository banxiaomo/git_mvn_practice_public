## git+maven 工程创建步骤

**step1**  GitHub创建repository  
  命名:my-git-mvn-demo


**step2**  本地创建项目以及maven结构的目录(3个目录)  
  git init my-git-mvn-demo  
  cd my-git-mvn-demo  
  mkdir -p src/java/com/rgl/demo  
  mkdir -p src/java/resources  
  mkdir -p src/test/com/rgl/test


**step3**  添加和填写pom.xml文件   
  touch pom.xml  
  vim pom.xml  
  根据官网 http://maven.apache.org/pom.html#The_Basics 填写pom.xml  
  pom.xml要求:  
  -1- 修改 groupId 和 artifactId   
  -2- 添加 packaging 标签为 jar    
  -3- 添加 properties 标签的自定义 k/v   
  -4- 添加 build 标签,让mvn编译时进行文件和目录的特定设置  
  -5- 测试pom.xml是否正常(用 mvn clean )  


**step4**  git提交pom.xml的修改,更新到本地库  
  git status
  git add -A;git commit -am"提交说明"    


**step5**  git对象的查看  
  查看git目录下的git对象  find .git/objects -type f  
  查看某个git对象的内容 git cat-file -p [文件名称]
  

**step6**  添加远程仓库并查看  
  git remote add origin [地址]  
  git remote -vv  


**step7**  git设置上游并push(并查看上游信息)  
  git push --set-upstream origin master  
  git branch -avv	


**step8**  添加java类和properties配置并进行mvn测试  
  vim src/main/java/com/rgl/demo/Hello.java  
  vim src/main/resources/app.properties  
  mvn clean   
  mvn compile  
  cat target/classes/app.properties  
  java -cp target/classes/ com.rgl.demo.Hello  
  mvn clean  
  mvn package  
  java -cp target/my-git-mvn-demo-1.0.jar com.rgl.demo.Hello  


**step9**  进行mvn测试(无Junit/有Junit)  
  vim src/test/java/com/rgl/test/TestHello.java  
  mvn clean  
  mvn test  
  vim pom.xml (添加 Junit 依赖,可以直接用maven官网里的demo)  
  vim src/test/java/com/rgl/test/HelloTest.java  
  mvn clean  
  mvn test  


**step10**  将修改再次更新(add,commit,push)    
  git add -A;git commit -am"all commit";git push


**step11**  重新clone项目到本地,并mvn测试  
  cd ../  
  git clone git@github.com:banxiaomo/my-git-mvn-demo.git my-git-mvn-demo-clone  
  cd my-git-mvn-demo-clone  
  mvn test  
  mvn clean  


**step12**  在clone项目里添加readme,在原项目里pull  
  vim README.MD  
  git status  
  git add -A;git commit -am"readme commit";git push  
  cd ../my-git-mvn-demo  
  git status  
  git pull  
  cat README.MD  
