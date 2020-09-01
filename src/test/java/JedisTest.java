import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Project redis-jedis
 * @Author: Fang
 * @Date: 2020/8/31 18:27
 * @Description:
 */
public class JedisTest {
    @Test
    public void test01() throws Exception{
        Jedis jedis = new Jedis("hadoop105", 6379);
        String s = jedis.ping();
        System.out.println(s);
        jedis.close();
    }

    @Test
    public void test02() throws Exception{
        JedisPool jedisPool = new JedisPool("hadoop105", 6379);
        Jedis jedis = jedisPool.getResource();
        System.out.println(jedis.ping());
        jedis.close();
    }
}
