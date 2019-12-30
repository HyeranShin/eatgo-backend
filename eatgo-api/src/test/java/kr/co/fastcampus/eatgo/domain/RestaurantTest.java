package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");

        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void informain() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }
}