CREATE TABLE "postest"."book" (
  "id" int4 NOT NULL DEFAULT nextval('"postest".book_id_seq'::regclass),
  "isbn" varchar(50) COLLATE "pg_catalog"."default",
  "title" varchar(50) COLLATE "pg_catalog"."default",
  "book_type" varchar(20) COLLATE "pg_catalog"."default",
  "author" varchar(20) COLLATE "pg_catalog"."default",
  "description" varchar(200) COLLATE "pg_catalog"."default",
  "cover" varchar(100) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6) NOT NULL DEFAULT now(),
  "update_time" timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT "book_pkey" PRIMARY KEY ("id")
)
;

ALTER TABLE "postest"."book"
  OWNER TO "ll";

