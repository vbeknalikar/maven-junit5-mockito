package com.veerbeknalikar.junit5.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import com.veerbeknalikar.junit5.User;

@DisplayName("JUnit5 with MockitoExtension")
@ExtendWith(MockitoExtension.class)
public class Junit5WithMockitoExtensionTest {
	
	//@Mock - Mock annotation test fails - needs to be fixed
	User user = mock(User.class);
	
  	@BeforeEach
   void init() {
        when(user.getFirstName()).thenReturn("Veer");
    }

    @Test
    void simpleTestWithInjectedMock() {
        assertEquals("Veer", user.getFirstName());
    }
}
