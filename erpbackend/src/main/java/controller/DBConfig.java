package controller;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aldercollege.dao.AddOnCoursesDAO;
import com.aldercollege.dao.AddOnCoursesDAOImpl;
import com.aldercollege.dao.BAStudentSubjectCombinationDAO;
import com.aldercollege.dao.BAStudentSubjectCombinationDAOImpl;
import com.aldercollege.dao.HigherSecondaryElectiveSubjectsDAO;
import com.aldercollege.dao.HigherSecondaryElectiveSubjectsDAOImpl;
import com.aldercollege.dao.StudentPreviousAcademicHistoryDAO;
import com.aldercollege.dao.StudentPreviousAcademicHistoryDAOImpl;
import com.aldercollege.dao.StudentProfileDAO;
import com.aldercollege.dao.StudentProfileDAOImpl;
import com.aldercollege.model.AddOnCourses;
import com.aldercollege.model.BAStudentSubjectCombination;
import com.aldercollege.model.HigherSecondaryElectiveSubjects;
import com.aldercollege.model.StudentPreviousAcademicHistory;
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
		sessionFactoryBuilder.addAnnotatedClass(StudentPreviousAcademicHistory.class);
		sessionFactoryBuilder.addAnnotatedClass(HigherSecondaryElectiveSubjects.class);
		sessionFactoryBuilder.addAnnotatedClass(BAStudentSubjectCombination.class);
		sessionFactoryBuilder.addAnnotatedClass(AddOnCourses.class);
		
		sessionFactoryBuilder.addProperties(hibernateProp);
		System.out.println("Table created???");
		SessionFactory sessionFactory=sessionFactoryBuilder.buildSessionFactory();
		System.out.println("No");
		return sessionFactory;
}	
	

	 @Bean(name="addOnCoursesDAO")
		public AddOnCoursesDAO getAddOnCousesDAO()
		{
			return new AddOnCoursesDAOImpl();
		}
	 	

	 @Bean(name="bAStudentSubjectCombinationDAO")
		public BAStudentSubjectCombinationDAO getBAStudentSubjectCombiantionDAO()
		{
			return new BAStudentSubjectCombinationDAOImpl();
			
		}
	 @Bean(name="higherSecondaryElectiveSubjectsDAO")
		public HigherSecondaryElectiveSubjectsDAO getHigherSecondaryElectiveSubjectsDAO()
		{
			return new HigherSecondaryElectiveSubjectsDAOImpl();
		}
	 @Bean(name="studentPreviousAcademicHistoryDAO")
		public StudentPreviousAcademicHistoryDAO getStudentPreviousAcademicHistoryDAO()
		{
			return new StudentPreviousAcademicHistoryDAOImpl();
		}

	 @Bean(name="studentProfileDAO")
		public StudentProfileDAO getStudentProfileDAO()
		{
			return new StudentProfileDAOImpl();
		}
	 	
	@Autowired
	@Bean(name="transactionManager")	
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{ System.out.println("transaction??");
		return new HibernateTransactionManager(sessionFactory);
		
	}
}
