package com.cbs.user.integration;

import com.cbs.user.dto.UserDto;
import com.cbs.user.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @LocalServerPort
    private int port;

    private UserDto user;

    @BeforeEach
    public void setUp() {
        // Create a test user
        user = new UserDto("firstname", "lastname", null, null);
    }

    @Test
    public void getUserById_returnsUserDto() {
        // Send a GET request to /users/{id}
        ResponseEntity<UserDto> response = restTemplate.getForEntity(getUrl("/api/users/" + 1L), UserDto.class);

        // Verify the response
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getFirstName()).isEqualTo(user.getFirstName());
    }

    private String getUrl(String path) {
        return "http://localhost:" + port + path;
    }

}

