package com.examps;

import com.Test1;
import com.examps.logtest.ILogExamBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chace.cai on 14-4-4.
 */
public class Test {

    public static   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

    public static void main(String[] args) throws Exception {
       /* System.out.println("test");
        Test1 test1=new Test1();
        test1.test1();*/

        ILogExamBean logExamBean = applicationContext.getBean(ILogExamBean.class);
        logExamBean.throwARunTimeException("ml");
    }
}
