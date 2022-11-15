import java.util.LinkedList;

public class Session {

    protected long sessionID;
    private long timeLimit;
    private LinkedList<Session> alternativeSessions;
    private boolean clientHasHeadband;
    private String summaryBrief;

    public Session(long sessionID) {
        this.sessionID = sessionID;
    }

    public long getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
    }

    public LinkedList<Session> getAlternativeSessions() {
        return alternativeSessions;
    }

    public void setAlternativeSessions(LinkedList<Session> alternativeSessions) {
        this.alternativeSessions = alternativeSessions;
    }

    public boolean isClientHasHeadband() {
        return clientHasHeadband;
    }

    public void setClientHasHeadband(boolean clientHasHeadband) {
        this.clientHasHeadband = clientHasHeadband;
    }

    public String getSummaryBrief() {
        return summaryBrief;
    }

    public void setSummaryBrief(String summaryBrief) {
        this.summaryBrief = summaryBrief;
    }
}
