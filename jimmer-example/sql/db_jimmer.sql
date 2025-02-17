--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

-- Started on 2025-02-17 22:52:17

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
-- TOC entry 4930 (class 1262 OID 16388)
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
-- TOC entry 4931 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 220 (class 1259 OID 33404)
-- Name: db_college; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_college (
    id bigint NOT NULL,
    college_name character varying NOT NULL
);


ALTER TABLE public.db_college OWNER TO postgres;

--
-- TOC entry 4932 (class 0 OID 0)
-- Dependencies: 220
-- Name: TABLE db_college; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_college IS '学院信息';


--
-- TOC entry 4933 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_college.college_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_college.college_name IS '学院名称';


--
-- TOC entry 219 (class 1259 OID 33403)
-- Name: db_college_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_college_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_college_id_seq OWNER TO postgres;

--
-- TOC entry 4934 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_college_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_college_id_seq OWNED BY public.db_college.id;


--
-- TOC entry 222 (class 1259 OID 33413)
-- Name: db_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_course (
    id bigint NOT NULL,
    course_name character varying NOT NULL,
    course_code character varying NOT NULL
);


ALTER TABLE public.db_course OWNER TO postgres;

--
-- TOC entry 4935 (class 0 OID 0)
-- Dependencies: 222
-- Name: TABLE db_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_course IS '课程信息表';


--
-- TOC entry 4936 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_course.course_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_name IS '课程名称';


--
-- TOC entry 4937 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_course.course_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_course.course_code IS '课程编码';


--
-- TOC entry 221 (class 1259 OID 33412)
-- Name: db_course_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_course_id_seq OWNER TO postgres;

--
-- TOC entry 4938 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_course_id_seq OWNED BY public.db_course.id;


--
-- TOC entry 223 (class 1259 OID 33421)
-- Name: db_stu_course; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_stu_course (
    stu_id bigint NOT NULL,
    course_id bigint NOT NULL
);


ALTER TABLE public.db_stu_course OWNER TO postgres;

--
-- TOC entry 4939 (class 0 OID 0)
-- Dependencies: 223
-- Name: TABLE db_stu_course; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_stu_course IS '学生课程关联信息表';


--
-- TOC entry 4940 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN db_stu_course.stu_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.stu_id IS '学生id';


--
-- TOC entry 4941 (class 0 OID 0)
-- Dependencies: 223
-- Name: COLUMN db_stu_course.course_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_stu_course.course_id IS '课程id';


--
-- TOC entry 217 (class 1259 OID 16409)
-- Name: db_student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_student (
    id bigint NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    gender character varying NOT NULL,
    birthday timestamp without time zone,
    is_delete smallint DEFAULT 0 NOT NULL,
    college_id bigint
);


ALTER TABLE public.db_student OWNER TO postgres;

--
-- TOC entry 4942 (class 0 OID 0)
-- Dependencies: 217
-- Name: TABLE db_student; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_student IS '学生信息表';


--
-- TOC entry 4943 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.first_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.first_name IS '姓氏';


--
-- TOC entry 4944 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.last_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.last_name IS '名字';


--
-- TOC entry 4945 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.gender IS '性别';


--
-- TOC entry 4946 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.birthday; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.birthday IS '出生日期';


--
-- TOC entry 4947 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.is_delete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.is_delete IS '删除标志1 删除 0未删除';


--
-- TOC entry 4948 (class 0 OID 0)
-- Dependencies: 217
-- Name: COLUMN db_student.college_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_student.college_id IS '所属学院id';


--
-- TOC entry 218 (class 1259 OID 16417)
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
-- TOC entry 4949 (class 0 OID 0)
-- Dependencies: 218
-- Name: db_student_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_student_user_id_seq OWNED BY public.db_student.id;


--
-- TOC entry 4758 (class 2604 OID 33407)
-- Name: db_college id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_college ALTER COLUMN id SET DEFAULT nextval('public.db_college_id_seq'::regclass);


--
-- TOC entry 4759 (class 2604 OID 33416)
-- Name: db_course id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course ALTER COLUMN id SET DEFAULT nextval('public.db_course_id_seq'::regclass);


--
-- TOC entry 4756 (class 2604 OID 16438)
-- Name: db_student id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student ALTER COLUMN id SET DEFAULT nextval('public.db_student_user_id_seq'::regclass);


--
-- TOC entry 4921 (class 0 OID 33404)
-- Dependencies: 220
-- Data for Name: db_college; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_college (id, college_name) FROM stdin;
1	计算机与信息工程学院
\.


--
-- TOC entry 4923 (class 0 OID 33413)
-- Dependencies: 222
-- Data for Name: db_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_course (id, course_name, course_code) FROM stdin;
1	语文	1739802645488
\.


--
-- TOC entry 4924 (class 0 OID 33421)
-- Dependencies: 223
-- Data for Name: db_stu_course; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_stu_course (stu_id, course_id) FROM stdin;
5	1
\.


--
-- TOC entry 4918 (class 0 OID 16409)
-- Dependencies: 217
-- Data for Name: db_student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_student (id, first_name, last_name, gender, birthday, is_delete, college_id) FROM stdin;
5	李	逍遥	MALE	\N	1	1
\.


--
-- TOC entry 4950 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_college_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_college_id_seq', 1, true);


--
-- TOC entry 4951 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_course_id_seq', 1, true);


--
-- TOC entry 4952 (class 0 OID 0)
-- Dependencies: 218
-- Name: db_student_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_student_user_id_seq', 5, true);


--
-- TOC entry 4763 (class 2606 OID 33411)
-- Name: db_college db_college_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_college
    ADD CONSTRAINT db_college_pk PRIMARY KEY (id);


--
-- TOC entry 4765 (class 2606 OID 33420)
-- Name: db_course db_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_pk PRIMARY KEY (id);


--
-- TOC entry 4767 (class 2606 OID 33435)
-- Name: db_course db_course_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_course
    ADD CONSTRAINT db_course_unique UNIQUE (course_name);


--
-- TOC entry 4769 (class 2606 OID 33444)
-- Name: db_stu_course db_stu_course_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course
    ADD CONSTRAINT db_stu_course_pk PRIMARY KEY (stu_id, course_id);


--
-- TOC entry 4761 (class 2606 OID 16445)
-- Name: db_student db_student_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_pk PRIMARY KEY (id);


--
-- TOC entry 4771 (class 2606 OID 33429)
-- Name: db_stu_course db_stu_course_db_course_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course
    ADD CONSTRAINT db_stu_course_db_course_fk FOREIGN KEY (course_id) REFERENCES public.db_course(id);


--
-- TOC entry 4772 (class 2606 OID 33424)
-- Name: db_stu_course db_stu_course_db_student_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_stu_course
    ADD CONSTRAINT db_stu_course_db_student_fk FOREIGN KEY (stu_id) REFERENCES public.db_student(id);


--
-- TOC entry 4770 (class 2606 OID 33436)
-- Name: db_student db_student_db_college_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_student
    ADD CONSTRAINT db_student_db_college_fk FOREIGN KEY (college_id) REFERENCES public.db_college(id);


-- Completed on 2025-02-17 22:52:17

--
-- PostgreSQL database dump complete
--

