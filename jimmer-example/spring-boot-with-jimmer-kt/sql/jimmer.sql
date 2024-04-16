--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-04-16 12:57:15

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
-- TOC entry 4865 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

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
-- TOC entry 4866 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_course.course_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';


--
-- TOC entry 4867 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_course.course_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


--
-- TOC entry 4868 (class 0 OID 0)
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
-- TOC entry 4869 (class 0 OID 0)
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
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 221
-- Name: TABLE db_stu_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_stu_course IS '学生课程关联表';


--
-- TOC entry 4871 (class 0 OID 0)
-- Dependencies: 221
-- Name: COLUMN db_stu_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';


--
-- TOC entry 4872 (class 0 OID 0)
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
-- TOC entry 4873 (class 0 OID 0)
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
-- TOC entry 4874 (class 0 OID 0)
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
    remark character varying
);


ALTER TABLE public.db_student OWNER TO postgres;

--
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.first_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';


--
-- TOC entry 4876 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.last_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.last_name IS '名字';


--
-- TOC entry 4877 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.gender IS '性别';


--
-- TOC entry 4878 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_time IS '创建时间';


--
-- TOC entry 4879 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_time IS '更新时间';


--
-- TOC entry 4880 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.create_by IS '创建人';


--
-- TOC entry 4881 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.update_by IS '更新人';


--
-- TOC entry 4882 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_student.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.remark IS '备注';


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
-- TOC entry 4883 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_student_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_student_user_id_seq OWNED BY public.db_student.user_id;


--
-- TOC entry 4702 (class 2604 OID 16542)
-- Name: db_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_course_course_id_seq'::regclass);


--
-- TOC entry 4704 (class 2604 OID 16552)
-- Name: db_stu_course course_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN course_id SET DEFAULT nextval('public.db_stu_course_course_id_seq'::regclass);


--
-- TOC entry 4705 (class 2604 OID 16553)
-- Name: db_stu_course student_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course ALTER COLUMN student_id SET DEFAULT nextval('public.db_stu_course_student_id_seq'::regclass);


--
-- TOC entry 4699 (class 2604 OID 16533)
-- Name: db_student user_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student ALTER COLUMN user_id SET DEFAULT nextval('public.db_student_user_id_seq'::regclass);


--
-- TOC entry 4856 (class 0 OID 16539)
-- Dependencies: 218
-- Data for Name: db_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_course (course_id, course_name, course_code, create_time) FROM stdin;
1	语文	1713238748831	2024-04-16 11:39:08.842526
\.


--
-- TOC entry 4859 (class 0 OID 16549)
-- Dependencies: 221
-- Data for Name: db_stu_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_stu_course (course_id, student_id) FROM stdin;
1	1
\.


--
-- TOC entry 4854 (class 0 OID 16530)
-- Dependencies: 216
-- Data for Name: db_student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_student (user_id, first_name, last_name, gender, create_time, update_time, create_by, update_by, remark) FROM stdin;
1	楚	凛風	MALE	2024-04-16 10:53:48.145409	2024-04-16 10:53:48.145409	\N	\N	\N
\.


--
-- TOC entry 4884 (class 0 OID 0)
-- Dependencies: 217
-- Name: db_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_course_course_id_seq', 1, true);


--
-- TOC entry 4885 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_stu_course_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_course_id_seq', 1, false);


--
-- TOC entry 4886 (class 0 OID 0)
-- Dependencies: 220
-- Name: db_stu_course_student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_stu_course_student_id_seq', 1, false);


--
-- TOC entry 4887 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_student_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_student_user_id_seq', 1, true);


--
-- TOC entry 4709 (class 2606 OID 16546)
-- Name: db_course db_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_pk PRIMARY KEY (course_id);


--
-- TOC entry 4707 (class 2606 OID 16537)
-- Name: db_student db_student_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_pk PRIMARY KEY (user_id);


-- Completed on 2024-04-16 12:57:15

--
-- PostgreSQL database dump complete
--

