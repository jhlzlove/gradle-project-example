--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-07-08 14:03:25

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

DROP DATABASE db_quarkus;
--
-- TOC entry 4873 (class 1262 OID 17261)
-- Name: db_quarkus; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE db_quarkus WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Chinese (Simplified)_China.936';


ALTER DATABASE db_quarkus OWNER TO postgres;

\connect db_quarkus

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
-- TOC entry 4874 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 219 (class 1259 OID 17293)
-- Name: author_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.author_book (
    author_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE public.author_book OWNER TO postgres;

--
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 219
-- Name: TABLE author_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.author_book IS '作者图书管理表';


--
-- TOC entry 218 (class 1259 OID 17274)
-- Name: db_author; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_author (
    id bigint NOT NULL,
    username character varying NOT NULL,
    age smallint NOT NULL,
    gender character varying NOT NULL,
    address character varying,
    create_time timestamp without time zone NOT NULL,
    create_by character varying,
    update_by character varying,
    update_time timestamp without time zone NOT NULL
);


ALTER TABLE public.db_author OWNER TO postgres;

--
-- TOC entry 4876 (class 0 OID 0)
-- Dependencies: 218
-- Name: TABLE db_author; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_author IS '作者信息表';


--
-- TOC entry 4877 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.username; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.username IS '名称';


--
-- TOC entry 4878 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.age; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.age IS '年龄';


--
-- TOC entry 4879 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.gender IS '性别';


--
-- TOC entry 4880 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.address; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.address IS '住址';


--
-- TOC entry 4881 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.create_time IS '创建时间';


--
-- TOC entry 4882 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.create_by IS '创建人';


--
-- TOC entry 4883 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.update_by IS '更新人';


--
-- TOC entry 4884 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.update_time IS '更新时间';


--
-- TOC entry 217 (class 1259 OID 17273)
-- Name: db_author_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_author_id_seq OWNER TO postgres;

--
-- TOC entry 4885 (class 0 OID 0)
-- Dependencies: 217
-- Name: db_author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_author_id_seq OWNED BY public.db_author.id;


--
-- TOC entry 216 (class 1259 OID 17263)
-- Name: db_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_book (
    id bigint NOT NULL,
    book_name character varying NOT NULL,
    author_id bigint NOT NULL,
    book_code character varying NOT NULL,
    create_time timestamp without time zone NOT NULL,
    create_by character varying,
    update_by character varying,
    update_time timestamp without time zone NOT NULL
);


ALTER TABLE public.db_book OWNER TO postgres;

--
-- TOC entry 4886 (class 0 OID 0)
-- Dependencies: 216
-- Name: TABLE db_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_book IS '图书信息表';


--
-- TOC entry 4887 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.book_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.book_name IS '图书名称';


--
-- TOC entry 4888 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.author_id; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.author_id IS '作者id';


--
-- TOC entry 4889 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.book_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.book_code IS 'ISBN';


--
-- TOC entry 4890 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.create_time IS '上架时间';


--
-- TOC entry 4891 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.create_by IS '创建人';


--
-- TOC entry 4892 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.update_by IS '更新人';


--
-- TOC entry 4893 (class 0 OID 0)
-- Dependencies: 216
-- Name: COLUMN db_book.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.update_time IS '更新时间';


--
-- TOC entry 215 (class 1259 OID 17262)
-- Name: db_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_book_id_seq OWNER TO postgres;

--
-- TOC entry 4894 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_book_id_seq OWNED BY public.db_book.id;


--
-- TOC entry 222 (class 1259 OID 17300)
-- Name: db_store; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_store (
    id bigint NOT NULL,
    store_name character varying NOT NULL,
    create_time timestamp without time zone NOT NULL,
    create_by character varying,
    update_by character varying,
    update_time timestamp without time zone NOT NULL
);


ALTER TABLE public.db_store OWNER TO postgres;

--
-- TOC entry 4895 (class 0 OID 0)
-- Dependencies: 222
-- Name: TABLE db_store; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_store IS '图书信息表';


--
-- TOC entry 4896 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.store_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.store_name IS '书店名称';


--
-- TOC entry 4897 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.create_time IS '创建时间';


--
-- TOC entry 4898 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.create_by IS '创建人';


--
-- TOC entry 4899 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.update_by IS '更新人';


--
-- TOC entry 4900 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.update_time IS '更新时间';


--
-- TOC entry 221 (class 1259 OID 17299)
-- Name: db_store_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.db_store_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.db_store_id_seq OWNER TO postgres;

--
-- TOC entry 4901 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_store_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_store_id_seq OWNED BY public.db_store.id;


--
-- TOC entry 220 (class 1259 OID 17296)
-- Name: store_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.store_book (
    store_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE public.store_book OWNER TO postgres;

--
-- TOC entry 4902 (class 0 OID 0)
-- Dependencies: 220
-- Name: TABLE store_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.store_book IS '书店图书关联表';


--
-- TOC entry 4707 (class 2604 OID 17277)
-- Name: db_author id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_author ALTER COLUMN id SET DEFAULT nextval('public.db_author_id_seq'::regclass);


--
-- TOC entry 4706 (class 2604 OID 17266)
-- Name: db_book id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book ALTER COLUMN id SET DEFAULT nextval('public.db_book_id_seq'::regclass);


--
-- TOC entry 4708 (class 2604 OID 17303)
-- Name: db_store id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_store ALTER COLUMN id SET DEFAULT nextval('public.db_store_id_seq'::regclass);


--
-- TOC entry 4864 (class 0 OID 17293)
-- Dependencies: 219
-- Data for Name: author_book; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.author_book (author_id, book_id) FROM stdin;
\.


--
-- TOC entry 4863 (class 0 OID 17274)
-- Dependencies: 218
-- Data for Name: db_author; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_author (id, username, age, gender, address, create_time, create_by, update_by, update_time) FROM stdin;
\.


--
-- TOC entry 4861 (class 0 OID 17263)
-- Dependencies: 216
-- Data for Name: db_book; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_book (id, book_name, author_id, book_code, create_time, create_by, update_by, update_time) FROM stdin;
\.


--
-- TOC entry 4867 (class 0 OID 17300)
-- Dependencies: 222
-- Data for Name: db_store; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.db_store (id, store_name, create_time, create_by, update_by, update_time) FROM stdin;
\.


--
-- TOC entry 4865 (class 0 OID 17296)
-- Dependencies: 220
-- Data for Name: store_book; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.store_book (store_id, book_id) FROM stdin;
\.


--
-- TOC entry 4903 (class 0 OID 0)
-- Dependencies: 217
-- Name: db_author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_author_id_seq', 1, false);


--
-- TOC entry 4904 (class 0 OID 0)
-- Dependencies: 215
-- Name: db_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_book_id_seq', 1, false);


--
-- TOC entry 4905 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_store_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_store_id_seq', 1, false);


--
-- TOC entry 4714 (class 2606 OID 17281)
-- Name: db_author db_author_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_author
    ADD CONSTRAINT db_author_pk PRIMARY KEY (id);


--
-- TOC entry 4710 (class 2606 OID 17270)
-- Name: db_book db_book_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book
    ADD CONSTRAINT db_book_pk PRIMARY KEY (id);


--
-- TOC entry 4712 (class 2606 OID 17272)
-- Name: db_book db_book_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book
    ADD CONSTRAINT db_book_unique UNIQUE (book_code);


--
-- TOC entry 4716 (class 2606 OID 17307)
-- Name: db_store db_store_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_store
    ADD CONSTRAINT db_store_pk PRIMARY KEY (id);


-- Completed on 2024-07-08 14:03:25

--
-- PostgreSQL database dump complete
--

