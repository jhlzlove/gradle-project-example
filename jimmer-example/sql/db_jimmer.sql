--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

-- Started on 2024-12-31 14:26:27

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE db_jimmer;
--
-- TOC entry 4969 (class 1262 OID 16388)
-- Name: db_jimmer; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE db_jimmer WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Chinese (Simplified)_China.936';


ALTER DATABASE db_jimmer OWNER TO postgres;

\connect db_jimmer

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
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
-- TOC entry 4970 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 217 (class 1259 OID 16390)
-- Name: db_subject; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_subject (
    id bigint NOT NULL,
    code character varying NOT NULL,
    parent_id bigint,
    name character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_delete bigint DEFAULT 0 NOT NULL
);


ALTER TABLE public.db_subject OWNER TO postgres;

--
-- TOC entry 4971 (class 0 OID 0)
-- Dependencies: 217
-- Name: TABLE db_subject; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_subject IS '学校专业表';


--
-- TOC entry 4972 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_subject.code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject.code IS '编码';


--
-- TOC entry 4973 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_subject.parent_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject.parent_id IS '父编码';


--
-- TOC entry 4974 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_subject.name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject.name IS '名称';


--
-- TOC entry 4975 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_subject.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject.create_time IS '创建时间';


--
-- TOC entry 4976 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_subject.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject.is_delete IS '逻辑删除';


--
-- TOC entry 218 (class 1259 OID 16396)
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
-- TOC entry 4977 (class 0 OID 0)
-- Dependencies: 218
-- Name: category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.category_id_seq OWNED BY public.db_subject.id;


--
-- TOC entry 219 (class 1259 OID 16397)
-- Name: db_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_course (
    course_id bigint NOT NULL,
    course_name character varying NOT NULL,
    course_code character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_delete bigint DEFAULT 0 NOT NULL
);


ALTER TABLE public.db_course OWNER TO postgres;

--
-- TOC entry 4978 (class 0 OID 0)
-- Dependencies: 219
-- Name: TABLE db_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_course IS '课程信息表';


--
-- TOC entry 4979 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_course.course_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';


--
-- TOC entry 4980 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_course.course_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


--
-- TOC entry 4981 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_course.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.create_time IS '创建时间';


--
-- TOC entry 4982 (class 0 OID 0)
-- Dependencies: 219
-- Name: COLUMN db_course.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.is_delete IS '逻辑删除';


--
-- TOC entry 220 (class 1259 OID 16403)
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
-- TOC entry 4983 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_course_course_id_seq OWNED BY public.db_course.course_id;


--
-- TOC entry 221 (class 1259 OID 16404)
-- Name: db_stu_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_stu_course (
    course_id bigint NOT NULL,
    student_id bigint NOT NULL
);


ALTER TABLE public.db_stu_course OWNER TO postgres;

--
-- TOC entry 4984 (class 0 OID 0)
-- Dependencies: 221
-- Name: TABLE db_stu_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_stu_course IS '学生课程关联表';


--
-- TOC entry 4985 (class 0 OID 0)
-- Dependencies: 221
-- Name: COLUMN db_stu_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';


--
-- TOC entry 4986 (class 0 OID 0)
-- Dependencies: 221
-- Name: COLUMN db_stu_course.student_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.student_id IS '学生id';


--
-- TOC entry 222 (class 1259 OID 16407)
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
-- TOC entry 4987 (class 0 OID 0)
-- Dependencies: 222
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_stu_course_course_id_seq OWNED BY public.db_stu_course.course_id;


--
-- TOC entry 223 (class 1259 OID 16408)
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
-- TOC entry 4988 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_stu_course_student_id_seq OWNED BY public.db_stu_course.student_id;


--
-- TOC entry 224 (class 1259 OID 16409)
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
-- TOC entry 4989 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.first_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';


--
-- TOC entry 4990 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.last_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.last_name IS '名字';


--
-- TOC entry 4991 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.gender IS '性别';


--
-- TOC entry 4992 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_time IS '创建时间';


--
-- TOC entry 4993 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_time IS '更新时间';


--
-- TOC entry 4994 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_by IS '创建人';


--
-- TOC entry 4995 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_by IS '更新人';


--
-- TOC entry 4996 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.remark IS '备注';


--
-- TOC entry 4997 (class 0 OID 0)
-- Dependencies: 224
-- Name: COLUMN db_student.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.is_delete IS '删除标志1 删除 0未删除';


--
-- TOC entry 225 (class 1259 OID 16417)
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
-- TOC entry 4998 (class 0 OID 0)
-- Dependencies: 225
-- Name: db_student_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_student_user_id_seq OWNED BY public.db_student.user_id;


--
-- TOC entry 230 (class 1259 OID 16483)
-- Name: db_subject_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_subject_course (
    subject_id bigint NOT NULL,
    course_id bigint NOT NULL
);


ALTER TABLE public.db_subject_course OWNER TO postgres;

--
-- TOC entry 4999 (class 0 OID 0)
-- Dependencies: 230
-- Name: TABLE db_subject_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_subject_course IS '专业课程关联表';


--
-- TOC entry 5000 (class 0 OID 0)
-- Dependencies: 230
-- Name: COLUMN db_subject_course.subject_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject_course.subject_id IS '专业id';


--
-- TOC entry 5001 (class 0 OID 0)
-- Dependencies: 230
-- Name: COLUMN db_subject_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_subject_course.course_id IS '课程id';


--
-- TOC entry 226 (class 1259 OID 16418)
-- Name: db_teacher; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_teacher (
    teacher_id bigint NOT NULL,
    teacher_name character varying NOT NULL,
    teacher_code character varying NOT NULL,
    remark character varying,
    create_time timestamp with time zone,
    is_delete bigint DEFAULT 0 NOT NULL
);


ALTER TABLE public.db_teacher OWNER TO postgres;

--
-- TOC entry 5002 (class 0 OID 0)
-- Dependencies: 226
-- Name: TABLE db_teacher; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_teacher IS '教师表';


--
-- TOC entry 5003 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher.teacher_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.teacher_name IS '姓名';


--
-- TOC entry 5004 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher.teacher_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.teacher_code IS '教师资格证编码';


--
-- TOC entry 5005 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.remark IS '备注';


--
-- TOC entry 5006 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.create_time IS '入职时间';


--
-- TOC entry 5007 (class 0 OID 0)
-- Dependencies: 226
-- Name: COLUMN db_teacher.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher.is_delete IS '逻辑删除';


--
-- TOC entry 227 (class 1259 OID 16423)
-- Name: db_teacher_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_teacher_course (
    teacher_id bigint NOT NULL,
    course_id bigint NOT NULL
);


ALTER TABLE public.db_teacher_course OWNER TO postgres;

--
-- TOC entry 5008 (class 0 OID 0)
-- Dependencies: 227
-- Name: TABLE db_teacher_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_teacher_course IS '教师课程关联表';


--
-- TOC entry 5009 (class 0 OID 0)
-- Dependencies: 227
-- Name: COLUMN db_teacher_course.teacher_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher_course.teacher_id IS '教师id';


--
-- TOC entry 5010 (class 0 OID 0)
-- Dependencies: 227
-- Name: COLUMN db_teacher_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_teacher_course.course_id IS '课程id';


--
-- TOC entry 228 (class 1259 OID 16426)
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
-- TOC entry 5011 (class 0 OID 0)
-- Dependencies: 228
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_teacher_teacher_id_seq OWNED BY public.db_teacher.teacher_id;


--
-- TOC entry 229 (class 1259 OID 16427)
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
-- TOC entry 4778 (class 2604 OID 16435)
-- Name: db_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_course_course_id_seq'::regclass);


--
-- TOC entry 4781 (class 2604 OID 16436)
-- Name: db_stu_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_stu_course_course_id_seq'::regclass);


--
-- TOC entry 4782 (class 2604 OID 16437)
-- Name: db_stu_course student_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN student_id SET DEFAULT nextval('public.db_stu_course_student_id_seq'::regclass);


--
-- TOC entry 4783 (class 2604 OID 16438)
-- Name: db_student user_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student ALTER COLUMN user_id SET DEFAULT nextval('public.db_student_user_id_seq'::regclass);


--
-- TOC entry 4775 (class 2604 OID 16434)
-- Name: db_subject id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_subject ALTER COLUMN id SET DEFAULT nextval('public.category_id_seq'::regclass);


--
-- TOC entry 4787 (class 2604 OID 16439)
-- Name: db_teacher teacher_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_teacher ALTER COLUMN teacher_id SET DEFAULT nextval('public.db_teacher_teacher_id_seq'::regclass);


--
-- TOC entry 4952 (class 0 OID 16397)
-- Dependencies: 219
-- Data for Name: db_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_course VALUES (16, '剑术', '6809e3043c5a463d926e2734df5c349a', '2024-05-16 14:59:07.192746', 0);
INSERT INTO public.db_course VALUES (17, '诗歌', 'f90b27f4e3e546de94fb737cfec6244a', '2024-05-16 14:59:07.193662', 0);
INSERT INTO public.db_course VALUES (18, '书法', '662b28563725418c9ae565a55b3c04f3', '2024-05-16 14:59:07.194204', 0);
INSERT INTO public.db_course VALUES (19, '古文', 'cef78364b0224b0fb9f704ba737750db', '2024-05-16 15:00:42.863816', 0);
INSERT INTO public.db_course VALUES (20, '逍遥剑', '974d085dd73048f08e0ccbc0252376aa', '2024-12-27 13:35:56.770134', 0);
INSERT INTO public.db_course VALUES (21, '高数二', '1735283991362', '2024-12-27 15:19:51.412007', 0);


--
-- TOC entry 4954 (class 0 OID 16404)
-- Dependencies: 221
-- Data for Name: db_stu_course; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4957 (class 0 OID 16409)
-- Dependencies: 224
-- Data for Name: db_student; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_student VALUES (2, '白', '亦非', 'MALE', '2024-04-16 12:58:37.936771', '2024-04-16 12:58:37.936771', NULL, NULL, NULL, 0);
INSERT INTO public.db_student VALUES (1, '楚', '凛風', 'MALE', '2024-04-16 10:53:48.145409', '2024-04-16 10:53:48.145409', NULL, NULL, NULL, 0);


--
-- TOC entry 4950 (class 0 OID 16390)
-- Dependencies: 217
-- Data for Name: db_subject; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_subject VALUES (1, '1715442885049', NULL, '商品', '2024-05-11 23:54:45.0636', 0);
INSERT INTO public.db_subject VALUES (2, '1715443083927', NULL, '裙子', '2024-05-11 23:58:03.940474', 0);
INSERT INTO public.db_subject VALUES (3, '1715443185114', 2, '连衣裙', '2024-05-11 23:59:45.12717', 0);
INSERT INTO public.db_subject VALUES (4, '1715443208588', 2, '露肩裙', '2024-05-12 00:00:08.590134', 0);
INSERT INTO public.db_subject VALUES (5, '1715443222724', 3, '粉色连衣裙', '2024-05-12 00:00:22.72656', 0);
INSERT INTO public.db_subject VALUES (6, '1715443230984', 3, '青色连衣裙', '2024-05-12 00:00:30.986247', 0);
INSERT INTO public.db_subject VALUES (8, '1715477202699', 3, '紫色连衣裙', '2024-05-12 09:26:42.702663', 0);
INSERT INTO public.db_subject VALUES (9, '1715477300505', 4, '双露肩', '2024-05-12 09:28:20.505936', 0);
INSERT INTO public.db_subject VALUES (7, '1715477147053', 4, '粉色单露肩', '2024-05-12 09:25:47.068447', 0);
INSERT INTO public.db_subject VALUES (11, '1735282331800', NULL, '计算机与信息工程', '2024-12-27 14:52:11.855208', 0);
INSERT INTO public.db_subject VALUES (12, '1735282390830', 11, '软件工程', '2024-12-27 14:53:10.83112', 0);
INSERT INTO public.db_subject VALUES (13, '1735282420136', 11, '计算机科学技术', '2024-12-27 14:53:40.13777', 1);


--
-- TOC entry 4963 (class 0 OID 16483)
-- Dependencies: 230
-- Data for Name: db_subject_course; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4959 (class 0 OID 16418)
-- Dependencies: 226
-- Data for Name: db_teacher; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_teacher VALUES (7, '李太白', 'litaibai', NULL, '2024-05-16 15:00:42.85701+08', 0);
INSERT INTO public.db_teacher VALUES (8, '李逍遥', 'lixiaoyao', NULL, '2024-12-27 13:35:56.733017+08', 0);


--
-- TOC entry 4960 (class 0 OID 16423)
-- Dependencies: 227
-- Data for Name: db_teacher_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_teacher_course VALUES (7, 16);
INSERT INTO public.db_teacher_course VALUES (7, 17);
INSERT INTO public.db_teacher_course VALUES (7, 18);
INSERT INTO public.db_teacher_course VALUES (7, 19);
INSERT INTO public.db_teacher_course VALUES (8, 20);


--
-- TOC entry 4962 (class 0 OID 16427)
-- Dependencies: 229
-- Data for Name: db_test; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_test VALUES (1, '风逍遥', 'MALE', NULL, '道域', NULL, NULL, NULL);
INSERT INTO public.db_test VALUES (2, '荻花题叶', 'MALE', NULL, '阴阳学宗', NULL, NULL, NULL);
INSERT INTO public.db_test VALUES (3, '111', 'MALE', NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.db_test VALUES (4, '无情葬月', 'MALE', NULL, '仙舞剑宗', NULL, NULL, NULL);
INSERT INTO public.db_test VALUES (5, '玲珑雪霏', 'FEMALE', NULL, NULL, NULL, NULL, NULL);


--
-- TOC entry 5012 (class 0 OID 0)
-- Dependencies: 218
-- Name: category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.category_id_seq', 13, true);


--
-- TOC entry 5013 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_course_course_id_seq', 21, true);


--
-- TOC entry 5014 (class 0 OID 0)
-- Dependencies: 222
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_course_id_seq', 1, false);


--
-- TOC entry 5015 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_student_id_seq', 1, false);


--
-- TOC entry 5016 (class 0 OID 0)
-- Dependencies: 225
-- Name: db_student_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_student_user_id_seq', 2, true);


--
-- TOC entry 5017 (class 0 OID 0)
-- Dependencies: 228
-- Name: db_teacher_teacher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_teacher_teacher_id_seq', 8, true);


--
-- TOC entry 4792 (class 2606 OID 16441)
-- Name: db_subject category_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_subject
    ADD CONSTRAINT category_pk PRIMARY KEY (id);


--
-- TOC entry 4794 (class 2606 OID 16443)
-- Name: db_course db_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_pk PRIMARY KEY (course_id);


--
-- TOC entry 4796 (class 2606 OID 16490)
-- Name: db_stu_course db_stu_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course
    ADD CONSTRAINT db_stu_course_pk PRIMARY KEY (course_id, student_id);


--
-- TOC entry 4798 (class 2606 OID 16445)
-- Name: db_student db_student_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_pk PRIMARY KEY (user_id);


--
-- TOC entry 4804 (class 2606 OID 16494)
-- Name: db_subject_course db_subject_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_subject_course
    ADD CONSTRAINT db_subject_course_pk PRIMARY KEY (subject_id, course_id);


--
-- TOC entry 4802 (class 2606 OID 16492)
-- Name: db_teacher_course db_teacher_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_teacher_course
    ADD CONSTRAINT db_teacher_course_pk PRIMARY KEY (teacher_id, course_id);


--
-- TOC entry 4800 (class 2606 OID 16447)
-- Name: db_teacher db_teacher_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_teacher
    ADD CONSTRAINT db_teacher_pk PRIMARY KEY (teacher_id);


-- Completed on 2024-12-31 14:26:27

--
-- PostgreSQL database dump complete
--

