import org.junit.BeforeClass;

import com.lq.bank.MockDB;

class CustomerAccountTest {
 
	private MockDB myDb;
	
	@BeforeClass
	public void setUpBeforClass() {
		myDb= new MockDB( 187423);
	}
}
