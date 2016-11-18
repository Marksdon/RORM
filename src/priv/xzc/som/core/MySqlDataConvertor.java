package priv.xzc.som.core;

/**
 * MySql数据库数据类型转换器，负责MySql数据类型与Java数据类型相互转化
 * @author randall
 *
 */
public class MySqlDataConvertor implements TypeConvertor {

	@Override
	public String javaDataType2DatabaseDataType(String type) {

		/**
		 * 1.字符类型
		 * 2.数值类型
		 * 3.时间类型
		 */
		if (type.trim().equalsIgnoreCase("varchar") 
				|| type.trim().equalsIgnoreCase("text")) {
			return "String";
		} else if (type.trim().equalsIgnoreCase("char")) {
			return "char";
		} else if (type.trim().equalsIgnoreCase("tinyint")
				|| type.trim().equalsIgnoreCase("samllint")
				|| type.trim().equalsIgnoreCase("int")
				) {
			return "Interger";
		} else if (type.trim().equalsIgnoreCase("long")) {
			return "Long";
		} else if (type.trim().equalsIgnoreCase("float")) {
			return "Float";
		} else if (type.trim().equalsIgnoreCase("double")) {
			return "Double";
		} else if (type.trim().equalsIgnoreCase("blob")) {
			return "java.sql.Blob";
		} else if (type.trim().equalsIgnoreCase("clob")) {
			return "java.sql.Clob";
		} else if (type.trim().equalsIgnoreCase("date")) {
			return "java.sql.Date";
		} else if (type.trim().equalsIgnoreCase("time")) {
			return "java.sql.Time";
		} else if (type.trim().equalsIgnoreCase("timestamp")) {
			return "java.sql.Timestamp";
		}

		return null;
	}

	@Override
	public String databaseDataType2JavaDataType(String type) {
		return null;
	}

}
