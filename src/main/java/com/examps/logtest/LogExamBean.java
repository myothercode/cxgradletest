package com.examps.logtest;

import com.exception.Asserts;
import org.springframework.stereotype.Component;

/**
 * Created by chace.cai on 2014/4/11.
 */

@Component("logExamBean")
public class LogExamBean implements ILogExamBean {
      @Override
      public void throwARunTimeException(String s) throws Exception{
         // throw new RuntimeException("ss");
          Asserts.assertTrue(false,"错误");
      }
}
