package im.kuka.springboot.demo.model;

import java.util.Date;

/**
 * @author Cliff
 */
public class User {

    public String username;
    public Date time;

    public User() {
        super();
    }

    public User(String username) {
        this.username = username;
        time = new Date();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
