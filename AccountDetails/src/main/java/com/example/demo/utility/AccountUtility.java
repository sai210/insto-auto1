package com.example.demo.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;
@Component
public class AccountUtility {
	
    public Set<AccountEntity> getAllAccountDetails() throws ParseException{
    	Set<AccountEntity> set=new HashSet();
		
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
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	set.add(e6);
	set.add(e7);
	set.add(e8);
	set.add(e9);
	set.add(e10);
	set.add(e11);
	
	
	return set;
	
	} 
    
    
    public List<TransactionEntity> getByAccountNumber(Integer accountNumber)throws ParseException{
    	List<TransactionEntity> list=new ArrayList();
    
    	
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
    
    
    list.add(t1);
    list.add(t2);
    list.add(t3);
    list.add(t4);
    list.add(t5);
    list.add(t6);
    list.add(t7);
    list.add(t8);
    list.add(t9);
    list.add(t10);
    list.add(t11);
    
    
    return list;
    
}
    
}

