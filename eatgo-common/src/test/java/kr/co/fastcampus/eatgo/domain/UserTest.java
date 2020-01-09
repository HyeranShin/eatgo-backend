package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void creation() {
        User user = User.builder()
                .email("tester@example.com")
                .name("테스터")
                .level(100L)
                .build();

        assertThat(user.getName(), is("테스터"));
        assertThat(user.isAdmin(), is(true));
        assertThat(user.isAdmin(), is(true));

        user.deactivate();

        assertThat(user.isActive(), is(false));
    }

    @Test
    public void accessTokenWithPassword() {
        User user = User.builder()
                .password("ACCESSTOKEN")
                .build();

        assertThat(user.getAccessToken(), is("ACCESSTOKE"));
    }

    @Test
    public void accessTokenWithoutPassword() {
        User user = new User();

        assertThat(user.getAccessToken(), is(""));
    }
}