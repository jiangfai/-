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
// Ŀ�� - ���Է���
// ԭ�� - �ںв��� - ��֪��������ʵ��ϸ�� ��ʵ�������Ԥ��ֵ�ıȽ����ж�����ʵ���Ƿ���ȷ
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
//			timeout  	--- ���Եĳ�ʱʱ��
//			expected	--- ���������������쳣
// Spring TestFramework
//		@RunWith(SpringJUnit4ClassRunner.class)
//		@ContextConfiguration
//			- classes
//			- locations
//		@Autowired
//		ģ��MVC����
//		MockMvcBuilders.standaloneSetup(controller)
//		MockMvc.perform(...)
//		MockMvcRequestBuilders.get(url)
//			.andExpect(MockMvcResultMatchers.view().name(...))
//			.andExpect(MockMvcResultMatchers.model().attributeExists(...))
//		����ʱ��û�еĶ���ģ�����
// 	Mockito
//			mock(Class)
//			when(methodCall).thenReturn(...)
// 	����������װ�ɲ��Լ�
//		@RunWith(Suite.class)
//		@SuiteClasses( ... )








