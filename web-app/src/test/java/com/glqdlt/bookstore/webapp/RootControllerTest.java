package com.glqdlt.bookstore.webapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


/**
 * spring boot auto configuration list..
 *
 * @author glqdlt
 * @see <a href='https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-auto-configuration-classes.html'>https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-auto-configuration-classes.html</a>
 */
@ActiveProfiles("test")
@WebMvcTest(excludeAutoConfiguration = {SecurityAutoConfiguration.class})
@RunWith(SpringRunner.class)
public class RootControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private RootController rootController;

    @Test
    public void contextInit() {
        Assert.assertNotNull(applicationContext);
        Assert.assertNotNull(rootController);
        Assert.assertNotNull(mockMvc);
    }

    @Test
    public void getRoot() throws Exception {
        ResultActions a = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/"));
        a.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.view().name("index.html"));
    }

    @Test
    public void notFounded() throws Exception {
        ResultActions a = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/abcd"));
        a.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.NOT_FOUND.value()));
    }
}