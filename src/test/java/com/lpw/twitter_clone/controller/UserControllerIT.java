package com.lpw.twitter_clone.controller;

import com.lpw.twitter_clone.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("integration")
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerIT {

    @Autowired
    private UserRepository repository;

    @Autowired
    private MockMvc mockMvc;

    UserControllerIT() {
    }

    @Test
    @SqlGroup({
//            @Sql(value = "classpath:empty/reset.sql", executionPhase = BEFORE_TEST_METHOD),
//            @Sql(value = "classpath:init/user-data.sql", executionPhase = BEFORE_TEST_METHOD)
    })
    void getUser() throws Exception {
        this.mockMvc.perform(get("/users/1"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}