package no.feedapp.group2.FeedApp;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
public class Poll {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Customer user;

    @ManyToOne
    private Statuses status;

    private String question;

    private int redCount;

    private int greenCount;

    private int timeLimitInMinutes;

    private boolean privatePoll;

    protected Poll(){}

    public Poll(Customer user, Statuses status, String question, int timeLimitInMinutes, boolean privatePoll){
        this.user = user;
        this.status = status;
        this.question = question;
        this.timeLimitInMinutes = timeLimitInMinutes;
        this.privatePoll = privatePoll;
        this.redCount = 0;
        this.greenCount = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Poll[id=%d, user='%s', question='%s', redCount='%s', greenCount='%s']",
                id, user.toString(), question, redCount, greenCount);
    }
}
