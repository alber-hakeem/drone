--liquibase formatted sql
--changeset alber:20221103_create_drone_medication_id_seq_table_and_seq
CREATE SEQUENCE IF NOT EXISTS public.drone_medication_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.drone_medication_id_sequence
    OWNER TO ${user_owner};

CREATE TABLE IF NOT EXISTS public.drone_medication
(
    id bigint NOT NULL DEFAULT nextval('drone_medication_id_sequence'::regclass),
    drone_id bigint NOT NULL,
    medication_id bigint NOT NULL,
    items_count int NOT NULL,
    created_date timestamp,
    modified_date timestamp,
    created_by character varying(100),
    modified_by character varying(100),
    marked_as_deleted boolean   default false,
    CONSTRAINT drone_medication_pkey PRIMARY KEY (id),
    CONSTRAINT drone_id_fk FOREIGN KEY (drone_id) REFERENCES public.drone (id),
    CONSTRAINT medication_id_fk FOREIGN KEY (medication_id) REFERENCES public.medication (id)
    )
TABLESPACE pg_default;

ALTER TABLE public.drone_medication
    OWNER TO ${user_owner};

--rollback drop table public.drone_medication
--rollback drop sequence public.drone_medication_id_sequence