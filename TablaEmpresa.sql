PGDMP  (    *                {            empresa    16.0    16.0 4               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            	           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            
           1262    16759    empresa    DATABASE     z   CREATE DATABASE empresa WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE empresa;
                postgres    false            �            1259    17693    cliente    TABLE        CREATE TABLE public.cliente (
    id integer NOT NULL,
    nombre character varying(50),
    telefono character varying(15)
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    17708    colegio    TABLE     e   CREATE TABLE public.colegio (
    id integer NOT NULL,
    nombre character varying(255) NOT NULL
);
    DROP TABLE public.colegio;
       public         heap    postgres    false            �            1259    17908 	   descuenta    TABLE     }   CREATE TABLE public.descuenta (
    codigo_fact character varying(20) NOT NULL,
    codigo character varying(50) NOT NULL
);
    DROP TABLE public.descuenta;
       public         heap    postgres    false            �            1259    17737 
   inventario    TABLE     �   CREATE TABLE public.inventario (
    codigo character varying(50) NOT NULL,
    cantidad_existente integer,
    descripcion character varying(255) NOT NULL
);
    DROP TABLE public.inventario;
       public         heap    postgres    false            �            1259    17752    materia    TABLE     �   CREATE TABLE public.materia (
    codigo integer NOT NULL,
    tipo character varying(50),
    descripcion character varying(255),
    cantidad_exist integer,
    unidad_medida character varying(50)
);
    DROP TABLE public.materia;
       public         heap    postgres    false            �            1259    17698    pedido    TABLE       CREATE TABLE public.pedido (
    num_pedido integer NOT NULL,
    id_cliente integer NOT NULL,
    estado character varying(50) NOT NULL,
    abono double precision NOT NULL,
    fecha_encargo date NOT NULL,
    fecha_entrega date,
    articulo character varying(50) NOT NULL
);
    DROP TABLE public.pedido;
       public         heap    postgres    false            �            1259    17725    producto_terminado    TABLE     G  CREATE TABLE public.producto_terminado (
    codigo character varying(50) NOT NULL,
    num_pedido integer,
    descripcion character varying(255),
    cantidad_existente integer,
    sexo character varying(50),
    precio_venta double precision NOT NULL,
    talla character varying(10),
    medidas character varying(255)
);
 &   DROP TABLE public.producto_terminado;
       public         heap    postgres    false            �            1259    17747 	   proveedor    TABLE     �   CREATE TABLE public.proveedor (
    nit integer NOT NULL,
    nombre character varying(25),
    nom_contacto character varying(25),
    telefono character varying(20),
    direccion character varying(25)
);
    DROP TABLE public.proveedor;
       public         heap    postgres    false            �            1259    17923 
   suministra    TABLE     l   CREATE TABLE public.suministra (
    nit_proveedor integer NOT NULL,
    codigo_materia integer NOT NULL
);
    DROP TABLE public.suministra;
       public         heap    postgres    false            �            1259    26095    uniforme    TABLE     
  CREATE TABLE public.uniforme (
    codigo character varying(50) NOT NULL,
    id_colegio integer NOT NULL,
    tipo character varying(255) NOT NULL,
    caracteristicas character varying(255),
    codigo_prod character varying(50) DEFAULT NULL::character varying
);
    DROP TABLE public.uniforme;
       public         heap    postgres    false            �            1259    17938    utiliza    TABLE     o   CREATE TABLE public.utiliza (
    cod_prod character varying(50) NOT NULL,
    cod_materia integer NOT NULL
);
    DROP TABLE public.utiliza;
       public         heap    postgres    false            �            1259    17953    venta    TABLE     �   CREATE TABLE public.venta (
    codigo_fact character varying(20) NOT NULL,
    num_pedido integer NOT NULL,
    id_cliente integer,
    monto_final double precision
);
    DROP TABLE public.venta;
       public         heap    postgres    false            �          0    17693    cliente 
   TABLE DATA           7   COPY public.cliente (id, nombre, telefono) FROM stdin;
    public          postgres    false    215   A       �          0    17708    colegio 
   TABLE DATA           -   COPY public.colegio (id, nombre) FROM stdin;
    public          postgres    false    217   �A                  0    17908 	   descuenta 
   TABLE DATA           8   COPY public.descuenta (codigo_fact, codigo) FROM stdin;
    public          postgres    false    222   �A       �          0    17737 
   inventario 
   TABLE DATA           M   COPY public.inventario (codigo, cantidad_existente, descripcion) FROM stdin;
    public          postgres    false    219   B       �          0    17752    materia 
   TABLE DATA           [   COPY public.materia (codigo, tipo, descripcion, cantidad_exist, unidad_medida) FROM stdin;
    public          postgres    false    221   oB       �          0    17698    pedido 
   TABLE DATA           o   COPY public.pedido (num_pedido, id_cliente, estado, abono, fecha_encargo, fecha_entrega, articulo) FROM stdin;
    public          postgres    false    216   �B       �          0    17725    producto_terminado 
   TABLE DATA           �   COPY public.producto_terminado (codigo, num_pedido, descripcion, cantidad_existente, sexo, precio_venta, talla, medidas) FROM stdin;
    public          postgres    false    218   qC       �          0    17747 	   proveedor 
   TABLE DATA           S   COPY public.proveedor (nit, nombre, nom_contacto, telefono, direccion) FROM stdin;
    public          postgres    false    220   D                 0    17923 
   suministra 
   TABLE DATA           C   COPY public.suministra (nit_proveedor, codigo_materia) FROM stdin;
    public          postgres    false    223   kD                 0    26095    uniforme 
   TABLE DATA           Z   COPY public.uniforme (codigo, id_colegio, tipo, caracteristicas, codigo_prod) FROM stdin;
    public          postgres    false    226   �D                 0    17938    utiliza 
   TABLE DATA           8   COPY public.utiliza (cod_prod, cod_materia) FROM stdin;
    public          postgres    false    224   E                 0    17953    venta 
   TABLE DATA           Q   COPY public.venta (codigo_fact, num_pedido, id_cliente, monto_final) FROM stdin;
    public          postgres    false    225   CE       G           2606    17697    cliente cliente_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    215            K           2606    17712    colegio colegio_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.colegio
    ADD CONSTRAINT colegio_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.colegio DROP CONSTRAINT colegio_pkey;
       public            postgres    false    217            U           2606    17912    descuenta descuenta_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.descuenta
    ADD CONSTRAINT descuenta_pkey PRIMARY KEY (codigo_fact, codigo);
 B   ALTER TABLE ONLY public.descuenta DROP CONSTRAINT descuenta_pkey;
       public            postgres    false    222    222            O           2606    17741    inventario inventario_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.inventario
    ADD CONSTRAINT inventario_pkey PRIMARY KEY (codigo);
 D   ALTER TABLE ONLY public.inventario DROP CONSTRAINT inventario_pkey;
       public            postgres    false    219            S           2606    17756    materia materia_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.materia
    ADD CONSTRAINT materia_pkey PRIMARY KEY (codigo);
 >   ALTER TABLE ONLY public.materia DROP CONSTRAINT materia_pkey;
       public            postgres    false    221            I           2606    17702    pedido pedido_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (num_pedido);
 <   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_pkey;
       public            postgres    false    216            M           2606    17731 *   producto_terminado producto_terminado_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.producto_terminado
    ADD CONSTRAINT producto_terminado_pkey PRIMARY KEY (codigo);
 T   ALTER TABLE ONLY public.producto_terminado DROP CONSTRAINT producto_terminado_pkey;
       public            postgres    false    218            Q           2606    17751    proveedor proveedor_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.proveedor
    ADD CONSTRAINT proveedor_pkey PRIMARY KEY (nit);
 B   ALTER TABLE ONLY public.proveedor DROP CONSTRAINT proveedor_pkey;
       public            postgres    false    220            W           2606    17927    suministra suministra_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.suministra
    ADD CONSTRAINT suministra_pkey PRIMARY KEY (nit_proveedor, codigo_materia);
 D   ALTER TABLE ONLY public.suministra DROP CONSTRAINT suministra_pkey;
       public            postgres    false    223    223            ]           2606    26102    uniforme uniforme_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.uniforme
    ADD CONSTRAINT uniforme_pkey PRIMARY KEY (codigo);
 @   ALTER TABLE ONLY public.uniforme DROP CONSTRAINT uniforme_pkey;
       public            postgres    false    226            Y           2606    17942    utiliza utiliza_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.utiliza
    ADD CONSTRAINT utiliza_pkey PRIMARY KEY (cod_prod, cod_materia);
 >   ALTER TABLE ONLY public.utiliza DROP CONSTRAINT utiliza_pkey;
       public            postgres    false    224    224            [           2606    17957    venta venta_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (codigo_fact);
 :   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_pkey;
       public            postgres    false    225            a           2606    17918    descuenta descuenta_codigo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.descuenta
    ADD CONSTRAINT descuenta_codigo_fkey FOREIGN KEY (codigo) REFERENCES public.inventario(codigo) ON UPDATE CASCADE ON DELETE CASCADE;
 I   ALTER TABLE ONLY public.descuenta DROP CONSTRAINT descuenta_codigo_fkey;
       public          postgres    false    219    4687    222            `           2606    17742 !   inventario inventario_codigo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.inventario
    ADD CONSTRAINT inventario_codigo_fkey FOREIGN KEY (codigo) REFERENCES public.producto_terminado(codigo) ON DELETE CASCADE;
 K   ALTER TABLE ONLY public.inventario DROP CONSTRAINT inventario_codigo_fkey;
       public          postgres    false    218    219    4685            ^           2606    17703    pedido pedido_id_cliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.pedido
    ADD CONSTRAINT pedido_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id) ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.pedido DROP CONSTRAINT pedido_id_cliente_fkey;
       public          postgres    false    215    216    4679            _           2606    17732 5   producto_terminado producto_terminado_num_pedido_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto_terminado
    ADD CONSTRAINT producto_terminado_num_pedido_fkey FOREIGN KEY (num_pedido) REFERENCES public.pedido(num_pedido) ON DELETE CASCADE;
 _   ALTER TABLE ONLY public.producto_terminado DROP CONSTRAINT producto_terminado_num_pedido_fkey;
       public          postgres    false    216    4681    218            b           2606    17933 )   suministra suministra_codigo_materia_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.suministra
    ADD CONSTRAINT suministra_codigo_materia_fkey FOREIGN KEY (codigo_materia) REFERENCES public.materia(codigo) ON UPDATE CASCADE ON DELETE CASCADE;
 S   ALTER TABLE ONLY public.suministra DROP CONSTRAINT suministra_codigo_materia_fkey;
       public          postgres    false    221    223    4691            c           2606    17928 (   suministra suministra_nit_proveedor_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.suministra
    ADD CONSTRAINT suministra_nit_proveedor_fkey FOREIGN KEY (nit_proveedor) REFERENCES public.proveedor(nit) ON UPDATE CASCADE ON DELETE CASCADE;
 R   ALTER TABLE ONLY public.suministra DROP CONSTRAINT suministra_nit_proveedor_fkey;
       public          postgres    false    223    4689    220            h           2606    26108 "   uniforme uniforme_codigo_prod_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.uniforme
    ADD CONSTRAINT uniforme_codigo_prod_fkey FOREIGN KEY (codigo_prod) REFERENCES public.producto_terminado(codigo) ON UPDATE CASCADE ON DELETE CASCADE;
 L   ALTER TABLE ONLY public.uniforme DROP CONSTRAINT uniforme_codigo_prod_fkey;
       public          postgres    false    218    4685    226            i           2606    26103 !   uniforme uniforme_id_colegio_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.uniforme
    ADD CONSTRAINT uniforme_id_colegio_fkey FOREIGN KEY (id_colegio) REFERENCES public.colegio(id) ON UPDATE CASCADE ON DELETE CASCADE;
 K   ALTER TABLE ONLY public.uniforme DROP CONSTRAINT uniforme_id_colegio_fkey;
       public          postgres    false    217    4683    226            d           2606    17948     utiliza utiliza_cod_materia_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.utiliza
    ADD CONSTRAINT utiliza_cod_materia_fkey FOREIGN KEY (cod_materia) REFERENCES public.materia(codigo) ON UPDATE CASCADE ON DELETE CASCADE;
 J   ALTER TABLE ONLY public.utiliza DROP CONSTRAINT utiliza_cod_materia_fkey;
       public          postgres    false    224    4691    221            e           2606    17943    utiliza utiliza_cod_prod_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.utiliza
    ADD CONSTRAINT utiliza_cod_prod_fkey FOREIGN KEY (cod_prod) REFERENCES public.producto_terminado(codigo) ON UPDATE CASCADE ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.utiliza DROP CONSTRAINT utiliza_cod_prod_fkey;
       public          postgres    false    224    218    4685            f           2606    17963    venta venta_id_cliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id) ON UPDATE CASCADE ON DELETE CASCADE;
 E   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_id_cliente_fkey;
       public          postgres    false    225    215    4679            g           2606    17958    venta venta_num_pedido_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_num_pedido_fkey FOREIGN KEY (num_pedido) REFERENCES public.pedido(num_pedido) ON UPDATE CASCADE ON DELETE CASCADE;
 E   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_num_pedido_fkey;
       public          postgres    false    216    225    4681            �   �   x�3�t�KTpO,J>�6����T���܌˄3 5�(_!(?�������*�����!�)�ObiQ��obQ��yP)S3s.3N�Ģ��b����3�R@M��9=��Rs�o΅J��rYXrz�sZZr��qqq ��*$      �   7   x�3�t��IM��Wp�2��]�L�lW.38ۍ��v���J-.�LN,����� I�u             x�s3�1����� c      �   E   x�1�4�t�H,,M-I�
1��tN��,�pMA����D0���JM�+�*(140�4�L�=... �       �   G   x�350������
e�E)�Ŝ���!�I��\�&�!�9�`B!%U!�41�(���؀�7������� ��      �   �   x�M�=� �gs�^��6?!�%[��AUR��_1UD��Yz�:p�(�o�^��ADy��΢��0�TsY2�������Б�X� A�����n.%X�R9;IG�*�TC�f�V6{�0�E���mG�sQ�H�F�����v�cĖbG���cF[B�      �   �   x�]��
�0����]��\�YgSJ�.�9B�-Xۨ�ﱛ^��0_�[m���Z���h�{.0^K8���i��N�C��6�.�0�C�0�����Q�葦2��gAX�1�c� �����et'� R�Z)�q�,@      �   V   x�3�I�I,VHIUpN��LIL�t��+IL.�7�4�N�̢����Û�L8��K��R��/,�L�/�k1�4�$-&\1z\\\ ?�!�            x�3�450�2�&\1z\\\ )g         o   x�5�4�tI-�/*�,���KM/�����<���$�H7��Z�?�PNN��Ģ�|N��ļ�|]ǜ���Û�t��9J�J-,9-a��Jst}�u�3A&��qqq �#4         "   x�1�450�
1�&\%�`�=... e\�            x�s3�440�4�41 �=... )�\     