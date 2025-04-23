package com.puruvas.StudentSelfReflection.constants;

public enum TopicStatus {
    NOT_STARTED("NOT_STARTED"),
    STARTED("STARTED"),
    SKIPPED("SKIPPED"),
    FINISHED("FINSIHED");

    private final String topicStatus;


    private TopicStatus(String topicStatus)
    {
        this.topicStatus = topicStatus;
    }

    public String getTopicStatus()
    {
        return this.topicStatus;
    }
}
