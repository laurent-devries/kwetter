/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
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

    public Kweet() {
        mentions = new ArrayList();
        likedBy = new ArrayList();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Kwetteraar getOwner() {
        return owner;
    }

    public void setOwner(Kwetteraar owner) {
        this.owner = owner;
    }

    public List<Kwetteraar> getMentions() {
        return mentions;
    }

    public void setMentions(List<Kwetteraar> mentions) {
        this.mentions = mentions;
    }

    public List<Kwetteraar> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<Kwetteraar> likedBy) {
        this.likedBy = likedBy;
    }
    
    
    
    
}
