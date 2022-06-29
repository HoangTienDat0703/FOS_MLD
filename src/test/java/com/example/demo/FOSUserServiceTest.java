package com.example.demo;

import com.example.demo.entities.FOSUser;
import com.example.demo.entities.Role;
import com.example.demo.repo.FOSUserRepository;
import com.example.demo.service.FOSUserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FOSUserServiceTest {

//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    private MockMvc mockMvc;

    @InjectMocks
    private FOSUserService fosUserService;

    @Mock
    private FOSUserRepository fosUserRepository;

//    @Before
//    public void setUp(){
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }

    @Test
    public void getAllFOSUserTest(){
        List<FOSUser> expect = new ArrayList<>();
        expect.add(new FOSUser(20l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null));
        List<FOSUser> actual = new ArrayList<>();
        actual.add(new FOSUser(20l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null));

        Mockito.when(fosUserRepository.findAll()).thenReturn(actual);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void addFOSUserTest(){
        FOSUser actual = new FOSUser(20l, "hoang tien dat111111","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null);
        Mockito.when(fosUserRepository.save(actual)).thenReturn(actual);

        Assert.assertEquals(actual,fosUserService.addFOSUser(actual));
    }

    @Test
    public void updateFOSUserTest(){
        Role roleExpect = new Role(1l,"ADMIN");
        Role roleActual = new Role(1l,"ADMIN");
        FOSUser expect = new FOSUser(20l, "hoang tien dat111111","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",roleExpect);
        FOSUser actual = new FOSUser(20l, "hoang tien dat111111","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",roleActual);
        Mockito.when(fosUserRepository.save(actual)).thenReturn(actual);

//        expect = fosUserService.updateFOSUser(expect);
//        actual = fosUserService.updateFOSUser(actual);

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void getAllFOSUserByIdTest(){
        FOSUser expect = new FOSUser(20l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null);
        FOSUser actual = new FOSUser(20l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null);

        Mockito.when(fosUserRepository.getById(actual.getUserId())).thenReturn(actual);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void deleteFOSUserByIdTest(){
        FOSUser fosUser = new FOSUser(25l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null);
//        FOSUser actual = new FOSUser(20l, "hoang tien dat","dat1", "12345","nam","0966564666","dat1@gmail.com",1,"image",null);

//        fosUserService.deleteFOSUser(fosUser.getUserId());
        Mockito.when(fosUserService.deleteFOSUser(fosUser.getUserId())).thenReturn(true);
    }
}
