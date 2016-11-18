package priv.xzc.som.bean;

import java.util.List;
import java.util.Map;

/**
 * 表信息
 * @author randall
 *
 */
public class TableInfo {

	/**
	 * 字段信息
	 */
	private Map<String, ColumnInfo> tables;
	
	/**
	 * 主键(唯一主键)
	 */
	private ColumnInfo priKey;
	
	/**
	 * 联合主键
	 */
	private List<ColumnInfo> conKey;

	public TableInfo() {
	}
	
	
	public TableInfo(Map<String, ColumnInfo> tables, ColumnInfo priKey, List<ColumnInfo> conKey) {
		super();
		this.tables = tables;
		this.priKey = priKey;
		this.conKey = conKey;
	}


	public Map<String, ColumnInfo> getTables() {
		return tables;
	}

	public void setTables(Map<String, ColumnInfo> tables) {
		this.tables = tables;
	}

	public ColumnInfo getPriKey() {
		return priKey;
	}

	public void setPriKey(ColumnInfo priKey) {
		this.priKey = priKey;
	}

	public List<ColumnInfo> getConKey() {
		return conKey;
	}

	public void setConKey(List<ColumnInfo> conKey) {
		this.conKey = conKey;
	}
	
	
	
}
