package Servion.MavenProject;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice{
public void afterThrowing(OneShoePerCustomer ospc)
{
	System.out.println("Exception Handled....."+ospc);
}
}
