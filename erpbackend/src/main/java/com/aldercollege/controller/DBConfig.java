package com.aldercollege.controller;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aldercollege.dao.AddOnCoursesDAO;
import com.aldercollege.dao.AddOnCoursesDAOImpl;
import com.aldercollege.dao.BASubjectComboDAO;
import com.aldercollege.dao.BASubjectComboDAOImpl;
import com.aldercollege.dao.HSElectiveSubjectsDAO;
import com.aldercollege.dao.HSElectiveSubjectsDAOImpl;
import com.aldercollege.dao.StudentPictureDAO;
import com.aldercollege.dao.StudentPictureDAOImpl;
import com.aldercollege.dao.StudentPreviousHistoryDAO;
import com.aldercollege.dao.StudentPreviousHistoryDAOImpl;
import com.aldercollege.dao.StudentProfileDAO;
import com.aldercollege.dao.StudentProfileDAOImpl;
import com.aldercollege.model.AddOnCourses;
import com.aldercollege.model.BASubjectCombo;
import com.aldercollege.model.HSElectiveSubjects;
import com.aldercollege.model.StudentPicture;
import com.aldercollege.model.StudentPreviousHistory;
import com.aldercollege.model.StudentProfile;

@Configuration
@ComponentScan("com.aldercollege")
@EnableTransactionManagement
public class DBConfig {
	  @Autowired
	  @Bean(name="datasource")
	public DataSource getDataSource()
	{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	dataSource.setUsername("lung");
	dataSource.setPassword("lung");
	
	return dataSource;
	
	}
	 @Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp=new Properties();
		hibernateProp.put("hibernate.dailect","org.hibernate.dailect.Oracle10gDialect");
		hibernateProp.put("hibernate.hbm2ddl.auto","update");	
		hibernateProp.put("hibernate.show_sql","true");
		LocalSessionFactoryBuilder sessionFactoryBuilder=new LocalSessionFactoryBuilder(getDataSource());
		sessionFactoryBuilder.addAnnotatedClass(StudentProfile.class);
		sessionFactoryBuilder.addAnnotatedClass(StudentPreviousHistory.class);
		sessionFactoryBuilder.addAnnotatedClass(HSElectiveSubjects.class);
		sessionFactoryBuilder.addAnnotatedClass(BASubjectCombo.class);
		sessionFactoryBuilder.addAnnotatedClass(AddOnCourses.class);
		sessionFactoryBuilder.addAnnotatedClass(StudentPicture.class);
		
		sessionFactoryBuilder.addProperties(hibernateProp);
		System.out.println("Table created???");
		SessionFactory sessionFactory=sessionFactoryBuilder.buildSessionFactory();
		System.out.println("Yes");
		return sessionFactory;
}	
	

	 @Bean(name="addOnCoursesDAO")
		public AddOnCoursesDAO getAddOnCousesDAO()
		{
			return new AddOnCoursesDAOImpl();
		}
	 	

	 @Bean(name="bASubjectComboDAO")
		public BASubjectComboDAO getBAStudentSubjectCombiantionDAO()
		{
			return new BASubjectComboDAOImpl();
			
		}
	 @Bean(name="hSElectiveSubjectsDAO")
		public HSElectiveSubjectsDAO getHigherSecondaryElectiveSubjectsDAO()
		{
			return new HSElectiveSubjectsDAOImpl();
		}
	 @Bean(name="studentPreviousHistoryDAO")
		public StudentPreviousHistoryDAO getStudentPreviousAcademicHistoryDAO()
		{
			return new StudentPreviousHistoryDAOImpl();
		}

	 @Bean(name="studentProfileDAO")
		public StudentProfileDAO getStudentProfileDAO()
		{
			return new StudentProfileDAOImpl();
		}
	 @Bean(name="studentPictureDAO")
		public StudentPictureDAO getStudentPictureDAO()
		{
			return new StudentPictureDAOImpl();
		}
	 	
	@Autowired
	@Bean(name="transactionManager")	
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{ 
		System.out.println("transaction??");
		return new HibernateTransactionManager(sessionFactory);
		
	}
}
