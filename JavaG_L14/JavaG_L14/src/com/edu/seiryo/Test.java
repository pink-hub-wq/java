package com.edu.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Test {
	//明天课程，下午13点上课
	//今天提交书上14章迆
	//明天11点前提交学生管理系统（数据库版）
	//怎样把数据库中获取的数据放入list中
	
	
	//在jdk中只有jdbc的接口，而没有具体实现
			//具体实现（方法）代码在由数据库厂商提供的jar包当中实现
			//利用上述方法实现了一种多态
			//同样的操作方法，传入不同的jar可以操作不同的数据库
			
			
			//学习使用sqlserver数据库，但是其他数据操作都相同
//			Connection connection = new ConnectionImp();
			//JDBC操作数据库步骤
			//1.将驱动类载入虚拟机
				//1.1复制jar包到项目中
				//1.2在jar包上右键build path添加入环境中
				//1.3使用的是jar包中的驱动类:SQLServerDriver
					//注意：需要访问该类的全路径com.microsoft.sqlserver.jdbc.SQLServerDriver
					//注意：在jar包中找到该文件后右键copy Quailfied name拿到全路径
					//【注意：copy后，带有class后缀的，需要删除，不删除报错】
			//2.加载驱动，建立数据库连接
				//【第一次一定报错】第一次链接数据库，默认安装时TCP/IP链接是出于关闭的，第一次需要手动开启，后续不需要
					//打开SQLServer配置管理器，进行设置，如果任务栏中没有则可以win+R输入：SQLServerManager11.msc打开管理器
					//打开SQLServer网络配置，打开MSSQLSERVER的协议，将TCP/IP状态改为启动【改动后需要重启才能生效】
				//通过DriverManager类，加载驱动，建立连接
					//通过调用getConnection方法加载驱动
					//通过传递链接地址、链接用户名、链接密码，链接数据库
						//链接地址："jdbc:sqlserver:"，不同的数据库jar包，链接方式不同，该jar包是如此连接的
						//后续代表需要链接到哪个地址（那台电脑/服务器）
						//链接地址："localhost",localhost代表本机的意思，可以写成：127.0.0.1也是代表本机，或者是本机的IP地址也可以
						//链接地址："1549",代表的sqlserver的名牌号
						//链接地址：DataBaseName链接到哪一个数据库
			//3.创建发送SQL语句对象
				//【注意Statement除了sql包中有，还有beans也有，不能引错了】
			//4.发送SQL语句
				//SQL语句报错，把sql语句复制到sql工具中运行
			//5.处理结果
				//增删改(返回boolean及int)
					//execute返回boolean值，返回【false】代表语句执行成功，返回【true】代表语句执行失败
					//executeUpdate返回int值，返回该操作影响的数据行数
				//查询（返回的是数据本身）
					//executeQuery（返回ResutSet结果集）
			
			//关闭资源
				//操作数据库完后一定要关闭资源，调用对应对象的close方法即可
			
			//数据层的处理
	private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String URL = "jdbc:sqlserver://localhost:1433;DataBaseName=Java_L14";
	private final static String USER = "sa";
	private final static String PWD = "123";
	public static void main(String[] args) {
		Test test = new Test();
		test.query();
	}
	public void query(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PWD);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from users");
			//数据库把数据封装到了resultSet中
			while(resultSet.next()){
				//一种是根据列名获取，一种是根据列数获取。一般情况下根据列名获取
				//【在没有特殊情况，不知道列名的情况的时候不要写123。。。】
				System.out.print(resultSet.getInt(1)+"\t");//resultSet.getInt(1);
				System.out.print(resultSet.getString(2)+"\t");
				System.out.println(resultSet.getString(3));
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		//一般就是关闭资源使用的
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PWD);
			statement = connection.createStatement();
			int bo = statement.executeUpdate("delete form users where userid = 3");
			System.out.println(bo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		//一般就是关闭资源使用的
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
