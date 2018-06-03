
/*
在安装了Oracle JDK的机器上，存储在Test.java的类可以使用下面的命令来编译和运行 
javac Test.java 
java Test Hello, world. 
输出结果为： 
**Hello**, world 
*/

class Test{
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.print(i==0?args[i]:" "+args[i]);
		}
	}
}
