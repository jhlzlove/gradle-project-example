CREATE TABLE teacher
(
    id       bigserial NOT NULL,
    username varchar   NULL,
    CONSTRAINT teacher_pk PRIMARY KEY (id)
);
COMMENT ON TABLE teacher IS '教师信息表';

-- Column comments

COMMENT ON COLUMN teacher.username IS '姓名';


CREATE TABLE student
(
    id          bigserial NOT NULL,
    first_name  varchar   NOT NULL,
    last_name   varchar   NOT NULL,
    create_time timestamp NULL,
    age         int2      NULL,
    gender      varchar   NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);
COMMENT ON TABLE student IS '学生信息表';

-- Column comments

COMMENT ON COLUMN student.create_time IS '入学时间';
COMMENT ON COLUMN student.age IS '年龄';
COMMENT ON COLUMN student.gender IS '性别';


CREATE TABLE course
(
    id          bigserial NOT NULL,
    course_name varchar   NOT NULL,
    course_code varchar   NOT NULL,
    CONSTRAINT course_pk PRIMARY KEY (id)
);
COMMENT ON TABLE course IS '课程信息表';

-- Column comments

COMMENT ON COLUMN course.course_name IS '课程名称';
COMMENT ON COLUMN course.course_code IS '课程编码';


CREATE TABLE student_score
(
    student_id bigint              NOT NULL,
    course_id  bigint              NOT NULL,
    score      varchar DEFAULT '0' NOT NULL
);
COMMENT ON TABLE student_score IS '学生课程分数表';

-- Column comments

COMMENT ON COLUMN student_score.student_id IS '学生 id';
COMMENT ON COLUMN student_score.course_id IS '课程 id';
COMMENT ON COLUMN student_score.score IS '分数';