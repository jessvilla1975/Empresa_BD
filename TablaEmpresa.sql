PGDMP      !                {            empresa    16.0    16.0 	    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16759    empresa    DATABASE     z   CREATE DATABASE empresa WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE empresa;
                postgres    false            �            1259    16765    cliente    TABLE        CREATE TABLE public.cliente (
    id integer NOT NULL,
    nombre character varying(50),
    telefono character varying(15)
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    16760 	   empleados    TABLE     �   CREATE TABLE public.empleados (
    nombre character varying(255) NOT NULL,
    apellido character varying(255) NOT NULL,
    puesto character varying(255) NOT NULL
);
    DROP TABLE public.empleados;
       public         heap    postgres    false            �          0    16765    cliente 
   TABLE DATA           7   COPY public.cliente (id, nombre, telefono) FROM stdin;
    public          postgres    false    216   Y       �          0    16760 	   empleados 
   TABLE DATA           =   COPY public.empleados (nombre, apellido, puesto) FROM stdin;
    public          postgres    false    215   �                  2606    16769    cliente cliente_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    216            �   c   x�3��*M�S8��(�����T���؄ˈ�7����D�Û��f�\Ɯ���řɉ
a�99�`	c#S3.������xJbNj1X���Ҝ+F��� ux      �   G   x��*M��8��(���=�(5�$��7����DN�Ûs���y�9��%�\�)���@
H$r�s��qqq @j     