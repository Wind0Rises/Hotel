package com.liu.other.cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;


public class RedisCache implements Cache{
	
	 private static JedisConnectionFactory jedisConnectionFactory;
     
	 private final String id;
	    
	    
	 private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	    
	 public RedisCache(final String id){
		 if (id == null) {
			 throw new IllegalArgumentException("cache instances require an ID");
		 }
		 this.id = id;
	 }
	    
	    
	    @Override
	    public void clear() {
	        JedisConnection connection = null;
	        try {
	            connection = (JedisConnection) jedisConnectionFactory.getConnection();
	            connection.flushDb();
	            connection.flushAll();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if (connection != null) {
	                connection.close();
	            }
	        }
	    }

	    @Override
	    public String getId() {
	        return this.id;
	    }

	    @Override
	    public Object getObject(Object key) {
	        System.out.println("--------------------------------key:"+key);
	        Object result = null;
	        JedisConnection connection = null;
	        try {
	            connection = (JedisConnection) jedisConnectionFactory.getConnection();
	            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
	            result = serializer.deserialize(connection.get(serializer.serialize(key)));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if (connection != null) {
	                connection.close();
	            }
	        }
	        
	        return result;
	    }

	    @Override
	    public ReadWriteLock getReadWriteLock() {
	        return this.readWriteLock;
	    }

	    @Override
	    public int getSize() {
	        int result = 0;
	        JedisConnection connection = null;
	        try {
	            connection = (JedisConnection) jedisConnectionFactory.getConnection();
	            result = Integer.valueOf(connection.dbSize().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if (connection != null) {
	                connection.close();
	            }
	        }
	        return result;
	    }

	    @Override
	    public void putObject(Object key, Object value) {
	        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>key:"+key);
	          
	        JedisConnection connection = null;
	        try {
	            connection = (JedisConnection) jedisConnectionFactory.getConnection();
	            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
	            System.out.println("**"+serializer.serialize(key));
	            connection.set(serializer.serialize(key), serializer.serialize(value));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if (connection != null) {
	                connection.close();
	            }
	        }
	        
	    }

	    @Override
	    public Object removeObject(Object key) {
	        JedisConnection connection = null;
	        Object result = null;
	        try {
	            connection = (JedisConnection) jedisConnectionFactory.getConnection();
	            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
	            result = connection.expireAt(serializer.serialize(key), 0);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if (connection != null) {
	                connection.close();
	            }
	        }
	        return result;
	    }

	    public static void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
	        RedisCache.jedisConnectionFactory = jedisConnectionFactory;
	    }
	
		/*private static Logger logger = Logger.getLogger(RedisCache.class);
		
		*//** The ReadWriteLock. *//*
	    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	    
	    private String id;
	    
	    @Autowired
	    private RedisTemplate<Object, Object> redisTemplate;
	    
	    private final String COMMON_CACHE_KEY = "COM:";
	    
	    
	    *//**
	     * 按照一定规则标识key
	     *//*
	    private String getKey(Object key) {
	        StringBuilder accum = new StringBuilder();
	        accum.append(COMMON_CACHE_KEY);
	        accum.append(this.id).append(":");
	        accum.append(DigestUtils.md5Hex(String.valueOf(key)));
	        return accum.toString();
	    }
	
	    
	    *//**
	     * redis key规则前缀
	     *//*
	    private String getKeys() {
	        return COMMON_CACHE_KEY + this.id + ":*";
	    }
	
	    public RedisCache() {
	
	    }
	
	    public RedisCache(final String id) {
	        if (id == null) {
	            throw new IllegalArgumentException("必须传入ID");
	        }
	        logger.debug(">>>>>>>>>>>>>>>>>>>>>MybatisRedisCache:id=" + id);
	        this.id = id;
	    }
	    
		@Override
		public String getId() {
			return this.id;
		}
	
		@Override
		public void putObject(Object key, Object value) {
			logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>putObject:" + key + "=" + value);
			redisTemplate.opsForValue().set(key, value);
		}
	
		@Override
		public Object getObject(Object key) {
			logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>getObject:" + key );
			return redisTemplate.opsForValue().get(key);
		}
	
		@Override
		public Object removeObject(Object key) {
			logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>removeObject:" + key );
			redisTemplate.delete(key);
			return "ok";
		}
	
		@Override
		public void clear() {
			logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>clear");
			redisTemplate.execute(new RedisCallback<Object>() {
	            public String doInRedis(RedisConnection connection) throws DataAccessException {
	                connection.flushDb();
	                return "ok";
	            }
	        });
		}
	
		@Override
		public int getSize() {
			logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>getSize:");
			return (int) redisTemplate.execute(new RedisCallback<Object>() {
	            public Long doInRedis(RedisConnection connection) throws DataAccessException {
	                return connection.dbSize();
	            }
	        });
		}
	
		@Override
		public ReadWriteLock getReadWriteLock() {
			return readWriteLock;
		}*/

}
