--liquibase formatted sql
--changeset alber:20221103_create_medication_id_seq_table_and_seq
CREATE SEQUENCE IF NOT EXISTS public.medication_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.medication_id_sequence
    OWNER TO ${user_owner};

CREATE TABLE IF NOT EXISTS public.medication
(
    id bigint NOT NULL DEFAULT nextval('medication_id_sequence'::regclass),
    name character varying(250) COLLATE pg_catalog."default" NOT NULL,
    code character varying(250) COLLATE pg_catalog."default" NOT NULL,
    weight float NOT NULL,
    image_url character varying COLLATE pg_catalog."default",
    created_date timestamp,
    modified_date timestamp,
    created_by character varying(100),
    modified_by character varying(100),
    marked_as_deleted boolean   default false,
    CONSTRAINT medication_pkey PRIMARY KEY (id)
 )
TABLESPACE pg_default;

ALTER TABLE public.medication
    OWNER TO ${user_owner};

--rollback drop table public.medication
--rollback drop sequence public.medication_id_sequence