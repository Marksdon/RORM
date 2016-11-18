package priv.xzc.som.core;

/**
 * 查询工厂
 * @author randall
 *
 */
public interface QueryFactory {

	/**
	 * 生成某种数据库的{@link Query}对象
	 * @param type 对象类型
	 * @return {@link Query}对象
	 */
	Query createQuery(String type);
}
