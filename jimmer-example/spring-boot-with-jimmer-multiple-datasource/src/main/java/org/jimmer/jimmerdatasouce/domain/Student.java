package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.Formula;
import org.babyfish.jimmer.sql.*;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_student")
public interface Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    @Key
    String firstName();

    @Key
    String lastName();

    @IdView
    @Nullable
    Long collegeId();

    Gender gender();

    @Nullable
    LocalDateTime birthday();

    /**
     * 简单计算属性，获取全名
     */
    @Formula(dependencies = {"firstName", "lastName"})
    default String fullName() {
        return firstName() + lastName();
    }

    /**
     * 多对多关系映射 主动方
     * 由于本项目基于中间表关联，数据库层面没有真正的外键，所以使用 joinColumns、inverseJoinColumns
     * 如果是真外键，使用 joinColumnName、inverseJoinColumnName 指定主键名称即可
     * 使用 @JoinTable (name = "中间表名称") 指定中间表名称，而不是使用默认的 两表类名_MAPPING(STUDENT_COURSE_MAPPING)
     */
    @ManyToMany
    @JoinTable(
            name = "db_stu_course",
            joinColumns = {@JoinColumn(name = "stu_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    List<Course> courses();

    @ManyToOne
    @Nullable
    College college();
}
