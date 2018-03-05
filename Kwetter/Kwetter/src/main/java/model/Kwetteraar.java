/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laurent
 */
public class Kwetteraar {
    private long id;
    private String email;
    private String username;
    private String password;
    private String bio;
    private String location;
    private String website;
    private String profilePicture;
    
    private List<Kweet> ownedTweets;
    private List<Kweet> mentionedBy;
    private List<Kweet> likes;
    
    private List<Kwetteraar> follows;
    private List<Kwetteraar> followers;
    
    private Role role;
    
    public Kwetteraar(Role role){
        ownedTweets = new ArrayList();
        mentionedBy = new ArrayList();
        likes = new ArrayList();
        follows = new ArrayList();
        followers = new ArrayList();
        this.role = role;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<Kweet> getOwnedTweets() {
        return ownedTweets;
    }

    public void setOwnedTweets(List<Kweet> ownedTweets) {
        this.ownedTweets = ownedTweets;
    }

    public List<Kweet> getMentionedBy() {
        return mentionedBy;
    }

    public void setMentionedBy(List<Kweet> mentionedBy) {
        this.mentionedBy = mentionedBy;
    }

    public List<Kweet> getLikes() {
        return likes;
    }

    public void setLikes(List<Kweet> likes) {
        this.likes = likes;
    }

    public List<Kwetteraar> getFollows() {
        return follows;
    }

    public void setFollows(List<Kwetteraar> follows) {
        this.follows = follows;
    }

    public List<Kwetteraar> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Kwetteraar> followers) {
        this.followers = followers;
    }
    
    
    
}
