--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

-- Started on 2024-12-31 14:26:40

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

DROP DATABASE db_quarkus;
--
-- TOC entry 4933 (class 1262 OID 16389)
-- Name: db_quarkus; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE db_quarkus WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Chinese (Simplified)_China.936';


ALTER DATABASE db_quarkus OWNER TO postgres;

\connect db_quarkus

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
-- TOC entry 4934 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 217 (class 1259 OID 16448)
-- Name: author_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.author_book (
    author_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE public.author_book OWNER TO postgres;

--
-- TOC entry 4935 (class 0 OID 0)
-- Dependencies: 217
-- Name: TABLE author_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.author_book IS '作者图书管理表';


--
-- TOC entry 218 (class 1259 OID 16451)
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
-- TOC entry 4936 (class 0 OID 0)
-- Dependencies: 218
-- Name: TABLE db_author; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_author IS '作者信息表';


--
-- TOC entry 4937 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.username; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.username IS '名称';


--
-- TOC entry 4938 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.age; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.age IS '年龄';


--
-- TOC entry 4939 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.gender; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.gender IS '性别';


--
-- TOC entry 4940 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.address; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.address IS '住址';


--
-- TOC entry 4941 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.create_time IS '创建时间';


--
-- TOC entry 4942 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.create_by IS '创建人';


--
-- TOC entry 4943 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.update_by IS '更新人';


--
-- TOC entry 4944 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN db_author.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_author.update_time IS '更新时间';


--
-- TOC entry 219 (class 1259 OID 16456)
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
-- TOC entry 4945 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_author_id_seq OWNED BY public.db_author.id;


--
-- TOC entry 220 (class 1259 OID 16457)
-- Name: db_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.db_book (
    id bigint NOT NULL,
    book_name character varying NOT NULL,
    book_code character varying NOT NULL,
    create_time timestamp without time zone NOT NULL,
    create_by character varying,
    update_by character varying,
    update_time timestamp without time zone NOT NULL
);


ALTER TABLE public.db_book OWNER TO postgres;

--
-- TOC entry 4946 (class 0 OID 0)
-- Dependencies: 220
-- Name: TABLE db_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_book IS '图书信息表';


--
-- TOC entry 4947 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.book_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.book_name IS '图书名称';


--
-- TOC entry 4948 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.book_code; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.book_code IS 'ISBN';


--
-- TOC entry 4949 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.create_time IS '上架时间';


--
-- TOC entry 4950 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.create_by IS '创建人';


--
-- TOC entry 4951 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.update_by IS '更新人';


--
-- TOC entry 4952 (class 0 OID 0)
-- Dependencies: 220
-- Name: COLUMN db_book.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_book.update_time IS '更新时间';


--
-- TOC entry 221 (class 1259 OID 16462)
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
-- TOC entry 4953 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_book_id_seq OWNED BY public.db_book.id;


--
-- TOC entry 222 (class 1259 OID 16463)
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
-- TOC entry 4954 (class 0 OID 0)
-- Dependencies: 222
-- Name: TABLE db_store; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.db_store IS '图书信息表';


--
-- TOC entry 4955 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.store_name; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.store_name IS '书店名称';


--
-- TOC entry 4956 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.create_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.create_time IS '创建时间';


--
-- TOC entry 4957 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.create_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.create_by IS '创建人';


--
-- TOC entry 4958 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.update_by; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.update_by IS '更新人';


--
-- TOC entry 4959 (class 0 OID 0)
-- Dependencies: 222
-- Name: COLUMN db_store.update_time; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.db_store.update_time IS '更新时间';


--
-- TOC entry 223 (class 1259 OID 16468)
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
-- TOC entry 4960 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_store_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.db_store_id_seq OWNED BY public.db_store.id;


--
-- TOC entry 224 (class 1259 OID 16469)
-- Name: store_book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.store_book (
    store_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE public.store_book OWNER TO postgres;

--
-- TOC entry 4961 (class 0 OID 0)
-- Dependencies: 224
-- Name: TABLE store_book; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.store_book IS '书店图书关联表';


--
-- TOC entry 4760 (class 2604 OID 16472)
-- Name: db_author id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_author ALTER COLUMN id SET DEFAULT nextval('public.db_author_id_seq'::regclass);


--
-- TOC entry 4761 (class 2604 OID 16473)
-- Name: db_book id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book ALTER COLUMN id SET DEFAULT nextval('public.db_book_id_seq'::regclass);


--
-- TOC entry 4762 (class 2604 OID 16474)
-- Name: db_store id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_store ALTER COLUMN id SET DEFAULT nextval('public.db_store_id_seq'::regclass);


--
-- TOC entry 4920 (class 0 OID 16448)
-- Dependencies: 217
-- Data for Name: author_book; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.author_book VALUES (1, 4);


--
-- TOC entry 4921 (class 0 OID 16451)
-- Dependencies: 218
-- Data for Name: db_author; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_author VALUES (1, '风起闲云', 20, 'MAN', NULL, '2024-12-27 15:43:25.443634', '111', NULL, '2024-12-27 15:50:55.078873');


--
-- TOC entry 4923 (class 0 OID 16457)
-- Dependencies: 220
-- Data for Name: db_book; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.db_book VALUES (4, '超凡入圣', '111', '2024-12-27 15:50:55.086516', '111', NULL, '2024-12-27 15:50:55.085512');


--
-- TOC entry 4925 (class 0 OID 16463)
-- Dependencies: 222
-- Data for Name: db_store; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4927 (class 0 OID 16469)
-- Dependencies: 224
-- Data for Name: store_book; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4962 (class 0 OID 0)
-- Dependencies: 219
-- Name: db_author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_author_id_seq', 1, true);


--
-- TOC entry 4963 (class 0 OID 0)
-- Dependencies: 221
-- Name: db_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_book_id_seq', 4, true);


--
-- TOC entry 4964 (class 0 OID 0)
-- Dependencies: 223
-- Name: db_store_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.db_store_id_seq', 1, false);


--
-- TOC entry 4764 (class 2606 OID 16496)
-- Name: author_book author_book_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.author_book
    ADD CONSTRAINT author_book_pk PRIMARY KEY (author_id, book_id);


--
-- TOC entry 4766 (class 2606 OID 16476)
-- Name: db_author db_author_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_author
    ADD CONSTRAINT db_author_pk PRIMARY KEY (id);


--
-- TOC entry 4768 (class 2606 OID 16478)
-- Name: db_book db_book_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book
    ADD CONSTRAINT db_book_pk PRIMARY KEY (id);


--
-- TOC entry 4770 (class 2606 OID 16480)
-- Name: db_book db_book_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_book
    ADD CONSTRAINT db_book_unique UNIQUE (book_code);


--
-- TOC entry 4772 (class 2606 OID 16482)
-- Name: db_store db_store_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.db_store
    ADD CONSTRAINT db_store_pk PRIMARY KEY (id);


--
-- TOC entry 4774 (class 2606 OID 16498)
-- Name: store_book store_book_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.store_book
    ADD CONSTRAINT store_book_pk PRIMARY KEY (store_id, book_id);


-- Completed on 2024-12-31 14:26:40

--
-- PostgreSQL database dump complete
--

