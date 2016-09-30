package Servion.MavenProject;


import java.lang.reflect.Method;
import java.util.Vector;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;



public class MyAroundAdvice implements MethodInterceptor{
	Vector<Customer> v=new Vector<Customer>();
	
	public Object invoke(MethodInvocation invocation) throws Throwable
	{
		Customer customer=(Customer)invocation.getArguments()[0];
		if(v.contains(customer))
		{
			throw new OneShoePerCustomer("one Shoe per customer");
		}else
		{
		v.add(customer);
		}
	Shoe shoe =(Shoe)invocation.proceed();
	return shoe;
	}
	}
