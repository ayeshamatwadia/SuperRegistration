package com.example.superreg.services.impl;

import com.example.superreg.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplUnitTest {

    @Mock
    private UserRepository mockRespository;

    @Autowired
    UserServiceImpl userService = new UserServiceImpl(mockRespository);

    @Test
    void testSomethingReallyspecialandstuff() {
        assert (true == true);
    }
}
