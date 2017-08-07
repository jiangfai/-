package com.qfedu;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qfedu.controller.DeptControllerTest;
import com.qfedu.service.DepartmentServiceTest;
import com.qfedu.util.CommonUtilTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	DeptControllerTest.class, 
	DepartmentServiceTest.class, 
	CommonUtilTest.class}
)
public class TestSuite {
}

// Unit Test - JUnit
// 目标 - 测试方法
// 原理 - 黑盒测试 - 不知道方法的实现细节 用实际输出和预期值的比较来判定方法实现是否正确
// Assert
//		- assertEquals / - assertNotEquals
//		- assertTrue / assertFalse
// 	- assertNull / assertNotNull
//		- assertSame / assertNotSame
//		- assertThat
//			- Matcher
//			- hamcrest ---> Matchers
// JUnit 4
//		@Test
//			timeout  	--- 测试的超时时间
//			expected	--- 测试期望发生的异常
// Spring TestFramework
//		@RunWith(SpringJUnit4ClassRunner.class)
//		@ContextConfiguration
//			- classes
//			- locations
//		@Autowired
//		模拟MVC请求
//		MockMvcBuilders.standaloneSetup(controller)
//		MockMvc.perform(...)
//		MockMvcRequestBuilders.get(url)
//			.andExpect(MockMvcResultMatchers.view().name(...))
//			.andExpect(MockMvcResultMatchers.model().attributeExists(...))
//		将暂时还没有的对象模拟出来
// 	Mockito
//			mock(Class)
//			when(methodCall).thenReturn(...)
// 	将测试例组装成测试集
//		@RunWith(Suite.class)
//		@SuiteClasses( ... )








