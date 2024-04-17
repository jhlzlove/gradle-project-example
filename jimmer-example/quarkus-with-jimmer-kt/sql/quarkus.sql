--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-04-17 14:39:48

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
-- TOC entry 4858 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 220 (class 1259 OID 16580)
-- Name: tb_dept; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_dept (
    dept_id bigint NOT NULL,
    dept_name character varying NOT NULL,
    leader_id bigint,
    role_id bigint
);


ALTER TABLE public.tb_dept OWNER TO postgres;

--
-- TOC entry 4859 (class 0 OID 0)
-- Dependencies: 220
-- Name: TABLE tb_dept; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.tb_dept IS '部门信息';


--
-- TOC entry 4860 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN tb_dept.dept_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_dept.dept_name IS '部门名称';


--
-- TOC entry 4861 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN tb_dept.leader_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_dept.leader_id IS '部门领导';


--
-- TOC entry 4862 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN tb_dept.role_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_dept.role_id IS '部门权限';


--
-- TOC entry 217 (class 1259 OID 16577)
-- Name: tb_dept_dept_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_dept_dept_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tb_dept_dept_id_seq OWNER TO postgres;

--
-- TOC entry 4863 (class 0 OID 0)
-- Dependencies: 217
-- Name: tb_dept_dept_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_dept_dept_id_seq OWNED BY public.tb_dept.dept_id;


--
-- TOC entry 218 (class 1259 OID 16578)
-- Name: tb_dept_leader_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_dept_leader_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tb_dept_leader_id_seq OWNER TO postgres;

--
-- TOC entry 4864 (class 0 OID 0)
-- Dependencies: 218
-- Name: tb_dept_leader_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_dept_leader_id_seq OWNED BY public.tb_dept.leader_id;


--
-- TOC entry 219 (class 1259 OID 16579)
-- Name: tb_dept_role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_dept_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tb_dept_role_id_seq OWNER TO postgres;

--
-- TOC entry 4865 (class 0 OID 0)
-- Dependencies: 219
-- Name: tb_dept_role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_dept_role_id_seq OWNED BY public.tb_dept.role_id;


--
-- TOC entry 216 (class 1259 OID 16566)
-- Name: tb_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_role (
    role_id bigint NOT NULL,
    role_code character varying NOT NULL,
    role_name character varying NOT NULL,
    create_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    update_time timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    remark character varying,
    status smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.tb_role OWNER TO postgres;

--
-- TOC entry 4866 (class 0 OID 0)
-- Dependencies: 216
-- Name: TABLE tb_role; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.tb_role IS '角色表';


--
-- TOC entry 4867 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.role_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.role_code IS '角色编码';


--
-- TOC entry 4868 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.role_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.role_name IS '角色名称';


--
-- TOC entry 4869 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.create_time IS '创建时间';


--
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.update_time IS '更新时间';


--
-- TOC entry 4871 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.remark; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.remark IS '备注';


--
-- TOC entry 4872 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN tb_role.status; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tb_role.status IS '状态0正常，1停用';


--
-- TOC entry 215 (class 1259 OID 16565)
-- Name: tb_role_role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_role_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tb_role_role_id_seq OWNER TO postgres;

--
-- TOC entry 4873 (class 0 OID 0)
-- Dependencies: 215
-- Name: tb_role_role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_role_role_id_seq OWNED BY public.tb_role.role_id;


--
-- TOC entry 4699 (class 2604 OID 16583)
-- Name: tb_dept dept_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_dept ALTER COLUMN dept_id SET DEFAULT nextval('public.tb_dept_dept_id_seq'::regclass);


--
-- TOC entry 4695 (class 2604 OID 16569)
-- Name: tb_role role_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_role ALTER COLUMN role_id SET DEFAULT nextval('public.tb_role_role_id_seq'::regclass);


--
-- TOC entry 4852 (class 0 OID 16580)
-- Dependencies: 220
-- Data for Name: tb_dept; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_dept (dept_id, dept_name, leader_id, role_id) FROM stdin;
1	开发部	1	\N
\.


--
-- TOC entry 4848 (class 0 OID 16566)
-- Dependencies: 216
-- Data for Name: tb_role; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_role (role_id, role_code, role_name, create_time, update_time, remark, status) FROM stdin;
1	admin	管理员	2024-04-17 14:29:00.744677	2024-04-17 14:29:00.744677	\N	0
\.


--
-- TOC entry 4874 (class 0 OID 0)
-- Dependencies: 217
-- Name: tb_dept_dept_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_dept_dept_id_seq', 1, true);


--
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 218
-- Name: tb_dept_leader_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_dept_leader_id_seq', 1, false);


--
-- TOC entry 4876 (class 0 OID 0)
-- Dependencies: 219
-- Name: tb_dept_role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_dept_role_id_seq', 1, false);


--
-- TOC entry 4877 (class 0 OID 0)
-- Dependencies: 215
-- Name: tb_role_role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_role_role_id_seq', 2, true);


--
-- TOC entry 4703 (class 2606 OID 16589)
-- Name: tb_dept tb_dept_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_dept
    ADD CONSTRAINT tb_dept_pk PRIMARY KEY (dept_id);


--
-- TOC entry 4701 (class 2606 OID 16576)
-- Name: tb_role tb_role_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_role
    ADD CONSTRAINT tb_role_pk PRIMARY KEY (role_id);


-- Completed on 2024-04-17 14:39:48

--
-- PostgreSQL database dump complete
--

