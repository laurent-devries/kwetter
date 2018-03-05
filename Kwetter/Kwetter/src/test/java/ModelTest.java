/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Kwetteraar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurent
 */
public class ModelTest {
    
    @Test
    public void testGettersandSetters(){
        //TestKwetteraar
        
        long id = 1;
        String username = "laurent";
        String password = "password";
        String email = "email@email.nl";
        String bio = "this is my bio";
        String location = "eindhoven";
        String website = "laurent.nl";
        String profilePicture = "test.jpg";
        
        Kwetteraar k = new Kwetteraar();
        
        
    }
}
