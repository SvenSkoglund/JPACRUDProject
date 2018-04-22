	import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skilldistillery.jpacrud.data.BookDAO;
import com.skilldistillery.jpacrud.data.CenterDAO;
import com.skilldistillery.jpacrud.data.TeacherDAO;
import com.skilldistillery.jpacrud.entities.Teacher;

class EntityTest {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	TeacherDAO tDao;
	@Autowired
	CenterDAO cDao;
	@Autowired
	BookDAO bDao;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
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
		assertEquals("testFirstName2", em.find(Teacher.class, managed.getId()));
	}

}
