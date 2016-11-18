package priv.xzc.som.bean;

/**
 * 列信息,表明一个字段的信息
 * @author randall
 *
 */
public class ColumnInfo {

	/**
	 * 列名
	 */
	private String name;
	/**
	 * 数据类型
	 */
	private String dateType;
	/**
	 * 键的类型(0：普通，1：主键，2：外键)
	 */
	private int priKey;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}
	public int getPriKey() {
		return priKey;
	}
	public void setPriKey(int priKey) {
		this.priKey = priKey;
	}
	public ColumnInfo() {
	}
	public ColumnInfo(String name, String dateType, int priKey) {
		super();
		this.name = name;
		this.dateType = dateType;
		this.priKey = priKey;
	}
	
	
}
