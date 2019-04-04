package me.chanjar.weixin.mp.api;

/**
 * Key-Value风格的持久化Repository；
 * @author Maxwell.Lee
 * @date 2019-04-04 10:10
 * @since 1.0.0
 */
public interface PersistenceRepository<K, V> {

  V getValue(String namespace, K key);

  /**
   *
   * @param namespace
   * @param key
   * @return  单位：秒；
   */
  Long getTtl(String namespace, K key);

  void save(String namespace, K key, V val, int expiresInSeconds);

  V remove(String namespace, K key);
}
