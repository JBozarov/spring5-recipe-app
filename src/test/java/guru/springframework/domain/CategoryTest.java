package guru.springframework.domain;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CategoryTest {

	Category category; 
	
	@Before
	public void setUp() {
		category = new Category(); 
	}
	@Test
	public void getId() throws Exception {
		Long idValue = 4L; 
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}
	
	@Test
	public void getDescription() throws Exception {
		String desc = "Some desc"; 
		category.setDescription(desc);
		assertEquals(desc, category.getDescription());
	}
	
	@Test
	public void getRecipes() {
		
	}
}
