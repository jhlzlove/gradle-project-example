-- public.db_course definition

-- Drop table

-- DROP TABLE db_course;

CREATE TABLE db_course ( id bigserial NOT NULL, course_name varchar NOT NULL, course_code varchar NOT NULL, CONSTRAINT db_course_pk PRIMARY KEY (id), CONSTRAINT db_course_unique UNIQUE (course_name));
COMMENT ON TABLE public.db_course IS '课程信息表';

-- Column comments

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';
COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


-- public.db_school definition

-- Drop table

-- DROP TABLE db_school;

CREATE TABLE db_school ( id int8 DEFAULT nextval('db_college_id_seq'::regclass) NOT NULL, "name" varchar NOT NULL, address varchar NULL, CONSTRAINT db_college_pk PRIMARY KEY (id));
COMMENT ON TABLE public.db_school IS '学校信息';

-- Column comments

COMMENT ON COLUMN public.db_school."name" IS '学校名称';
COMMENT ON COLUMN public.db_school.address IS '学校地址';


-- public.db_score definition

-- Drop table

-- DROP TABLE db_score;

CREATE TABLE db_score ( student_id int8 NOT NULL, course_id int8 NOT NULL, score varchar NOT NULL);
COMMENT ON TABLE public.db_score IS '学生分数信息表';

-- Column comments

COMMENT ON COLUMN public.db_score.course_id IS '课程 id';
COMMENT ON COLUMN public.db_score.score IS '分数';


-- public.db_student definition

-- Drop table

-- DROP TABLE db_student;

CREATE TABLE db_student ( id int8 DEFAULT nextval('db_student_user_id_seq'::regclass) NOT NULL, first_name varchar NOT NULL, last_name varchar NOT NULL, gender varchar NOT NULL, birthday timestamp NULL, is_delete int2 DEFAULT 0 NOT NULL, create_time timestamp NULL, update_time timestamp NULL, CONSTRAINT db_student_pk PRIMARY KEY (id));
COMMENT ON TABLE public.db_student IS '学生信息表';

-- Column comments

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';
COMMENT ON COLUMN public.db_student.last_name IS '名字';
COMMENT ON COLUMN public.db_student.gender IS '性别';
COMMENT ON COLUMN public.db_student.birthday IS '出生日期';
COMMENT ON COLUMN public.db_student.is_delete IS '删除标志1 删除 0未删除';


-- public.db_stu_course definition

-- Drop table

-- DROP TABLE db_stu_course;

CREATE TABLE db_stu_course ( stu_id int8 NOT NULL, course_id int8 NOT NULL, CONSTRAINT db_stu_course_pk PRIMARY KEY (stu_id, course_id), CONSTRAINT db_stu_course_db_course_fk FOREIGN KEY (course_id) REFERENCES db_course(id), CONSTRAINT db_stu_course_db_student_fk FOREIGN KEY (stu_id) REFERENCES db_student(id));
COMMENT ON TABLE public.db_stu_course IS '学生课程关联信息表';

-- Column comments

COMMENT ON COLUMN public.db_stu_course.stu_id IS '学生id';
COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';