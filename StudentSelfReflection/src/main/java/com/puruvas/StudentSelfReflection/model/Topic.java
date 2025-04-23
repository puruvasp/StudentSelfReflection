package com.puruvas.StudentSelfReflection.model;

import com.puruvas.StudentSelfReflection.constants.TopicStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Topic extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topicId;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private TopicStatus eTopicStatus;

    @ManyToOne
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;
}