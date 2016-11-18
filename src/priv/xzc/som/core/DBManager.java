package priv.xzc.som.core;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import priv.xzc.som.bean.Configuration;


/**
 * 负责数据库关系和连接维持
 * @author randall
 *
 */
public class DBManager {

	/**
	 * 静态加载配置
	 */
	private static Configuration conf;

	static {//静态加载
		Properties pros = new Properties();
		try {
			ObjectInputStream ois = new ObjectInputStream(
					Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("db.properties"));
			pros = (Properties) ois.readObject();
			conf.setDriver(pros.getProperty("driver"));
			conf.setUrl(pros.getProperty("url"));
			conf.setUser(pros.getProperty("user"));
			conf.setPwd(pros.getProperty("pwd"));
			conf.setSrcPath(pros.getProperty("srcPath"));
			conf.setPoPack(pros.getProperty("poPackage"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}



	/**
	 * 获取连接
	 * @return {@link Connection}对象
	 */
	public static Connection getConn(){
		try {
			Class.forName(conf.getDriver());
			return DriverManager.getConnection(conf.getUrl(),
					conf.getUrl(), conf.getPwd());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 关闭若干个{@link Connection}对象
	 * @param connections {@link Connection}对象
	 */
	public static void close(Connection ...connections){
		for (Connection conn : connections) {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					conn = null;
				}
			}
		}

	}

	/**
	 * 关闭若干个 {@link PreparedStatement}对象
	 * @param ps {@link PreparedStatement}对象
	 */
	public static void close(PreparedStatement ...ps){
		for (PreparedStatement p : ps) {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					p = null;
				}
			}
		}
	}

	/**
	 * 关闭若干个 {@link PreparedStatement}对象
	 * @param ps {@link PreparedStatement}对象
	 */
	@SafeVarargs
	public static <T extends ResultSet>void close(T ...rs){
		for (ResultSet p : rs) {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					p = null;
				}
			}
		}
	}


	/**
	 * 关闭单个结果集和若干个 {@link PreparedStatement}对象
	 * @param ps {@link PreparedStatement}对象
	 */
	public static void close(ResultSet rs, PreparedStatement ...ps){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		for (PreparedStatement p : ps) {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					p = null;
				}
			}
		}
	}


}
