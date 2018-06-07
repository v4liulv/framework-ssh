package com.sinobest.framework.test;

/**
 * Created by Administrator on 2016/11/5 0005.
 *
 *
 */
public class OracleTest {

    public static void main(String[] args){
        try {
            try {
                Thread.currentThread().getContextClassLoader().loadClass("oracle.jdbc.driver.OracleDriver").newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Oracle Driver connection Succession.") ;
    }

}
