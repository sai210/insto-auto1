package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.service.AccountService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value=AccountController.class)
class AccountControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AccountService accountService;
	
	@Test
	public void testAccountDetails() throws Exception {
		Set<AccountEntity> mockAccountSet=new HashSet();
		
		
		
		AccountEntity e1=new AccountEntity(585309209,"SGSavings726","Savings","08/11/2018","SGD",84327.51);
		AccountEntity e2=new AccountEntity(791066619,"AUSavings933","Savings","08/11/2018","AUD",88005.93);
		AccountEntity e3=new AccountEntity(321143048,"AUCurrent433","Current","08/11/2018","AUD",38010.62);
		AccountEntity e4=new AccountEntity(347786244,"SGCurrent166","Current","08/11/2018","SGD",50664.65);
		AccountEntity e5=new AccountEntity(680168913,"AUCurrent374","Current","08/11/2018","AUD",41327.28);
		AccountEntity e6=new AccountEntity(136056165,"AUSavings938","Savings","08/11/2018","AUD",48928.79);
		AccountEntity e7=new AccountEntity(453963528,"SGSavings842","Current","08/11/2018","SGD",72117.53);
		AccountEntity e8=new AccountEntity(334666982,"AUSavings253","Savings","08/11/2018","AUD",20588.16);
		AccountEntity e9=new AccountEntity(793949180,"AUCurrent754","Current","08/11/2018","AUD",88794.48);
		AccountEntity e10=new AccountEntity(768759901,"SGCurrent294","Current","08/11/2018","SGD",5906.55);
		AccountEntity e11=new AccountEntity(847257972,"AUCurrent591","Current","08/11/2018","AUD",92561.68);
		
		mockAccountSet.add(e1);
		mockAccountSet.add(e2);
		mockAccountSet.add(e3);
		mockAccountSet.add(e4);
		mockAccountSet.add(e5);
		mockAccountSet.add(e6);
		mockAccountSet.add(e7);
		mockAccountSet.add(e8);
		mockAccountSet.add(e9);
		mockAccountSet.add(e10);
		mockAccountSet.add(e11);
		System.out.println(mockAccountSet);
		
		String inputInJson = this.mapToJson(mockAccountSet);
		
		String URI = "/getAllAccountDetails";
		
		Mockito.when(accountService.getAllAccountDetails()).thenReturn(mockAccountSet);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get(URI)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String outputInJson = response.getContentAsString();
		
		assertThat(outputInJson).isEqualTo(inputInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}
	
	
	@Test
	public void testTransactionDetails() throws Exception {
		List<TransactionEntity> mockTransactionlist=new ArrayList();
	    
    	
	    TransactionEntity t1=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",9540.98,"Credit","");
	    TransactionEntity t2=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",7497.82,"Credit","");
	    TransactionEntity t3=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",5564.79,"Credit","");
	    TransactionEntity t4=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",8136.18,"Credit","");
	    TransactionEntity t5=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",9442.46,"Credit","");
	    TransactionEntity t6=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",7614.45,"Credit","");
	    TransactionEntity t7=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",3311.54,"Credit","");
	    TransactionEntity t8=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",9188.09,"Credit","");
	    TransactionEntity t9=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",1905.15,"Credit","");
	    TransactionEntity t10=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",197.78,"Credit","");
	    TransactionEntity t11=new TransactionEntity(1232223212,"Current Account","12/01/2012","SGD","",8430.49,"Credit","");
	    
	    
	    mockTransactionlist.add(t1);
	    mockTransactionlist.add(t2);
	    mockTransactionlist.add(t3);
	    mockTransactionlist.add(t4);
	    mockTransactionlist.add(t5);
	    mockTransactionlist.add(t6);
	    mockTransactionlist.add(t7);
	    mockTransactionlist.add(t8);
	    mockTransactionlist.add(t9);
	    mockTransactionlist.add(t10);
	    mockTransactionlist.add(t11);
	    
	    
	    
		String inputInJson = this.mapToJson(mockTransactionlist);
		
		String URI = "/getByAccountNumber/1232223212";
		
		Mockito.when(accountService.getByAccountNumber(1232223212)).thenReturn(mockTransactionlist);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get(URI)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String outputInJson = response.getContentAsString();
		System.out.println(outputInJson);
		assertThat(outputInJson).isEqualTo(inputInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
	
}
