package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.*;

import java.util.List;

/**
 * 实体表，使用 @Entity 修饰，表名与类名不同，使用 @Table(name = "table_name") 指定
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_course")
public interface Course  {

    /**
     * Java 基本类型全部不可 null，并使用 @Id 修饰，设置生成策略为 IDENTITY 数据库自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    @Key
    String courseName();

    String courseCode();

    /**
     * 多对多关系映射 从动方
     */
    @ManyToMany(mappedBy = "courses")
    List<Student> students();
}
