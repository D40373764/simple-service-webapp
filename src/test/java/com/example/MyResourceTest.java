package com.example;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTestNg;
import org.testng.annotations.Test;

public class MyResourceTest extends JerseyTestNg.ContainerPerClassTest {
	 
    @Override
    protected Application configure() {
        return new ResourceConfig(MyResource.class);
    }
 
    @Test
    public void test() {
        final String response = target("myresource").request().get(String.class);
        assertEquals("Got it!", response);
    }
        
}