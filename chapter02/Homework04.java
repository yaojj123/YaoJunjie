
//环境变量及其作用
1.在任意目录下都能调用java和javac命令，如果不设置环境变量，因为java和jvavc不在当下目录就无法调用，设置环境变量后如果找不到当下目录，就去设置的地址寻找
2.配置JAVA_HOME,指向jdk安装目录
3.编辑path环境变量，增加%JAVA_HOME%\bin（java和javac在bin文件夹里）