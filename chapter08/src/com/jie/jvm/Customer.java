package com.jie.jvm;

/**
 * Customer
 * 测试对象实例化的过程
 *
 * @author J
 * @version 1.0
 * @since 2021/3/6 14:51
 */
public class Customer {
    int id = 1001;
    String name;
    Account acct;

    {
        name = "匿名用户";
    }

    public Customer() {
        acct = new Account();
    }
}

class Account {

}
