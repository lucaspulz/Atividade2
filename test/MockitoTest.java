	import org.junit.Before;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.Mockito;
	import org.mockito.junit.MockitoJUnitRunner;
	import junit.framework.Assert;

	import static org.mockito.Mockito.*;

	@RunWith(MockitoJUnitRunner.class)
	public class MockitoTest {

		private CorreioService cs;
		
		@Before
		public void init() {
			CorreioService cs = Mockito.mock(CorreioService.class);
		}
		
		
		
		
		@Test
		public void testValidaBuscaCep() {
			CorreioService cs = Mockito.mock(CorreioService.class);
			when(cs.buscaEndereco("9000000")).thenReturn("Porto Alegre");
			Assert.assertEquals("Porto Alegre", cs.buscaEndereco("9000000"));
			
			
			
		}
		@Test
		public void testValidaBuscaCep2() {
			CorreioService cs = Mockito.mock(CorreioService.class);
			when(cs.buscaEndereco("8000000")).thenReturn("Av. Assis Brasil");
			Assert.assertEquals("Av. Assis Brasil", cs.buscaEndereco("8000000"));
			
			
			
		}
		
}
