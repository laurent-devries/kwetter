/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Laurent
 */
public class Kweet {
    private String content;
    private Date date;
    private Kwetteraar owner;
    
    private List<Kwetteraar> mentions;
    private List<Kwetteraar> likedBy;
}
