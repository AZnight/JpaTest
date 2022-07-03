package cn.itcast.domain;

import javax.persistence.*;

/*
* 客户的实体类
*   配置映射关系
*       1.实体类和表的映射关系
*       2.实体类当中属性和表中字段的映射关系
* Entity声明实体类
* Table配置实体类和表中的映射关系
*   name配置数据库表的名称
* */
@Entity
@Table(name = "cst_customer")
public class Customer {
    /*
    * @Id声明主键的配置
    * @GenerationType主键生成策略
    *   startegy策略
    *       GenerationType.IDENTITY:自增(mysql | )
    *                               *数据库必须支持自动增长
    *       GenerationType.SEQUENCE:序列(oracle | )
    *                               *底层数据库必须支持序列
    *       GenerationType.TABLE:jpa提供的一种机制，通过一张数据库表的形式帮助我们完成
    *                               自增
    *                               *
    *       GenerationType.AUTO:程序自动的选择逐渐生成策略
    *
    * @Column 配置属性和字段的映射关系
    *   name数据库字段的名称
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private long custId;//客户主键
    @Column(name = "cust_name")
    private String custName;
    @Column(name = "cust_source")
    private String custSource;//客户来源
    @Column(name = "cust_level")
    private String custLevel;//客户级别
    @Column(name = "cust_industry")
    private String custIndustry;//所属行业
    @Column(name = "cust_phone")
    private String custPhone;//联系方式
    @Column(name = "cust_address")
    private String custAddress;//地址

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }

}
