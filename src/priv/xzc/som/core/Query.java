package priv.xzc.som.core;

/**
 * 负责提供持久化服务,核心
 * @author randall
 *
 */
public interface Query {

	/**
	 * 这行一个持久化操作
	 * @param sql sql语句
	 * @param clazz 执行的对应的{@link Class}对象
	 * @return 执行后的影响行数
	 */
	public int execute(String sql, Class<?> clazz);
	
	/**
	 * 插入对应{@link Class}类的对象数据
	 * @param sql sql语句
	 * @param clazz 持久化的{@link Class}对应类的对象
	 * @param params 参数
	 * @return 执行操作后的影响行数
	 */
	public int insert(String sql, Class<?> clazz, Object[] params);
	
	/**
	 * 更新对应{@link Class}类的对象数据
	 * @param sql sql语句
	 * @param clazz 持久化的{@link Class}对应类的对象
	 * @param params 参数
	 * @return 执行操作后的影响行数
	 */
	public int update(String sql, Class<?> clazz, Object[] params);
	
	/**
	 * 删除对应{@code id}的记录
	 * @param sql sql语句
	 * @param id 需要删除的记录id
	 */
	public void delete(String sql, String id);
	
	/**
	 * 删除参数{@code params}对应规格的记录
	 * @param sql sql语句
	 * @param params 参数
	 */
	public void delete(String sql, Object[] params);
	
	/**
	 * 查询多行多列数据，封装到{@code clazz}对应的类的对象中
	 * @param sql 查询语句
	 * @param clazz 需要封装到
	 * @param params 参数
	 * @return 查询数据封装进去对象
	 */
	public Object query(String sql, Class<?> clazz, Object[] params);

	/**
	 * 查询一行数据，并且直接返回
	 * @param sql 查询语句
	 * @param params 参数
	 * @return 查询的数据对象
	 */
	public Object query(String sql, Object[] params);
	
	/**
	 * 查询一个值，并且直接返回
	 * @param sql 查询语句
	 * @param params 参数
	 * @return 数字对象
	 */
	public Number queryNumber(String sql, Object[] params);
	
}
