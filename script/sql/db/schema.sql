
CREATE SCHEMA school AUTHORIZATION postgres;
CREATE SCHEMA store AUTHORIZATION postgres;

CREATE TABLE school.teacher (
                                 id bigserial NOT NULL,
                                 username varchar NULL,
                                 CONSTRAINT teacher_pk PRIMARY KEY (id)
);
COMMENT ON TABLE school.teacher IS '教师信息表';

-- Column comments

COMMENT ON COLUMN school.teacher.username IS '姓名';


CREATE TABLE school.student (
                                 id bigserial NOT NULL,
                                 first_name varchar NOT NULL,
                                 last_name varchar NOT NULL,
                                 create_time timestamp NULL,
                                 age int2 NULL,
                                 gender varchar NULL,
                                 is_delete int2 DEFAULT 0 NOT NULL,
                                 CONSTRAINT student_pk PRIMARY KEY (id)
);
COMMENT ON TABLE school.student IS '学生信息表';

-- Column comments

COMMENT ON COLUMN school.student.create_time IS '入学时间';
COMMENT ON COLUMN school.student.age IS '年龄';
COMMENT ON COLUMN school.student.gender IS '性别';
COMMENT ON COLUMN school.student.is_delete IS '是否删除， 0 否 1是';

CREATE TABLE school.course (
                                id bigserial NOT NULL,
                                course_name varchar NOT NULL,
                                course_code varchar NOT NULL,
                                CONSTRAINT course_pk PRIMARY KEY (id)
);
COMMENT ON TABLE school.course IS '课程信息表';

-- Column comments

COMMENT ON COLUMN school.course.course_name IS '课程名称';
COMMENT ON COLUMN school.course.course_code IS '课程编码';


CREATE TABLE school.student_score (
                                       student_id bigint NOT NULL,
                                       course_id bigint NOT NULL,
                                       score varchar DEFAULT '0' NOT NULL
);
COMMENT ON TABLE school.student_score IS '学生课程分数表';

-- Column comments

COMMENT ON COLUMN school.student_score.student_id IS '学生 id';
COMMENT ON COLUMN school.student_score.course_id IS '课程 id';
COMMENT ON COLUMN school.student_score.score IS '分数';


-- store

CREATE TABLE store.tb_person (
                                 id bigserial NOT NULL,
                                 username varchar NOT NULL, -- 用户名称
                                 address varchar NOT NULL, -- 地址
                                 phone varchar(11) NULL, -- 手机号
                                 CONSTRAINT tb_person_pk PRIMARY KEY (id)
);
COMMENT ON TABLE store.tb_person IS '用户表';

-- Column comments

COMMENT ON COLUMN store.tb_person.username IS '用户名称';
COMMENT ON COLUMN store.tb_person.address IS '地址';
COMMENT ON COLUMN store.tb_person.phone IS '手机号';

CREATE TABLE store.tb_product (
                                  id bigserial NOT NULL,
                                  pro_name varchar NOT NULL, -- 商品名称
                                  code varchar NOT NULL, -- 商品编码
                                  category_id int8 NULL, -- 商品分类
                                  stock_num int8 NULL, -- 商品数量
                                  price numeric NULL, -- 单价
                                  CONSTRAINT tb_product_pk PRIMARY KEY (id)
);
COMMENT ON TABLE store.tb_product IS '商品表';

-- Column comments

COMMENT ON COLUMN store.tb_product.pro_name IS '商品名称';
COMMENT ON COLUMN store.tb_product.code IS '商品编码';
COMMENT ON COLUMN store.tb_product.category_id IS '商品分类';
COMMENT ON COLUMN store.tb_product.stock_num IS '商品数量';
COMMENT ON COLUMN store.tb_product.price IS '单价';


CREATE TABLE store.tb_category (
                                   id bigserial NOT NULL,
                                   "name" varchar NOT NULL, -- 名称
                                   CONSTRAINT tb_category_pk PRIMARY KEY (id)
);
COMMENT ON TABLE store.tb_category IS '商品分类表';

-- Column comments

COMMENT ON COLUMN store.tb_category."name" IS '名称';

CREATE TABLE store.tb_order (
                                id varchar NOT NULL,
                                person_id int8 NULL, -- 用户 id
                                create_time timestamp NULL, -- 创建时间
                                CONSTRAINT tb_order_pk PRIMARY KEY (id)
);
COMMENT ON TABLE store.tb_order IS '订单表';

-- Column comments

COMMENT ON COLUMN store.tb_order.person_id IS '用户 id';
COMMENT ON COLUMN store.tb_order.create_time IS '创建时间';


CREATE TABLE store.tb_order_item (
                                     id varchar NOT NULL,
                                     product_id varchar NULL, -- 商品 id
                                     product_num int8 NULL, -- 数量
                                     order_id varchar NULL, -- 关联订单 id
                                     CONSTRAINT tb_order_item_pk PRIMARY KEY (id)
);
COMMENT ON TABLE store.tb_order_item IS '订单详情表';

-- Column comments

COMMENT ON COLUMN store.tb_order_item.product_id IS '商品 id';
COMMENT ON COLUMN store.tb_order_item.product_num IS '数量';
COMMENT ON COLUMN store.tb_order_item.order_id IS '关联订单 id';