package edu.starterkit.aop;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logger
public class LoggerInterceptor {
	
	 @AroundInvoke
	   public Object manageTransaction(InvocationContext context) throws Exception { 
		 String args="";
		 for (Object arg : context.getParameters()) {
			args+=arg.toString();
		}
		 System.out.println("Method name: "+context.getMethod().getName());
		 System.out.println("Arguments: "+args);
		 Object result = context.proceed();
		 System.out.println("Result: "+result.toString());
		 return result;
	 }


}
