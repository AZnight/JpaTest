package cn.itcast.test;

import cn.itcast.domain.Customer;
import org.junit.Test;

import javax.persistence.*;

public class JpaTest {
    /*
    * 测试jpa的保存
    *   案例：保存一个客户到数据中
    * Jpa的操作步骤：
    *   1.加载配置文件，创建工厂（实体管理类工厂）对象
    *   2.通过实体管理类工厂获取实体管理器
    *   3.获取事务对象，开启事务
    *   4.增删改查操作
    *   5.提交事务（回滚事务）
    *   6.释放资源
    * */
    @Test
    public void testSave(){
        /*1.加载配置文件，创建工厂（实体管理类工厂）对象*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        /*2.通过实体管理类工厂获取实体管理器*/
        EntityManager em = factory.createEntityManager();
        /*3.获取事务对象，开启事务*/
        EntityTransaction tx = em.getTransaction();
        tx.begin();//开启事务
        Customer customer = new Customer();
        customer.setCustName("王念文");
        customer.setCustIndustry("教育");
        //保存
        em.persist(customer);//保存操作
        tx.commit();//提交事务
        /*释放资源 */
        /*按照开启的返回顺序进行关闭*/
        em.close();
        factory.close();
        factory.
    }
}
