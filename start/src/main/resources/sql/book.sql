--创建book_id_seq
CREATE SEQUENCE seq_book_id
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 2147483647
CACHE 1;
CREATE TABLE t_book_info (
  id int4 NOT NULL DEFAULT nextval('seq_book_id'::regclass),
  isbn character varying(50),
  title character varying(50),
  book_type character varying(20),
  author character varying(20),
  description character varying(200),
  cover character varying(100),
  create_time timestamp(6) without time zone NOT NULL DEFAULT now(),
  update_time timestamp(6) without time zone NOT NULL DEFAULT now(),
  publish_date timestamp without time zone,
  CONSTRAINT "pk_book_id" PRIMARY KEY (id)
)
;

ALTER TABLE "postest"."t_book_info"
  OWNER TO "ll";


INSERT INTO "t_book_info"("id", "isbn", "title", "book_type", "author", "description", "cover", "create_time", "update_time", "publish_date") VALUES (2, '544-7-111-46474-7', 'Java设计与实现', '计算机', '匿名', '从源码角度解析的基础架构，设计原理和工作机制。', NULL, '2019-02-01 16:28:03.559628', '2019-02-01 16:28:03.559628', '2019-04-01');
INSERT INTO "t_book_info"("id", "isbn", "title", "book_type", "author", "description", "cover", "create_time", "update_time", "publish_date") VALUES (1, '978-7-111-46474-7', 'Redis设计与实现', '计算机类', '黄建宏', '从源码角度解析redis的基础架构，设计原理和工作机制。', NULL, '2019-02-01 16:22:33.606681', '2019-02-01 16:22:33.606681', '2019-03-28');