--liquibase formatted sql

--changeset alber:20221103_create_drone_id_seq_table_and_seq
CREATE SEQUENCE IF NOT EXISTS public.drone_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.drone_id_sequence
    OWNER TO ${user_owner};

CREATE TABLE IF NOT EXISTS public.drone
(
    id bigint NOT NULL DEFAULT nextval('drone_id_sequence'::regclass),
    serial_number character varying(100) COLLATE pg_catalog."default" NOT NULL,
    model character varying(50) COLLATE pg_catalog."default" NOT NULL,
    drone_state character varying(50) COLLATE pg_catalog."default" NOT NULL,
    weight_limit float NOT NULL,
    battery_capacity integer NOt NULL,
    created_date timestamp,
    modified_date timestamp,
    created_by character varying(100),
    modified_by character varying(100),
    marked_as_deleted boolean   default false,
    CONSTRAINT drone_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.drone
    OWNER TO ${user_owner};

--rollback drop table public.drone
--rollback drop sequence public.drone_id_sequence