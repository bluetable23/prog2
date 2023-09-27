package aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyIntegerTest {

	@Test
	void testIsZero() {
		//given
		String g=null ;
	  
	     // when
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  MyInteger.parseInt(g));

        // then
        assertEquals("Is Zero", exception.getMessage());
	}

	
	@Test
	void leererString() {
		//given
		String g="" ;
	  
	     // when
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  MyInteger.parseInt(g));

        // then
        assertEquals("ist leer", exception.getMessage());
	}
	
	@Test
	void nurPlus() {
		//given
		String g="+" ;
	  
	     // when
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  MyInteger.parseInt(g));

        // then
        assertEquals("nur '+' bzw. '-' --> keine Zahl", exception.getMessage());
	}

	@Test
	void nurMinus() {
		//given
		String g="-" ;
	  
	     // when
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  MyInteger.parseInt(g));

        // then
        assertEquals("nur '+' bzw. '-' --> keine Zahl", exception.getMessage());
	}
	
	@Test
	void keineZahl() {
		//given
		String g="-35832985a" ;
	  
	     // when
        Exception exception = assertThrows(IllegalArgumentException.class, () ->  MyInteger.parseInt(g));

        // then
        assertEquals("keine Zahl!", exception.getMessage());
	}
	
	@Test
	void minus01() {
		//given
		String g="-000001" ;
	  
        // then
        assertEquals(-1, MyInteger.parseInt(g));
	}
	

	@Test
	void nurNull() {
		//given
		String g="-00000" ;
	  
        // then
        assertEquals(0, MyInteger.parseInt(g));
	}	
	

	

	
	}

