package priv.xzc.som.core;

/**
 * 负责Java数据类型和数据库数据类型的相互转换
 * @author randall
 *
 */
public interface TypeConvertor {

	/**
	 * 将Java数据类型转换到数据库数据类型
	 * @param type Java数据类型
	 * @return 数据库数据类型
	 */
	public String javaDataType2DatabaseDataType(String type);
	
	/**
	 * 将数据库数据类型转换到Java数据类型
	 * @param type 数据库数据类型
	 * @return Java数据类型
	 */
	public String databaseDataType2JavaDataType(String type);
	
	
}
