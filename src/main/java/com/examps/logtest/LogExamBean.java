package com.examps.logtest;

import org.springframework.stereotype.Component;

/**
 * Created by chace.cai on 2014/4/11.
 */

@Component("LogExamBean")
public class LogExamBean implements ILogExamBean {
      @Override
      public void throwARunTimeException(){
          throw new RuntimeException("ss");
      }
}
