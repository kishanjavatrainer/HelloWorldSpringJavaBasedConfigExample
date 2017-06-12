package com.infotech.client;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotech.config.MessageConfig;
import com.infotech.model.Message;

public class ClientTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(MessageConfig.class);
			Object object = context.getBean("message");
			if(object != null){
				Message message=(Message)object;
				
				System.out.println(message.getMessageId()+"\t"+message.getMessage());
			}
			
			System.out.println("------------------------------------");
			
			Message message = context.getBean("message", Message.class);
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
			
			System.out.println("------------------------------------");
			
			String[] aliases = context.getAliases("message");
			for (String aName : aliases) {
				System.out.println(aName);
			}
			System.out.println("------------------------------------");
			
			Message message1 = context.getBean(Message.class);
			System.out.println(message1.getMessageId()+"\t"+message1.getMessage());
			
			System.out.println("------------------------------------");
			
			Class<?> cls = context.getType("message");
			
			System.out.println(cls.getName());
			
			System.out.println("------------------------------------");
			
			System.out.println(context.isSingleton("message"));
		} catch (NoSuchBeanDefinitionException e) {
			e.printStackTrace();
		} catch (BeansException e) {
			e.printStackTrace();
		}finally{
			if(context != null)
				context.close();
		}
	}

}
