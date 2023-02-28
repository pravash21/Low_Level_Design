package com.facebook;

import java.util.Date;

public class ConnectionInvitation {
    private Member meberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;
    public boolean acceptConnection() {
        return true;
    }
    public boolean rejectConnection() {
        return true;
    }
}
