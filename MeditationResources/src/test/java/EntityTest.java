	import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpacrud.data.BookDAO;
import com.skilldistillery.jpacrud.data.BookDAOImpl;
import com.skilldistillery.jpacrud.data.CenterDAO;
import com.skilldistillery.jpacrud.data.CenterDAOImpl;
import com.skilldistillery.jpacrud.data.TeacherDAO;
import com.skilldistillery.jpacrud.data.TeacherDAOImpl;
import com.skilldistillery.jpacrud.entities.Teacher;

class EntityTest {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	TeacherDAO tDao;
	CenterDAO cDao;
	BookDAO bDao;

	@BeforeEach
	void setUp() throws Exception {
		tDao = new TeacherDAOImpl();
		cDao = new CenterDAOImpl();
		bDao = new BookDAOImpl();
		emf = Persistence.createEntityManagerFactory("CrudApp");
		em =  emf.createEntityManager(); 
	}


	@AfterEach
	void tearDown() throws Exception {
		tDao = null;
	}

	@Test
	void testTeacher() {
		Teacher teacher = new Teacher();
		teacher.setFirstName("testFirstName");
		teacher.setLastName("testLastName");
		teacher.setTradition("testTradition");
		teacher.setDescription("testDescription");
		//Test Add
		Teacher managed = tDao.addTeacher(teacher);
		//Test still contains
		assertEquals(managed, em.find(Teacher.class, managed.getId()));
		//Test update
		teacher.setFirstName("testFirstName2");
		teacher.setLastName("testLastName2");
		teacher.setTradition("testTradition2");
		teacher.setDescription("testDescription2");
		tDao.updateTeacher(managed.getId(), teacher);
		assertEquals("testFirstName2", em.find(Teacher.class, managed.getId()).getFirstName());
		
		//
	}

}
