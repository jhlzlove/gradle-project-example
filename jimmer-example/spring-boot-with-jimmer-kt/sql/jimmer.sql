--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1
-- Dumped by pg_dump version 16.3

-- Started on 2024-05-21 11:00:19

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE db_jimmer;
--
-- TOC entry 4849 (class 1262 OID 32904)
-- Name: db_jimmer; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE db_jimmer WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Chinese (Simplified)_China.936';


\connect db_jimmer

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA public;


--
-- TOC entry 4850 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 32905)
-- Name: category; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.category (
    id bigint NOT NULL,
    code character varying NOT NULL,
    parent_id bigint,
    name character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- TOC entry 4851 (class 0 OID 0)
-- Dependencies: 215
-- Name: TABLE category; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.category IS '类型表';


--
-- TOC entry 4852 (class 0 OID 0)
-- Dependencies: 215
-- Name: COLUMN category.code; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.category.code IS '编码';


--
-- TOC entry 4853 (class 0 OID 0)
-- Dependencies: 215
-- Name: COLUMN category.parent_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.category.parent_id IS '父编码';


--
-- TOC entry 4854 (class 0 OID 0)
-- Dependencies: 215
-- Name: COLUMN category.name; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.category.name IS '名称';


--
-- TOC entry 4855 (class 0 OID 0)
-- Dependencies: 215
-- Name: COLUMN category.create_time; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.category.create_time IS '创建时间';


--
-- TOC entry 216 (class 1259 OID 32911)
-- Name: category_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4856 (class 0 OID 0)
-- Dependencies: 216
-- Name: category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.category_id_seq OWNED BY public.category.id;


--
-- TOC entry 217 (class 1259 OID 32912)
-- Name: db_course; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_course (
    course_id bigint NOT NULL,
    course_name character varying NOT NULL,
    course_code character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- TOC entry 4857 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_course.course_name; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';


--
-- TOC entry 4858 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_course.course_code; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


--
-- TOC entry 4859 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_course.create_time; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_course.create_time IS '创建时间';


--
-- TOC entry 218 (class 1259 OID 32918)
-- Name: db_course_course_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_course_course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4860 (class 0 OID 0)
-- Dependencies: 218
-- Name: db_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_course_course_id_seq OWNED BY public.db_course.course_id;


--
-- TOC entry 219 (class 1259 OID 32919)
-- Name: db_stu_course; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_stu_course (
    course_id bigint NOT NULL,
    student_id bigint NOT NULL
);


--
-- TOC entry 4861 (class 0 OID 0)
-- Dependencies: 219
-- Name: TABLE db_stu_course; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.db_stu_course IS '学生课程关联表';


--
-- TOC entry 4862 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_stu_course.course_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';


--
-- TOC entry 4863 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_stu_course.student_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_stu_course.student_id IS '学生id';


--
-- TOC entry 220 (class 1259 OID 32922)
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_stu_course_course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4864 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_stu_course_course_id_seq OWNED BY public.db_stu_course.course_id;


--
-- TOC entry 221 (class 1259 OID 32923)
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_stu_course_student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4865 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_stu_course_student_id_seq OWNED BY public.db_stu_course.student_id;


--
-- TOC entry 222 (class 1259 OID 32924)
-- Name: db_student; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_student (
    user_id bigint NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    gender character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    update_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    create_by character varying,
    update_by character varying,
    remark character varying
);


--
-- TOC entry 4866 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.first_name; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';


--
-- TOC entry 4867 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.last_name; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.last_name IS '名字';


--
-- TOC entry 4868 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.gender; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.gender IS '性别';


--
-- TOC entry 4869 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.create_time; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.create_time IS '创建时间';


--
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.update_time; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.update_time IS '更新时间';


--
-- TOC entry 4871 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.create_by; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.create_by IS '创建人';


--
-- TOC entry 4872 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.update_by; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.update_by IS '更新人';


--
-- TOC entry 4873 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_student.remark; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_student.remark IS '备注';


--
-- TOC entry 223 (class 1259 OID 32931)
-- Name: db_student_user_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_student_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4874 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_student_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_student_user_id_seq OWNED BY public.db_student.user_id;


--
-- TOC entry 224 (class 1259 OID 32932)
-- Name: db_teacher; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_teacher (
    teacher_id bigint NOT NULL,
    teacher_name character varying NOT NULL,
    teacher_code character varying NOT NULL,
    remark character varying,
    create_time timestamp with time zone
);


--
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 224
-- Name: TABLE db_teacher; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.db_teacher IS '教师表';


--
-- TOC entry 4876 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_teacher.teacher_name; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher.teacher_name IS '姓名';


--
-- TOC entry 4877 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_teacher.teacher_code; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher.teacher_code IS '教师资格证编码';


--
-- TOC entry 4878 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_teacher.remark; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher.remark IS '备注';


--
-- TOC entry 4879 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_teacher.create_time; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher.create_time IS '入职时间';


--
-- TOC entry 225 (class 1259 OID 32937)
-- Name: db_teacher_course; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_teacher_course (
    teacher_id bigint NOT NULL,
    course_id bigint NOT NULL
);


--
-- TOC entry 4880 (class 0 OID 0)
-- Dependencies: 225
-- Name: TABLE db_teacher_course; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.db_teacher_course IS '教师课程关联表';


--
-- TOC entry 4881 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher_course.teacher_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher_course.teacher_id IS '教师id';


--
-- TOC entry 4882 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher_course.course_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_teacher_course.course_id IS '课程id';


--
-- TOC entry 226 (class 1259 OID 32940)
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_teacher_teacher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4883 (class 0 OID 0)
-- Dependencies: 226
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_teacher_teacher_id_seq OWNED BY public.db_teacher.teacher_id;


--
-- TOC entry 228 (class 1259 OID 32988)
-- Name: db_test; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.db_test (
    id bigint NOT NULL,
    username character varying NOT NULL,
    gender character varying NOT NULL,
    birthday date,
    address character varying,
    create_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    update_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    remark character varying
);


--
-- TOC entry 4884 (class 0 OID 0)
-- Dependencies: 228
-- Name: COLUMN db_test.username; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_test.username IS '姓名';


--
-- TOC entry 4885 (class 0 OID 0)
-- Dependencies: 228
-- Name: COLUMN db_test.gender; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_test.gender IS '性别';


--
-- TOC entry 4886 (class 0 OID 0)
-- Dependencies: 228
-- Name: COLUMN db_test.birthday; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_test.birthday IS '生日';


--
-- TOC entry 4887 (class 0 OID 0)
-- Dependencies: 228
-- Name: COLUMN db_test.address; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.db_test.address IS '住址';


--
-- TOC entry 227 (class 1259 OID 32987)
-- Name: db_test_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.db_test_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 4888 (class 0 OID 0)
-- Dependencies: 227
-- Name: db_test_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.db_test_id_seq OWNED BY public.db_test.id;


--
-- TOC entry 4664 (class 2604 OID 32941)
-- Name: category id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.category ALTER COLUMN id SET DEFAULT nextval('public.category_id_seq'::regclass);


--
-- TOC entry 4666 (class 2604 OID 32942)
-- Name: db_course course_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_course_course_id_seq'::regclass);


--
-- TOC entry 4668 (class 2604 OID 32943)
-- Name: db_stu_course course_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_stu_course_course_id_seq'::regclass);


--
-- TOC entry 4669 (class 2604 OID 32944)
-- Name: db_stu_course student_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN student_id SET DEFAULT nextval('public.db_stu_course_student_id_seq'::regclass);


--
-- TOC entry 4670 (class 2604 OID 32945)
-- Name: db_student user_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_student ALTER COLUMN user_id SET DEFAULT nextval('public.db_student_user_id_seq'::regclass);


--
-- TOC entry 4673 (class 2604 OID 32946)
-- Name: db_teacher teacher_id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_teacher ALTER COLUMN teacher_id SET DEFAULT nextval('public.db_teacher_teacher_id_seq'::regclass);


--
-- TOC entry 4674 (class 2604 OID 32991)
-- Name: db_test id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_test ALTER COLUMN id SET DEFAULT nextval('public.db_test_id_seq'::regclass);


--
-- TOC entry 4830 (class 0 OID 32905)
-- Dependencies: 215
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.category VALUES (1, '1715442885049', NULL, '商品', '2024-05-11 23:54:45.0636');
INSERT INTO public.category VALUES (2, '1715443083927', NULL, '裙子', '2024-05-11 23:58:03.940474');
INSERT INTO public.category VALUES (3, '1715443185114', 2, '连衣裙', '2024-05-11 23:59:45.12717');
INSERT INTO public.category VALUES (4, '1715443208588', 2, '露肩裙', '2024-05-12 00:00:08.590134');
INSERT INTO public.category VALUES (5, '1715443222724', 3, '粉色连衣裙', '2024-05-12 00:00:22.72656');
INSERT INTO public.category VALUES (6, '1715443230984', 3, '青色连衣裙', '2024-05-12 00:00:30.986247');
INSERT INTO public.category VALUES (8, '1715477202699', 3, '紫色连衣裙', '2024-05-12 09:26:42.702663');
INSERT INTO public.category VALUES (9, '1715477300505', 4, '双露肩', '2024-05-12 09:28:20.505936');
INSERT INTO public.category VALUES (7, '1715477147053', 4, '粉色单露肩', '2024-05-12 09:25:47.068447');


--
-- TOC entry 4832 (class 0 OID 32912)
-- Dependencies: 217
-- Data for Name: db_course; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.db_course VALUES (16, '剑术', '6809e3043c5a463d926e2734df5c349a', '2024-05-16 14:59:07.192746');
INSERT INTO public.db_course VALUES (17, '诗歌', 'f90b27f4e3e546de94fb737cfec6244a', '2024-05-16 14:59:07.193662');
INSERT INTO public.db_course VALUES (18, '书法', '662b28563725418c9ae565a55b3c04f3', '2024-05-16 14:59:07.194204');
INSERT INTO public.db_course VALUES (19, '古文', 'cef78364b0224b0fb9f704ba737750db', '2024-05-16 15:00:42.863816');


--
-- TOC entry 4834 (class 0 OID 32919)
-- Dependencies: 219
-- Data for Name: db_stu_course; Type: TABLE DATA; Schema: public; Owner: -
--



--
-- TOC entry 4837 (class 0 OID 32924)
-- Dependencies: 222
-- Data for Name: db_student; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.db_student VALUES (1, '楚', '凛風', 'MALE', '2024-04-16 10:53:48.145409', '2024-04-16 10:53:48.145409', NULL, NULL, NULL);
INSERT INTO public.db_student VALUES (2, '白', '亦非', 'MALE', '2024-04-16 12:58:37.936771', '2024-04-16 12:58:37.936771', NULL, NULL, NULL);


--
-- TOC entry 4839 (class 0 OID 32932)
-- Dependencies: 224
-- Data for Name: db_teacher; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.db_teacher VALUES (7, '李太白', 'litaibai', NULL, '2024-05-16 15:00:42.85701+08');


--
-- TOC entry 4840 (class 0 OID 32937)
-- Dependencies: 225
-- Data for Name: db_teacher_course; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.db_teacher_course VALUES (7, 16);
INSERT INTO public.db_teacher_course VALUES (7, 17);
INSERT INTO public.db_teacher_course VALUES (7, 18);
INSERT INTO public.db_teacher_course VALUES (7, 19);


--
-- TOC entry 4843 (class 0 OID 32988)
-- Dependencies: 228
-- Data for Name: db_test; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.db_test VALUES (1, '江湖浪子', 'MALE', '2000-10-01', '地球', '2024-05-21 10:47:18.989803+08', '2024-05-21 10:47:18.989803+08', NULL);


--
-- TOC entry 4889 (class 0 OID 0)
-- Dependencies: 216
-- Name: category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.category_id_seq', 9, true);


--
-- TOC entry 4890 (class 0 OID 0)
-- Dependencies: 218
-- Name: db_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_course_course_id_seq', 19, true);


--
-- TOC entry 4891 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_stu_course_course_id_seq', 1, false);


--
-- TOC entry 4892 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_stu_course_student_id_seq', 1, false);


--
-- TOC entry 4893 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_student_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_student_user_id_seq', 2, true);


--
-- TOC entry 4894 (class 0 OID 0)
-- Dependencies: 226
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_teacher_teacher_id_seq', 7, true);


--
-- TOC entry 4895 (class 0 OID 0)
-- Dependencies: 227
-- Name: db_test_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.db_test_id_seq', 1, true);


--
-- TOC entry 4678 (class 2606 OID 32948)
-- Name: category category_pk; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pk PRIMARY KEY (id);


--
-- TOC entry 4680 (class 2606 OID 32950)
-- Name: db_course db_course_pk; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_pk PRIMARY KEY (course_id);


--
-- TOC entry 4682 (class 2606 OID 32952)
-- Name: db_student db_student_pk; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_pk PRIMARY KEY (user_id);


--
-- TOC entry 4684 (class 2606 OID 32954)
-- Name: db_teacher db_teacher_pk; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_teacher
    ADD CONSTRAINT db_teacher_pk PRIMARY KEY (teacher_id);


--
-- TOC entry 4686 (class 2606 OID 32997)
-- Name: db_test db_test_pk; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.db_test
    ADD CONSTRAINT db_test_pk PRIMARY KEY (id);


-- Completed on 2024-05-21 11:00:19

--
-- PostgreSQL database dump complete
--

