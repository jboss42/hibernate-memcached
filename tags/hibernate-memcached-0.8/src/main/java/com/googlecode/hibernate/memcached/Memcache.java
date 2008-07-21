package com.googlecode.hibernate.memcached;

/**
 * DOCUMENT ME!
 *
 * @author Ray Krueger
 */
public interface Memcache {

    Object get(String key);

    void set(String key, int cacheTimeSeconds, Object o);

    void delete(String key);

    void incr(String key, int factor, int startingValue);

    void shutdown();
}
