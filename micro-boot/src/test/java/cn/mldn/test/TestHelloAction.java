package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartBootMain;
import cn.mldn.action.HelloAction;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	// Spring需要启动容器才可以测试
@SpringBootTest(classes=StartBootMain.class)
public class TestHelloAction {
	private static final Logger LOG = LoggerFactory.getLogger(TestHelloAction.class) ;
	@Autowired
	private HelloAction helloAction ;
	@Test
	public void testInfo() { 
		String info = this.helloAction.info() ;
		LOG.info("info = " + info);
		TestCase.assertEquals(info, "www.mldn.cn"); 
	}
}
