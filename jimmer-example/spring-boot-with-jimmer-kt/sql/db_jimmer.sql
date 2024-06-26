--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-06-26 13:19:09

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
-- TOC entry 4899 (class 1262 OID 16436)
-- Name: db_jimmer; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE db_jimmer WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Chinese (Simplified)_China.936';


ALTER DATABASE db_jimmer OWNER TO postgres;

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
-- Name: public; Type: SCHEMA; Schema: -; Owner: pg_database_owner
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO pg_database_owner;

--
-- TOC entry 4900 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 223 (class 1259 OID 17182)
-- Name: category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.category (
    id bigint NOT NULL,
    code character varying NOT NULL,
    parent_id bigint,
    name character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.category OWNER TO postgres;

--
-- TOC entry 4901 (class 0 OID 0)
-- Dependencies: 223
-- Name: TABLE category; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.category IS '类型表';


--
-- TOC entry 4902 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN category.code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.category.code IS '编码';


--
-- TOC entry 4903 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN category.parent_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.category.parent_id IS '父编码';


--
-- TOC entry 4904 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN category.name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.category.name IS '名称';


--
-- TOC entry 4905 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN category.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.category.create_time IS '创建时间';


--
-- TOC entry 222 (class 1259 OID 17181)
-- Name: category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.category_id_seq OWNER TO postgres;

--
-- TOC entry 4906 (class 0 OID 0)
-- Dependencies: 222
-- Name: category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.category_id_seq OWNED BY public.category.id;


--
-- TOC entry 218 (class 1259 OID 16539)
-- Name: db_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_course (
    course_id bigint NOT NULL,
    course_name character varying NOT NULL,
    course_code character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.db_course OWNER TO postgres;

--
-- TOC entry 4907 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_course.course_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';


--
-- TOC entry 4908 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_course.course_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


--
-- TOC entry 4909 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_course.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.create_time IS '创建时间';


--
-- TOC entry 217 (class 1259 OID 16538)
-- Name: db_course_course_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_course_course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_course_course_id_seq OWNER TO postgres;

--
-- TOC entry 4910 (class 0 OID 0)
-- Dependencies: 217
-- Name: db_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_course_course_id_seq OWNED BY public.db_course.course_id;


--
-- TOC entry 221 (class 1259 OID 16549)
-- Name: db_stu_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_stu_course (
    course_id bigint NOT NULL,
    student_id bigint NOT NULL
);


ALTER TABLE public.db_stu_course OWNER TO postgres;

--
-- TOC entry 4911 (class 0 OID 0)
-- Dependencies: 221
-- Name: TABLE db_stu_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_stu_course IS '学生课程关联表';


--
-- TOC entry 4912 (class 0 OID 0)
-- Dependencies: 221
-- Name: COLUMN db_stu_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';


--
-- TOC entry 4913 (class 0 OID 0)
-- Dependencies: 221
-- Name: COLUMN db_stu_course.student_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.student_id IS '学生id';


--
-- TOC entry 219 (class 1259 OID 16547)
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_stu_course_course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_stu_course_course_id_seq OWNER TO postgres;

--
-- TOC entry 4914 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_stu_course_course_id_seq OWNED BY public.db_stu_course.course_id;


--
-- TOC entry 220 (class 1259 OID 16548)
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_stu_course_student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_stu_course_student_id_seq OWNER TO postgres;

--
-- TOC entry 4915 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_stu_course_student_id_seq OWNED BY public.db_stu_course.student_id;


--
-- TOC entry 216 (class 1259 OID 16530)
-- Name: db_student; Type: TABLE; Schema: public; Owner: postgres
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
    remark character varying,
    is_delete smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.db_student OWNER TO postgres;

--
-- TOC entry 4916 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.first_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';


--
-- TOC entry 4917 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.last_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.last_name IS '名字';


--
-- TOC entry 4918 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.gender IS '性别';


--
-- TOC entry 4919 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_time IS '创建时间';


--
-- TOC entry 4920 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_time IS '更新时间';


--
-- TOC entry 4921 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_by IS '创建人';


--
-- TOC entry 4922 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_by IS '更新人';


--
-- TOC entry 4923 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.remark IS '备注';


--
-- TOC entry 4924 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.is_delete IS '删除标志1 删除 0未删除';


--
-- TOC entry 215 (class 1259 OID 16529)
-- Name: db_student_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_student_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_student_user_id_seq OWNER TO postgres;

--
-- TOC entry 4925 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_student_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_student_user_id_seq OWNED BY public.db_student.user_id;


--
-- TOC entry 225 (class 1259 OID 17198)
-- Name: db_teacher; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_teacher (
    teacher_id bigint NOT NULL,
    teacher_name character varying NOT NULL,
    teacher_code character varying NOT NULL,
    remark character varying,
    create_time timestamp with time zone
);


ALTER TABLE public.db_teacher OWNER TO postgres;

--
-- TOC entry 4926 (class 0 OID 0)
-- Dependencies: 225
-- Name: TABLE db_teacher; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_teacher IS '教师表';


--
-- TOC entry 4927 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher.teacher_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.teacher_name IS '姓名';


--
-- TOC entry 4928 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher.teacher_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.teacher_code IS '教师资格证编码';


--
-- TOC entry 4929 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.remark IS '备注';


--
-- TOC entry 4930 (class 0 OID 0)
-- Dependencies: 225
-- Name: COLUMN db_teacher.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.create_time IS '入职时间';


--
-- TOC entry 226 (class 1259 OID 17206)
-- Name: db_teacher_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_teacher_course (
    teacher_id bigint NOT NULL,
    course_id bigint NOT NULL
);


ALTER TABLE public.db_teacher_course OWNER TO postgres;

--
-- TOC entry 4931 (class 0 OID 0)
-- Dependencies: 226
-- Name: TABLE db_teacher_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_teacher_course IS '教师课程关联表';


--
-- TOC entry 4932 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher_course.teacher_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher_course.teacher_id IS '教师id';


--
-- TOC entry 4933 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher_course.course_id IS '课程id';


--
-- TOC entry 224 (class 1259 OID 17197)
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_teacher_teacher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_teacher_teacher_id_seq OWNER TO postgres;

--
-- TOC entry 4934 (class 0 OID 0)
-- Dependencies: 224
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_teacher_teacher_id_seq OWNED BY public.db_teacher.teacher_id;


--
-- TOC entry 227 (class 1259 OID 17209)
-- Name: db_test; Type: TABLE; Schema: public; Owner: postgres
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


ALTER TABLE public.db_test OWNER TO postgres;

--
-- TOC entry 4725 (class 2604 OID 17185)
-- Name: category id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category ALTER COLUMN id SET DEFAULT nextval('public.category_id_seq'::regclass);


--
-- TOC entry 4721 (class 2604 OID 16542)
-- Name: db_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_course_course_id_seq'::regclass);


--
-- TOC entry 4723 (class 2604 OID 16552)
-- Name: db_stu_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_stu_course_course_id_seq'::regclass);


--
-- TOC entry 4724 (class 2604 OID 16553)
-- Name: db_stu_course student_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN student_id SET DEFAULT nextval('public.db_stu_course_student_id_seq'::regclass);


--
-- TOC entry 4717 (class 2604 OID 16533)
-- Name: db_student user_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student ALTER COLUMN user_id SET DEFAULT nextval('public.db_student_user_id_seq'::regclass);


--
-- TOC entry 4727 (class 2604 OID 17201)
-- Name: db_teacher teacher_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_teacher ALTER COLUMN teacher_id SET DEFAULT nextval('public.db_teacher_teacher_id_seq'::regclass);


--
-- TOC entry 4889 (class 0 OID 17182)
-- Dependencies: 223
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.category (id, code, parent_id, name, create_time) FROM stdin;
1	1715442885049	\N	商品	2024-05-11 23:54:45.0636
2	1715443083927	\N	裙子	2024-05-11 23:58:03.940474
3	1715443185114	2	连衣裙	2024-05-11 23:59:45.12717
4	1715443208588	2	露肩裙	2024-05-12 00:00:08.590134
5	1715443222724	3	粉色连衣裙	2024-05-12 00:00:22.72656
6	1715443230984	3	青色连衣裙	2024-05-12 00:00:30.986247
8	1715477202699	3	紫色连衣裙	2024-05-12 09:26:42.702663
9	1715477300505	4	双露肩	2024-05-12 09:28:20.505936
7	1715477147053	4	粉色单露肩	2024-05-12 09:25:47.068447
\.


--
-- TOC entry 4884 (class 0 OID 16539)
-- Dependencies: 218
-- Data for Name: db_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_course (course_id, course_name, course_code, create_time) FROM stdin;
16	剑术	6809e3043c5a463d926e2734df5c349a	2024-05-16 14:59:07.192746
17	诗歌	f90b27f4e3e546de94fb737cfec6244a	2024-05-16 14:59:07.193662
18	书法	662b28563725418c9ae565a55b3c04f3	2024-05-16 14:59:07.194204
19	古文	cef78364b0224b0fb9f704ba737750db	2024-05-16 15:00:42.863816
\.


--
-- TOC entry 4887 (class 0 OID 16549)
-- Dependencies: 221
-- Data for Name: db_stu_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_stu_course (course_id, student_id) FROM stdin;
\.


--
-- TOC entry 4882 (class 0 OID 16530)
-- Dependencies: 216
-- Data for Name: db_student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_student (user_id, first_name, last_name, gender, create_time, update_time, create_by, update_by, remark, is_delete) FROM stdin;
2	白	亦非	MALE	2024-04-16 12:58:37.936771	2024-04-16 12:58:37.936771	\N	\N	\N	1
1	楚	凛風	MALE	2024-04-16 10:53:48.145409	2024-04-16 10:53:48.145409	\N	\N	\N	1
\.


--
-- TOC entry 4891 (class 0 OID 17198)
-- Dependencies: 225
-- Data for Name: db_teacher; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_teacher (teacher_id, teacher_name, teacher_code, remark, create_time) FROM stdin;
7	李太白	litaibai	\N	2024-05-16 15:00:42.85701+08
\.


--
-- TOC entry 4892 (class 0 OID 17206)
-- Dependencies: 226
-- Data for Name: db_teacher_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_teacher_course (teacher_id, course_id) FROM stdin;
7	16
7	17
7	18
7	19
\.


--
-- TOC entry 4893 (class 0 OID 17209)
-- Dependencies: 227
-- Data for Name: db_test; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_test (id, username, gender, birthday, address, create_time, update_time, remark) FROM stdin;
1	风逍遥	MALE	\N	道域	\N	\N	\N
2	荻花题叶	MALE	\N	阴阳学宗	\N	\N	\N
3	111	MALE	\N	\N	\N	\N	\N
4	无情葬月	MALE	\N	仙舞剑宗	\N	\N	\N
5	玲珑雪霏	FEMALE	\N	\N	\N	\N	\N
\.


--
-- TOC entry 4935 (class 0 OID 0)
-- Dependencies: 222
-- Name: category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.category_id_seq', 9, true);


--
-- TOC entry 4936 (class 0 OID 0)
-- Dependencies: 217
-- Name: db_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_course_course_id_seq', 19, true);


--
-- TOC entry 4937 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_course_id_seq', 1, false);


--
-- TOC entry 4938 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_student_id_seq', 1, false);


--
-- TOC entry 4939 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_student_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_student_user_id_seq', 2, true);


--
-- TOC entry 4940 (class 0 OID 0)
-- Dependencies: 224
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_teacher_teacher_id_seq', 7, true);


--
-- TOC entry 4735 (class 2606 OID 17190)
-- Name: category category_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pk PRIMARY KEY (id);


--
-- TOC entry 4733 (class 2606 OID 16546)
-- Name: db_course db_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_pk PRIMARY KEY (course_id);


--
-- TOC entry 4731 (class 2606 OID 16537)
-- Name: db_student db_student_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_pk PRIMARY KEY (user_id);


--
-- TOC entry 4737 (class 2606 OID 17205)
-- Name: db_teacher db_teacher_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_teacher
    ADD CONSTRAINT db_teacher_pk PRIMARY KEY (teacher_id);


-- Completed on 2024-06-26 13:19:09

--
-- PostgreSQL database dump complete
--

