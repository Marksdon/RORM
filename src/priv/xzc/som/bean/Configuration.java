package priv.xzc.som.bean;

/**
 * 管理资源配置信息
 * @author randall
 *
 */
public class Configuration {
	/**
	 * 驱动类
	 */
	private String driver;
	/**
	 * 数据库url
	 */
	private String url;
	/**
	 * 数据库用户
	 */
	private String user;
	/**
	 * 数据库密码
	 */
	private String pwd;
	/**
	 * 生成源码路径
	 */
	private String srcPath;
	/**
	 * 生成javabean路径
	 */
	private String poPack;
	
	public Configuration() {
	}
	public Configuration(String driver, String url, String user, String pwd, String srcPath, String poPack) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pwd = pwd;
		this.srcPath = srcPath;
		this.poPack = poPack;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSrcPath() {
		return srcPath;
	}
	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}
	public String getPoPack() {
		return poPack;
	}
	public void setPoPack(String poPack) {
		this.poPack = poPack;
	}
	
	
}
